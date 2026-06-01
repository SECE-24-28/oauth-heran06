package com.example.FirstApi.Service;

import org.springframework.stereotype.Service;

@Service
public class helloService {
    public String greeting(){
        return "hello springboot";
    }

    public String aboutme(){
        return "this is course";
    }

    public String lect(){
        return "attend the lecture";
    }
}
