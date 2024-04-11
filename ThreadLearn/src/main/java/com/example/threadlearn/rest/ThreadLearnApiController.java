package com.example.threadlearn.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ThreadLearnApiController {
    @GetMapping("/demo-thread/running-multithread")
    public void running(){
        System.out.println("Thread is start running ...... hello chạy thử xem pussh được không" + LocalDateTime.now());
        System.out.println("Thread is off");
    }
}
