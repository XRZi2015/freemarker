package com.imooc.instruction;

import freemarker.core.Environment;
import freemarker.template.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/26.
 */
public class RoleDirectiveModel implements TemplateDirectiveModel{
    @Override
    public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, IOException {
        /**
         * Environment 环境变量
         * Map 指令参数（储存你需要的值，key-value类型）
         * TemplateModel 循环变量
         * TemplateDirectiveBody 指令内容
         */
        TemplateScalarModel user=(TemplateScalarModel)params.get("user");
        TemplateScalarModel role=(TemplateScalarModel)params.get("role");
        if("ziwang".equals(user.getAsString())&&"admin".equals(role.getAsString())){
            loopVars[0]=TemplateBooleanModel.TRUE;
        }
        List<String> list=new ArrayList<>();
        list.add("insert");
        list.add("delete");
        list.add("update");
        list.add("select");
        loopVars[1]=new SimpleSequence(list);
        //输出
        body.render(env.getOut());
    }
}
