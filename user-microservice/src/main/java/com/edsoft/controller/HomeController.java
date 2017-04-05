package com.edsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yusuf on 13.11.2016.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage() {
        return "index";
    }
}
