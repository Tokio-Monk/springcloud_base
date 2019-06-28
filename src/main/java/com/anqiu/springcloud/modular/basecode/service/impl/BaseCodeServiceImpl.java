package com.anqiu.springcloud.modular.basecode.service.impl;

import com.anqiu.springcloud.modular.basecode.entity.BaseCode;
import com.anqiu.springcloud.modular.basecode.mapper.BaseCodeMapper;
import com.anqiu.springcloud.modular.basecode.service.IBaseCodeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * BaseCodeServiceImpl.java
 *
 * @author anqiu
 * @version 1.0
 * @Title: 基础表代码 服务实现类
 * @Description:
 * @Copyright: winlu
 * @Company: 云路网络
 * @date 2019/6/28 17:44
 */
@Service
public class BaseCodeServiceImpl extends ServiceImpl<BaseCodeMapper, BaseCode> implements IBaseCodeService {
}
