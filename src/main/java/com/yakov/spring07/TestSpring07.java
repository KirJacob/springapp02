package com.yakov.spring07;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring07 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext07.xml");
        MusicPlayer07 firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer07.class);
        MusicPlayer07 secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer07.class);
        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparison);
        firstMusicPlayer.setMusic07(new RockMusic07());
        firstMusicPlayer.playMusic();
        secondMusicPlayer.playMusic();
        comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        MusicPlayer07 singletonMP = context.getBean("musicPlayerS", MusicPlayer07.class);
        MusicPlayer07 singletonMP2 = context.getBean("musicPlayerS", MusicPlayer07.class);
        MusicPlayer07 protottypeMP = context.getBean("musicPlayerP", MusicPlayer07.class);
        MusicPlayer07 protottypeMP2 = context.getBean("musicPlayerP", MusicPlayer07.class);
        MusicPlayer07 factoryMethodMP = context.getBean("musicPlayerF", MusicPlayer07.class);
        factoryMethodMP.playMusic();
        context.close();
    }
}
