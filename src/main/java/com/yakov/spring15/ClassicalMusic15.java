package com.yakov.spring15;

import java.util.Arrays;
import java.util.List;

public class ClassicalMusic15 implements Music15 {

    @Override
    public List<String> getSong() {
        return Arrays.asList("Hungarion Rhapsody", "Bethoven", "Mozart");
    }
}
