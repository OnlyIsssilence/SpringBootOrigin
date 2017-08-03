package com.onlyisssilence.muya.controller;

import com.onlyisssilence.muya.entity.User;
import com.onlyisssilence.muya.entity.UserDTO;
import com.onlyisssilence.muya.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelmapper.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MuYa
 * Date: 2017-08-02
 * Time: 下午 10:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ModelMapperTest {

    /**
     * 简单类-类转换
     */
    @Test
    public void testModelToDTO() {
        User user = new User();
        user.setId(1);
        user.setNickName("张三");
        user.setEmail("101@qq.com");
        user.setHonnr("测试荣誉");

        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName("张三");
        userEntity.setGrandPaName("爷爷");
        userEntity.setLastName("李四");
        ModelMapper modelMapper = new ModelMapper();
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        modelMapper.map(userEntity,userDTO);
        System.out.println(userDTO);
    }

    /**
     * 简单类到类自定义字段
     */
    @Test
    public void testModelToDTOByDe(){
        User user = new User();
        user.setId(1);
        user.setNickName("张三");
        user.setEmail("101@qq.com");
        user.setHonnr("测试荣誉");
        user.setLastName("ming");
        ModelMapper modelMapper = new ModelMapper();

        //转换内容提供者
        Provider<String> personProvider = new AbstractProvider<String>() {
            public String get() {
                return "自定义提供者";
            }
        };
        //创建自定义转换规则
        Converter<String, String> toUppercase = new AbstractConverter<String, String>() {
            protected String convert(String source) {
                System.out.println(source);
                return source == null ? null : source.toUpperCase();
            }
        };
        //创建自定义条件转换
        Condition<Integer,?> gt2 = context -> {
            System.out.println(context.getSource());
            return context.getSource() > 2;
        };
        //创建自定义映射规则
        PropertyMap<User,UserDTO> propertyMap = new PropertyMap<User, UserDTO>() {
            @Override
            protected void configure() {
                using(toUppercase).map(source.getNickName(),destination.getHonnr());//使用自定义转换规则
                with(personProvider).map(source.getHonnr(),destination.getNickName());//使用自定义属性提供覆盖
                map(source.getLastName()).setLastName(null);//主动替换属性
                skip(destination.getEmail());
                when(gt2).map().setId(1);//过滤属性
            }
        };
        //添加映射器
        modelMapper.addMappings(propertyMap);
        modelMapper.validate();
        //转换
        UserDTO userDTO = modelMapper.map(user,UserDTO.class);
        System.out.println(userDTO);
    }

    /*分析下:
    Provider,Converter,Condition三个都算是转换前奏,所有的转换规则都是在PropertyMap里面配置.所以分析这个里面的配置即可.
    1.using(toUppercase).map(source.getNickname(),destination.getHonor());//使用自定义转换规则
    首先toUppercase是一个Converter,也就是sources的nickname会经过这个转换器,然后才设置到destination的honor中.
    2.with(personProvider).map(source.getHonor(),destination.getNickname());//使用自定义属性提供覆盖
    personProvider类似一个Bean工厂,当使用这个的时候,对于sources调用getHonor()的时候实际上是调用personProvider的get方法.
    所以结果nickname='自定义提供者'
    3.map(source.getAvatar()).setAvatar(null);//主动替换属性
    可以主动重设某些属性
    4.skip(destination.getEmail());
    过滤指定属性
    5.when(gt2).map().setId(1L);//条件过滤属性
    条件过滤属性,当满足gt2的时候才会调用setId方法.
    */


}
