package com.liyuan.controller;

import com.liyuan.scope.ASingletonBean;
import com.liyuan.scope.SimpleUserService;
import com.liyuan.scope.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScopeController {
    @Autowired
    SimpleUserService simpleUserService;

    @Autowired
    ASingletonBean singletonBean;

    /**
     * 用于测试一个singleton的bean中注入了一个由aop代理的session-scoped的bean会怎么样。
     *
     * @return
     */
    @GetMapping("/scopeControllerTest")
    public String scopeTest() {
        String s0 = "用于测试一个singleton的bean中注入了一个由aop代理的session-scoped的bean会怎么样。";
        String s1 = simpleUserService.toString();
        String s2 = simpleUserService.getUserPreference().toString();
        return s0 + "\n" + s1 + "\n" + s2;
    }

    @GetMapping("/scopeControllerAboutSingletonAndPrototypeBeanTest")
    public String scopeControllerAboutSingletonAndPrototypeBeanTest() {
        String s1 = singletonBean.toString();
        String s2 = singletonBean.getaPrototypeBean().toString();
        return s1 + s2;
    }


    @Autowired
    UserManager userManager;

    @GetMapping("/testJDKProxyOfSessionScopedBeanAndSingletonBean")
    public String testJDKProxyOfSessionScopedBeanAndSingletonBean() {
        String s1 = userManager.toString();
        String s2 = userManager.getDefaultUserPreferences().toString();
        return s1 + s2;
    }

}
