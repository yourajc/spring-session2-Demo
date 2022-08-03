package com.yourajlearningjava.springsession2.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Manager {
    @Value("${person.designation:'CEO'}")
    private String designation;
    @Autowired
    private Person person;
}
