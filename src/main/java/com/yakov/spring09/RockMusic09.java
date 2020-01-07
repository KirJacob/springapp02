package com.yakov.spring09;

import org.springframework.stereotype.Component;

//@Component("someRockMusic")
@Component
public class RockMusic09 implements Music09 {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
