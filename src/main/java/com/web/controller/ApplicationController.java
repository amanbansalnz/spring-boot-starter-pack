package com.web.controller;

import com.web.response.ModelResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/application")
public class ApplicationController {

    private final Logger LOGGER = LoggerFactory.getLogger(ApplicationController.class);


    @GetMapping(value = "/health", produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelResponse health(){

        LOGGER.info(">>> Request: Processing orders");


        LOGGER.info("<<< Response: Processed orders");
        return new ModelResponse(true);
    }
}
