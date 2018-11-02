package com.ardecs.MySpringBootClean;

import com.ardecs.MySpringBootClean.User.Child;
import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MySpringBootCleanApplication {
//данный класс ничего не знает о том что внедрили в объект
    public static void main(String[] args) {
		SpringApplication.run(MySpringBootCleanApplication.class, args);
        ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
        Child ch=(Child) context.getBean("child");
        System.out.println(ch.getName());
        System.out.println(ch.getSex());//
        ch.printFrase();
        
    }
}
