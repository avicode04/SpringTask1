package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class FilmIndustryContext {
    public static void main(String args[]){
//        AbstractApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
//        ApplicationAwareContextTest appcontext = context.getBean("appcontext", ApplicationAwareContextTest.class);
//        ApplicationContext appCon =appcontext.getContext();
//
//        context.registerShutdownHook();

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        BeanNameAwareTest beanNameAwareTest = (BeanNameAwareTest) context.getBean("myBeanName");
        BeanFactoryAwareTest beanFactoryAwareTest= (BeanFactoryAwareTest) context.getBean("myBeanFactory");
        ApplicationAwareContextTest applicationAwareContextTest= (ApplicationAwareContextTest) context.getBean("myAppContext");

    }

}
