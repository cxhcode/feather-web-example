package com.cxh.web.feather.web;

import org.feather4j.framework.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Jackie on 2015/11/26.
 * Email : chenxinhua@ishehui.com
 */
@Service
public class MyService {
    private static final Logger logger = LoggerFactory.getLogger(MyService.class);
    public void helloWorld() {
        logger.info("invoke helloWorld" );
    }
}
