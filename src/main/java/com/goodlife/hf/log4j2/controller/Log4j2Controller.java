package com.goodlife.hf.log4j2.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @description: 控制类
 * @ClassName: Log4j2Controller
 * @Author: goodlife
 * @Date:
 * @Email: i_you_love@163.com
 **/

@RestController
@RequestMapping(value = "/log4j")
@Log4j2
public class Log4j2Controller {

    @RequestMapping(value = "/log",method = {RequestMethod.POST,RequestMethod.GET})
    public String log4j(String name,int num)
    {
        log.info("name ={}, num={}", name,num);
        log.info(String.format("name = %s,num=%d",name,num));
        return  "ok";
    }

    //produces = "application/json;charset=utf-8"：Represents the format of the returned data
    @PostMapping(value = "/postlog", produces = "application/json;chart=utf-8")
    public String postlog4j(String name,int num){
        log.info("name ={}, num={}", name,num);
        return "postok";
    }


    @PostMapping(value = "/postlogJson")
    public String postlog4jJson(@RequestBody Map<String,Object> reqMap){
        log.info("name ={}, num={}", reqMap.get("name"),reqMap.get("num"));
        return "postJsonOk";
    }


}
