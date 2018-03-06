package com.springBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * springBean的生命周期
 * Created by Star on 2018/3/6.
 */
public class SpringBeanMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        AA bean = (AA) ctx.getBean("aa");
        System.out.println("================================"+bean);
        ctx.close();
    }
}
