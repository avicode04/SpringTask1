package com.stackroute;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationAwareContextTest implements ApplicationContextAware {
    ApplicationContext context;
    public ApplicationContext getContext() {

        return context;
    }
    @Override
    public void setApplicationContext(ApplicationContext context)
            throws BeansException {
        System.out.println("Application Aware Context initialized");
        this.context=context;
    }
}
