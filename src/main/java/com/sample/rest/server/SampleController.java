package com.sample.rest.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController
{

    @RequestMapping(value = "/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    String home()
    {
        return "{ \"id\": \"1\", \"content\": \"Hello World!\" }";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
