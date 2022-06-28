package com.surecloud.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( "/" )
public class HelloworldController
{
    @ResponseBody
    @GetMapping
    public String getHello()
    {
        return "Hello World";
    }
}
