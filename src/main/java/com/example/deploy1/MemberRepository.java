package com.example.deploy1;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {

/*
    Page<Member> findByNameContaining(String name, Pageable pageable);
    List<Member> findByNameContaining(String name );


    @Query("SELECT m  FROM Member  m   WHERE m.name = :name AND m.pw = :pw")
    List<Member> findBy22222(@Param("name") String name, @Param("pw") String password);
*/
}