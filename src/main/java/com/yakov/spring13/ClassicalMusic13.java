package com.yakov.spring13;

import java.util.Arrays;
import java.util.List;

public class ClassicalMusic13 implements Music13 {

    @Override
    public List<String> getSong() {
        return Arrays.asList("Hungarion Rhapsody", "Bethoven", "Mozart");
    }
}
