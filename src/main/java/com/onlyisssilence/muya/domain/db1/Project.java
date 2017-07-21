package com.onlyisssilence.muya.domain.db1;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.onlyisssilence.muya.domain.view.BasicView;
import com.onlyisssilence.muya.domain.view.FatherView;

import javax.persistence.*;
import java.util.Date;

/**
 * Author: MuYa
 * Date  : 2017/7/21
 * Description:
 */
@Entity
@Table(name = "projectinfo")
public class Project {

    /**
     * Java Persistence API定义了一种定义，可以将常规的普通Java对象（有时被称作POJO）映射到数据库。
     * @EntitY: 对实体注释。对应数据库中一的个表
     * @Table: 声明此对象映射到数据库的数据表，通过它可以为实体指定表(talbe),目录(Catalog)和schema的名字.该注释不是必须的，如果没
     *          有则系统使用默认值(实体的短类名),如若上述实体类名为ProjectInfo，映射到数据库的表名为project_info
     * @区别: @Entity说明这个class是实体类，并且使用默认的orm规则，即class名即数据库表中表名，class字段名即表中的字段名如果想改变
     *          这种默认的orm规则，就要使用@Table来改变class名与数据库中表名的映射规则，@Column来改变class中字段名与db中表的字段
     *          名的映射规则.@Entity注释指名这是一个实体Bean，@Table注释指定了Entity所要映射带数据库表，其中@Table.name()用来指
     *          定映射表的表名。如果缺省@Table注释，系统默认采用类名作为映射表的表名。实体Bean的每个实例代表数据表中的一行数据，行
     *          中的一列对应实例中的一个属性。
     * @id: 定义了映射到数据库表的主键的属性,一个实体只能有一个属性被映射为主键
     * @GeneratedValue: 表示主键生成策略,有AUTO,INDENTITY,SEQUENCE 和 TABLE 4种
     * @column: 描述了数据库表中该字段的详细定义
     *          @name: 表示数据库表中该字段的名称,默认情形属性名称一致
     *          @nullable: 表示该字段是否允许为null,默认为true
     *          @unique: 表示该字段是否是唯一标识,默认为false
     *          @length: 表示该字段的大小,仅对String类型的字段有效
     *          @insertable: 表示在ORM框架执行插入操作时,该字段是否应出现INSETRT语句中,默认为true
     *          @updateable: 表示在ORM框架执行更新操作时,该字段是否应该出现在UPDATE语句中,默认为true.对于一经创建就不可以更改的字段
     *          ,该属性非常有用,如对于birthday字段.
     *          @columnDefinition: 表示该字段在数据库中的实际类型.通常ORM框架可以根据属性类型自动判断数据库中字段的类型,但是对于Date
     *          类型仍无法确定数据库中字段类型究竟是DATE,TIME还是TIMESTAMP.此外,String的默认映射类型为VARCHAR,如果要将String类
     *          型映射到特定数据库的BLOB或TEXT字段类型,该属性非常有用.
     * @Transient: 表示该属性并非一个到数据库表的字段的映射,ORM框架将忽略该属性
     *
     *
     */

    /**
     * Jackson的注解类
     *
     * @JsonIgnoreProperties: 此注解是类注解，作用是json序列化时将Java bean中的一些属性忽略掉，序列化和反序列化都受影响
     * @JsonIgnore:  此注解用于属性或者方法上（最好是属性上），作用和上面的@JsonIgnoreProperties一样
     * @JsonFormat: 此注解用于属性或者方法上（最好是属性上），可以方便的把Date类型直接转化为我们想要的模式，
     *              比如@JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
     * @JsonView: 可以过滤序列化对象的字段属性，可以使你有选择的序列化对象
     * @JsonFilter:
     *
     *
     */

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @JsonView(BasicView.class)
    private Long id;

    @Column(name = "project_id")
    @JsonView(FatherView.class)
    private String projectId;

    @Column(nullable = false)
    private String passWord;

    @JsonIgnore
    private String email;

    @JsonView(Basic.class)
    private String nickName;

    @Column(nullable = false)
    private String regTime;

    @Column(nullable = false,name = "modify_time")
    @JsonView(BasicView.class)
    private Date modifyTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonView(FatherView.class)
    private Date createtime;

    public Project() {
    }

    public Project(String projectId, String passWord, String email, String nickName, String regTime,
                   Date modifyTime, Date createtime) {
        this.projectId = projectId;
        this.passWord = passWord;
        this.email = email;
        this.nickName = nickName;
        this.regTime = regTime;
        this.modifyTime = modifyTime;
        this.createtime = createtime;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
