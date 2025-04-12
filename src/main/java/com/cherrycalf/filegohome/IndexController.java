package com.cherrycalf.filegohome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页控制器
 *
 * @author pan_junbiao
 **/
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String test3() {
        return "index";
    }
}