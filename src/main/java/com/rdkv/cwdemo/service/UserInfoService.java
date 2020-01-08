package com.rdkv.cwdemo.service;

import com.rdkv.cwdemo.exception.ConflictException;
import com.rdkv.cwdemo.message.SearchResponse;
import com.rdkv.cwdemo.model.UserInfo;
import com.rdkv.cwdemo.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    public ResponseEntity<UserInfo> addUserInformation(UserInfo userInfoRest, UriComponentsBuilder ucBuilder){
        String mobileNumber = userInfoRest.getMobileNumber();
        String otp = userInfoRest.getOtp();
        UserInfo userInfo = userInfoRepository.findUserInfoByMobile(mobileNumber);

        if(null != userInfo) {
            throw new ConflictException("Mobile", "Number", mobileNumber);
        } else {
            userInfo = new UserInfo();
            userInfo.setMobileNumber(mobileNumber);
            userInfo.setOtp(otp);
            userInfoRepository.save(userInfo);
            HttpHeaders headers = new HttpHeaders();
            headers.setLocation(ucBuilder.path("/cwdemo/user/{mobileNumber}").buildAndExpand(userInfo.getMobileNumber()).toUri());

            return new ResponseEntity<UserInfo>(userInfo, headers, HttpStatus.CREATED);
        }
    }

    public SearchResponse findUserInfoByMobile(String mobileNumber){
        UserInfo userInfo = userInfoRepository.findUserInfoByMobile(mobileNumber);
        SearchResponse searchResponse = new SearchResponse();
        if(null != userInfo){
            searchResponse.setExists(true);
        } else {
            searchResponse.setExists(false);
        }
        return searchResponse;
    }
}
