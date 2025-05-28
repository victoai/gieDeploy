package com.example.deploy1;


import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Slf4j
@Service
public class MemberService {


    @Autowired
    MemberRepository repository;



    //조회
    public List<Member>  getMemberList(){
        List<Member> list  = repository.findAll();
        return  list;
    }


    public Member getMember(String id) {

       Member member = repository.findById( id).orElse( new Member());

       /*
        Optional<Member> optional = repository.findById(id);
        Member member = optional.orElse(new Member());  //
        */

    return  member;

    }


}
