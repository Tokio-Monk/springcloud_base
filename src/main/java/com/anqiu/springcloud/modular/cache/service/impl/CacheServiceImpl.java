package com.anqiu.springcloud.modular.cache.service.impl;

import com.anqiu.springcloud.modular.basecode.entity.BaseCode;
import com.anqiu.springcloud.modular.basecode.service.IBaseCodeService;
import com.anqiu.springcloud.modular.cache.service.CacheService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CacheServiceImpl.java
 *
 * @author anqiu
 * @version 1.0
 * @Title: 缓存服务类实现类
 * @Description:
 * @Copyright: winlu
 * @Company: 云路网络
 * @date 2019/6/28 17:27
 */
@Service
@Slf4j
public class CacheServiceImpl implements CacheService {

    @Autowired
    private IBaseCodeService baseCodeService;

    @Override
    public int loadAllData() {
        int total = 0;
        int tempCount = 0;
        //基础代码
        QueryWrapper<BaseCode> query = new QueryWrapper<>();
        query.lambda().orderByAsc(BaseCode::getCodeType).orderByAsc(BaseCode::getSequence);
        List<BaseCode> baseCodeList = baseCodeService.list(query);
        total += tempCount;
        log.info("基础代码加载{}条数据",tempCount);
        return total;
    }
}
