package com.rdkv.cwdemo.repository;

import com.rdkv.cwdemo.model.UserInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends CrudRepository<UserInfo, String> {

    @Query("SELECT u FROM UserInfo u WHERE u.mobileNumber = ?1")
    UserInfo findUserInfoByMobile(String mobileNumber);

    @Query("SELECT u FROM UserInfo u WHERE u.otp = ?1")
    UserInfo findUserInfoByOtp(String otp);
}
