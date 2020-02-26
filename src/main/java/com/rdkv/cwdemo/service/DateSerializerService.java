package com.rdkv.cwdemo.service;

import com.rdkv.cwdemo.message.LocalDateReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DateSerializerService {

    public ResponseEntity<LocalDateReference> parseDateString(LocalDateTime localDateTime){
        LocalDateReference localDateReference = new LocalDateReference(localDateTime.getHour(),
                localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano(),
                localDateTime.getDayOfWeek().toString(), localDateTime.getDayOfMonth(),
                localDateTime.getMonth().toString(), localDateTime.getYear());
        return new ResponseEntity<>(localDateReference, new HttpHeaders(), HttpStatus.OK);
    }
}
