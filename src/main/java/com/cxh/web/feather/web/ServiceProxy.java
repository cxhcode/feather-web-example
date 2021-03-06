package com.cxh.web.feather.web;

import org.feather4j.framework.annotation.Aspect;
import org.feather4j.framework.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * Created by Jackie on 2015/12/8.
 * Email : chenxinhua@ishehui.com
 */
@Aspect(Service.class)
public class ServiceProxy extends org.feather4j.framework.proxy.AspectProxy {
    private static final Logger logger = LoggerFactory.getLogger(ServiceProxy.class);

    private long begin;

    @Override
    public void before(Class<?> targetClass, Method targetMethod, Object[] methodParams) {
        logger.debug("-------------------------method begin-------------------------");
        logger.debug("class name : {}", targetClass.getName());
        logger.debug("method name : {}", targetMethod.getName());
        begin = System.currentTimeMillis();
    }


    @Override
    public void after(Class<?> targetClass, Method targetMethod, Object[] methodParams, Object result) {
        logger.debug(String.format("time : %dms", System.currentTimeMillis() - begin));
        logger.debug("-------------------------method end---------------------------");
    }
}
