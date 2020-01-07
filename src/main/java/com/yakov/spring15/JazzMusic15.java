package com.yakov.spring15;

import java.util.Arrays;
import java.util.List;

public class JazzMusic15 implements Music15 {

    @Override
    public List<String> getSong() {
        return Arrays.asList("Armstrong", "Modern Jazz", "ACID Jazz");
    }
}
