package com.yourajlearningjava.springsession2.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class Person {
    @Value("${person.firstName: Jr Yoruaj}")
    private String firstName;
    @Value("${person.lastName}")
    private String lastName;
    @Value("${person.age}")
    private int age;
    @Value("#{'${person.hobbies}'.split(',')}")
    private List<String> hobbies;


    private void creatingBean() {
        System.out.println("Crating bean ***********************");
    }
}
