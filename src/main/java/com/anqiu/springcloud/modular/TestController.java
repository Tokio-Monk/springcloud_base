package com.anqiu.springcloud.modular;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController.java
 *
 * @author anqiu
 * @version 1.0
 * @Title: 测试controller
 * @Description:
 * @Copyright: winlu
 * @Company: 云路网络
 * @date 2019/6/28 16:39
 */
@RestController
public class TestController {

    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Hello World！";
    }
}
