package com.edsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yusuf on 12.11.2016.
 */
@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/home"})
    public String getHomePage() {
        return "index";
    }
}
