package com.yakov.spring15;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring15 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig15.class);
        MusicPlayer15 musicPlayer15 = context.getBean("musicPlayer151", MusicPlayer15.class);
        System.out.println(musicPlayer15.playMusic());
    }
}
