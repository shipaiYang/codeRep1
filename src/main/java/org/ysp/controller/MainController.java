package org.ysp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author pai
 * @date 2019/9/3
 */
@Controller
@RequestMapping("/main")
public class MainController {
    @RequestMapping("/index.do")
    public String showIndexPage(){
        return "index";
    }
}
