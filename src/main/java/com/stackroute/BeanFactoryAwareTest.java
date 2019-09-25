package com.stackroute;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class BeanFactoryAwareTest implements BeanFactoryAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory:"+beanFactory);
    }
    public BeanFactoryAwareTest(){
        System.out.println("BeanFactoryAware is Initialized.");
    }
}
