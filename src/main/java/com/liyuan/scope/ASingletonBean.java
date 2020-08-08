package com.liyuan.scope;

public class ASingletonBean {
    private APrototypeBean aPrototypeBean;

    public void setaPrototypeBean(APrototypeBean aPrototypeBean) {
        this.aPrototypeBean = aPrototypeBean;
    }

    public APrototypeBean getaPrototypeBean() {
        return aPrototypeBean;
    }

}
