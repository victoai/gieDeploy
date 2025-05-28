package com.example.deploy1;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "acorntbl")  // 테이블 이름을 acorntbl로 설정
public class Member {

    @Id
      String id;  // id 타입을 String으로 변경

      String pw;
      String name;

    // 기본 생성자
    public Member() {}

    // 모든 필드를 초기화하는 생성자
    public Member(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }

    // Getter, Setter 메서드
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
