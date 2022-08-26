package com.gzf.practice.post;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @desciption
 * @Author geng zi fang
 * @Date 2022/8/26
 * @Version V1.0
 **/
@RestController
@RequestMapping("/sss/")
public class jenkinsTest {

    @RequestMapping(value = "/jenkinsTest1", method = RequestMethod.POST)
    public String test(@RequestBody Map requestMap){
        System.out.println("调到了");
        return "成功";
    }
}
