package com.yakov.spring05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring05 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext05.xml");
        MusicPlayer05 musicPlayer = context.getBean("musicPlayer", MusicPlayer05.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer);
        context.close();
    }
}
