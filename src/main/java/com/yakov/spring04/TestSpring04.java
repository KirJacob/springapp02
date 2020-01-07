package com.yakov.spring04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring04 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext04.xml");
        //Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        User userKirill = context.getBean("userKirill", User.class);
        System.out.println(userKirill);
        context.close();
    }
}
