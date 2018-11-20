package com.gcy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
    
    @RequestMapping("/hello")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","1234");
       mv.setViewName("index");
        return mv;
    }

    @RequestMapping("/user")
    @ResponseBody
    public String user() {

        return "user1";
    }
    
}
