package com.example.deploy1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {


    @GetMapping("/health")
    public ResponseEntity<String> health(){
        return  ResponseEntity.ok().body(" success ok");
    }
}
