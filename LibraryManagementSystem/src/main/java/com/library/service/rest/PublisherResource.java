package com.library.service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherResource {

    @GetMapping("/getPublishers")
    public String getPublishers(){
        return "publishers";
    }
}