package com.sunmood.consumermovie.controller;

import com.sunmood.consumermovie.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sunmood on 2018/11/27.
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return this.restTemplate.getForObject("http://localhost:8000/" + id,User.class);
    }
}
