package com.yakov.spring11;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

@Component("classicalMusic11")
@Scope("prototype")
public class ClassicalMusic11 implements Music11 {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization ClassicalMusic11");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction ClassicalMusic11");
    }

    @Override
    public List<String> getSong() {
        return Arrays.asList("Hungarion Rhapsody", "Bethoven", "Mozart");
    }

}
