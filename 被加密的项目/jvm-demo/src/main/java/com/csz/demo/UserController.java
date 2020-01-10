package com.csz.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {


    @ResponseBody
    @RequestMapping("index/demo")
    public JaveBean index(){
        JaveBean javeBean=new JaveBean();
        javeBean.setName("csz");
        javeBean.setAge(12);
        return javeBean;
    }


}
