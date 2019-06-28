package com.anqiu.springcloud.system;

import com.anqiu.springcloud.modular.cache.service.CacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * SystemInit.java
 *
 * @author anqiu
 * @version 1.0
 * @Title: 系统初始化执行
 * @Description:
 * @Copyright: winlu
 * @Company: 云路网络
 * @date 2019/6/28 16:54
 */
@Component
@Order(value=1)
@Slf4j
public class SystemInit implements CommandLineRunner {

    @Autowired
    private CacheService cacheService;

    @Override
    public void run(String... args) throws Exception {
        log.info(">>>>>>>>>>>>>>>start load system cache");
        int count = cacheService.loadAllData();
        log.info(">>>>>>>>>>>>>>> cache size : {} ",count);
    }
}
