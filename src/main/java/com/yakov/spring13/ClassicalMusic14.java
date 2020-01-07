package com.yakov.spring13;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic14 implements Music14 {
    @Override
    public List<String> getSong() {
        return Arrays.asList("Hungarion Rhapsody", "Bethoven", "Mozart");
    }
}
