package com.example.deploy1;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
public class Member2 {
      String id;  // id 타입을 String으로 변경
      String pw;
      String name;

}
