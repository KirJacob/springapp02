package com.yakov.spring15;

import java.util.Arrays;
import java.util.List;

public class RockMusic15 implements Music15 {
    @Override
    public List<String> getSong() {
        return Arrays.asList("Wind cries Mary", "Nirvana", "Beatles");
    }
}
