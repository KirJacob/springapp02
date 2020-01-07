package com.yakov.spring05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring51 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext05.xml");
        MusicPlayer051 musicPlayer = context.getBean("musicPlayerList", MusicPlayer051.class);
        musicPlayer.playMusic();
        context.close();
    }
}
