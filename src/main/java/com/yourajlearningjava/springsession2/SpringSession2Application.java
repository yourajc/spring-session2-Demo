package com.yourajlearningjava.springsession2;

import com.yourajlearningjava.springsession2.config.ApplicationConfig;
import com.yourajlearningjava.springsession2.domain.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class SpringSession2Application {

    public static void main(String[] args) {
//        SpringApplication.run(SpringSession2Application.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.yourajlearningjava.springsession2.config", "com.yourajlearningjava.springsession2.domain");
        Object bean = context.getBean("raptors");
        System.out.println(bean);

        System.out.println(context.getBean("lakers"));

        Person person = context.getBean("person", Person.class);
        System.out.println(person);
//        System.out.println(context.getBean("person"));
        System.out.println(person.getHobbies().size());
        System.out.println(context.getBean(Employee.class));
        System.out.println(context.getBean(Manager.class));

        Game game = context.getBean(Game.class);
        System.out.println(game.startGame());

    }

}
