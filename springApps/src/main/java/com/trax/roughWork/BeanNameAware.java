package com.trax.roughWork;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by SG0220142 on 7/29/2014.
 */
public class BeanNameAware implements org.springframework.beans.factory.BeanNameAware , BeanFactoryAware, ApplicationContextAware, BeanPostProcessor, InitializingBean{

    @Override
    public void setBeanName(String name) {
        System.out.println("Name of bean is ::" + name);
    }

    public void finalWork(){
        System.out.println("Bean created and function is being called");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Recieved bean factory :::" + beanFactory.toString());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Recieved application context ::" + applicationContext.toString());
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("post processor before init");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("post processor after init");
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
