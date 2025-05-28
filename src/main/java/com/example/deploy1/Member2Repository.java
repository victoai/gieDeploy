package com.example.deploy1;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Member2Repository {


    @Autowired
    SqlSession session;


    public List<Member2> selectAll(){
        return  session.selectList("a.selectAll");
    }


}
