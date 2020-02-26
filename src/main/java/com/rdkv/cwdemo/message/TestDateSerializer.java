package com.rdkv.cwdemo.message;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class TestDateSerializer {
//    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) // Option 1
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
//    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS") // Option 2
    @JsonDeserialize(using = ParseDeserializer.class)
    private LocalDateTime date;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
