package com.example.deploy1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    MemberService service;

    @GetMapping("/memberList")
    public  String   getMembers(Model model){

        List<Member> list  = service.getMemberList();
        model.addAttribute("list", list);
        return "memberList";
    }
}
