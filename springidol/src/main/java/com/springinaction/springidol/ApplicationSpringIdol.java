package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationSpringIdol {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");

        Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();

        Ticket tk1 = (Ticket) ctx.getBean("ticket");
        System.out.println(tk1.getId());
        Ticket tk2 = (Ticket) ctx.getBean("ticket");
        System.out.println(tk2.getId());

    }

}
