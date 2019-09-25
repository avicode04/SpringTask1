package com.stackroute.domain;

import com.stackroute.ApplicationAwareContextTest;
import com.stackroute.BeanFactoryAwareTest;
import com.stackroute.BeanNameAwareTest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    private Actor actor1;
    private Actor actor2;
    private Actor actor3;

    public Movie(Actor actor1, Actor actor2, Actor actor3) {

        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }

    public void getActor(){
        actor1.display();actor2.display();actor3.display();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Initialized.."+beanFactory.toString());
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name Initialized.."+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Initilized.."+applicationContext.toString());
    }
}
