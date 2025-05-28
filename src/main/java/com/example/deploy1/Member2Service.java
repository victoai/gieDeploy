package com.example.deploy1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Member2Service {

    @Autowired

    Member2Repository repository;


    public List<Member2> getMemberList(){
        return  repository.selectAll();
    }
}
