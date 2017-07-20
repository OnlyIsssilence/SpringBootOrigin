package com.onlyisssilence.muya.domain.db1;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MuYa
 * Date: 2017-07-18
 * Time: 上午 12:01
 */
public interface UserInfoRepository extends JpaRepository<UserInfo,Long>{
    UserInfo findByUserName(String userName);
    UserInfo findByUserNameOrEmail(String username, String email);
}
