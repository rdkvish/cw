package com.rdkv.cwdemo.controller;

import com.rdkv.cwdemo.message.SearchResponse;
import com.rdkv.cwdemo.model.UserInfo;
import com.rdkv.cwdemo.repository.UserInfoRepository;
import com.rdkv.cwdemo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping(path="/cwdemo")
public class UserInfoController {

	@Autowired
	UserInfoService userInfoService;

	@PostMapping(path="/user")
	@ResponseBody
	public ResponseEntity<UserInfo> addNewUser (@RequestBody UserInfo userInfo, UriComponentsBuilder ucBuilder) {
		return userInfoService.addUserInformation(userInfo, ucBuilder);
	}

	@GetMapping(path="/mobile/{number}")
	public ResponseEntity<SearchResponse> checkMobileExists(@PathVariable("number") String number) {
		return userInfoService.findUserInfoByMobile(number);
	}

	@GetMapping(path="/otp/{otp}")
	public ResponseEntity<SearchResponse> checkOtpExists(@PathVariable("otp") String otp) {
		return userInfoService.findUserInfoByOtp(otp);
	}
}
