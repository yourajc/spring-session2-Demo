package com.yourajlearningjava.springsession2.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component

// autowiring with constructor, here we do not need to explicitly assign autowiring annotation
public class Employee {
    private Person person;
    private double salary = 100000;

    public Employee(Person person) {
        this.person = person;
    }

}
