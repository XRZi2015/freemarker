package com.imooc.controller;

import com.imooc.bean.Person;
import com.imooc.customMethod.SortMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * Created by Administrator on 2017/3/25.
 */
@Controller
public class IndexController {

    @RequestMapping(value="/index",method= RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView index = new ModelAndView("index");
        index.addObject("intValue",100);
        index.addObject("longValue",1000000000000L);
        index.addObject("stringValue","子望");
        index.addObject("doubleValue",5.20);
        index.addObject("booleanValue",false);
        index.addObject("dateValue",new Date());
        index.addObject("nullValue",null);
        return  index;
    }

    @RequestMapping(value="/object",method = RequestMethod.GET)
    public ModelAndView ObjectGet(){
        ModelAndView object = new ModelAndView("object");
        object.addObject("person",new Person("子望",21));
        /**
         *list
         */
        List<Object> list = new ArrayList<>();
        list.add("鞠婧祎");
        list.add("子望");
        list.add("陈都灵");
        list.add("金树彬");
        object.addObject("list",list);

        /**
         * Map
         */
        Map<String,Object> map=new HashMap<>();
        map.put("one","鞠婧祎");
        map.put("two","子望");
        map.put("three","陈都灵");
        map.put("four","金树彬");
        object.addObject("map",map);
        return object;
    }


    @RequestMapping(value="/operation",method= RequestMethod.GET)
    public ModelAndView Operation(){
        ModelAndView operation = new ModelAndView("operation");
        return operation;
    }

    @RequestMapping(value="/sort",method= RequestMethod.GET)
    public ModelAndView Sort(){
        ModelAndView sort = new ModelAndView("sort");
        sort.addObject("sort_int",new SortMethod());
        return sort;
    }

    @RequestMapping(value="/instruction",method= RequestMethod.GET)
    public ModelAndView Instruction(){
        ModelAndView sort = new ModelAndView("instruction");
        return sort;
    }

}
