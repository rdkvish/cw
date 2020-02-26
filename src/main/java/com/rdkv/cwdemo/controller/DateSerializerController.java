package com.rdkv.cwdemo.controller;

import com.rdkv.cwdemo.message.LocalDateReference;
import com.rdkv.cwdemo.message.TestDateSerializer;
import com.rdkv.cwdemo.service.DateSerializerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/cwdemo")
public class DateSerializerController {

	@Autowired
	DateSerializerService dateSerializerService;

	@PostMapping(path="/date/deserialize")
	@ResponseBody
	public ResponseEntity<LocalDateReference> parseDateString (@RequestBody TestDateSerializer testDateSerializer) {
		return dateSerializerService.parseDateString(testDateSerializer.getDate());
	}
}
