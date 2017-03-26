package com.imooc.customMethod;

import freemarker.template.SimpleSequence;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Administrator on 2017/3/25.
 */
public class SortMethod implements TemplateMethodModelEx {
    @Override
    public Object exec(List arguments) throws TemplateModelException {

        //获取第一个参数
        SimpleSequence arg0=(SimpleSequence)arguments.get(0);
        List<BigDecimal> list = arg0.toList();
        Collections.sort(list, new Comparator<BigDecimal >() {

            @Override
            public int compare(BigDecimal  o1, BigDecimal  o2) {
                return o2.intValue() - o1.intValue();//倒序
            }
        });


        return list;
    }
}
