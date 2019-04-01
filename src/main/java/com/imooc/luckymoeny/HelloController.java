package com.imooc.luckymoeny;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: DengChen
 * Date: 2019/4/1
 * Time: 12:54
 * code change the world
 */
@RestController
@RequestMapping("/hello")
public class HelloController {


    private final LimitConfig limitConfig;

    @Autowired
    public HelloController(LimitConfig limitConfig) {
        this.limitConfig = limitConfig;
    }

    //    @RequestMapping(value = "/hello",method = RequestMethod.GET) 2.0以前的老方法
    @GetMapping("/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myid) {
//        return "慕女神快来撩我";
//        return "说明： " + limitConfig.getDescription();

        return "id:" + myid;
    }
}
