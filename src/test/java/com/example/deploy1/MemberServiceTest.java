package com.example.deploy1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class MemberServiceTest {

    @Autowired
    MemberService service;

    @Test
     public void teste(){

        int size =service.getMemberList().size();
        assertTrue( size >1);

     }
}