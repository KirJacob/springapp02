package com.yakov.spring13;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic14 implements Music14 {
    @Override
    public List<String> getSong() {
        return Arrays.asList("Wind cries Mary", "Nirvana", "Beatles");
    }
}
