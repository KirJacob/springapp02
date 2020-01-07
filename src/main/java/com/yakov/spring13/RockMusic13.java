package com.yakov.spring13;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

public class RockMusic13 implements Music13 {
    @Override
    public List<String> getSong() {
        return Arrays.asList("Wind cries Mary", "Nirvana", "Beatles");
    }
}
