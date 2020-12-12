package com.ani_deva.springcourse.resources;

import com.ani_deva.springcourse.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Ani", "email@ani.com", "8888888", "1717171717");
        return ResponseEntity.ok().body(u);
    }
}
