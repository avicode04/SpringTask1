package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.naming.spi.InitialContextFactoryBuilder;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying under progress..");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After properties..");
    }

    public void customInit(){
        System.out.println("custom Init under...");
    }

    public void customDestroy(){
        System.out.println("custom Destroy...");
    }
}
