package com.yakov.spring11;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

@Component("rockMusic11")
@Scope("singleton")
public class RockMusic11 implements Music11 {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization RockMusic11");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction RockMusic11");
    }

    @Override
    public List<String> getSong() {
        return Arrays.asList("Wind cries Mary", "Nirvana", "Beatles");
    }

}
