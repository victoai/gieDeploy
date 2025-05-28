package com.example.deploy1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class Member2ServiceTest {

    @Autowired
    Member2Service service;


    @Test
    public  void test(){
        int size  =service.getMemberList().size();
    }
}