package com.stackroute;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class BeanNameAwareTest implements BeanNameAware {

    public BeanNameAwareTest(){
        System.out.println("BeanNameAware Initialized");
    }

    @Override
    public void setBeanName(String s) {

    }
}
