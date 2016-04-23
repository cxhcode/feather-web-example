package com.cxh.web.feather.web;

import org.feather4j.framework.annotation.Action;
import org.feather4j.framework.annotation.Controller;
import org.feather4j.framework.annotation.Inject;
import org.feather4j.framework.bean.Data;
import org.feather4j.framework.bean.Param;
import org.feather4j.framework.bean.View;

import java.util.HashMap;

/**
 * Created by Jackie on 2015/11/26.
 * Email : chenxinhua@ishehui.com
 */
@Controller
public class TestController {

    @Inject
    private MyService myService;

    @Action(value = "GET:/testJson")
    public Data test(Param param) {
        param.getParamMap().forEach((s, o) -> {
            System.out.println("s = " + s);
            System.out.println("o = " + o);
        });
        myService.helloWorld();
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("hello", "world");
        stringStringHashMap.put("jackie", "chan");
        return new Data(stringStringHashMap);
    }

    @Action(value = "GET:/testJsp")
    public View testJsp(Param param) {
        param.getParamMap().forEach((s, o) -> {
            System.out.println("s = " + s);
            System.out.println("o = " + o);
        });
        myService.helloWorld();
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("hello", "world");
        stringStringHashMap.put("jackie", "chan");
        View view = new View("test");
        view.addModel("hello", "world");
        view.addModel("jackie", "chan");
        return view;
    }

}
