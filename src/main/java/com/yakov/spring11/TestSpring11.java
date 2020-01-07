package com.yakov.spring11;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring11 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext11.xml");

//        MusicPlayer11 musicPlayer11 = context.getBean("musicPlayer11", MusicPlayer11.class);
//        System.out.println(musicPlayer11.playMusic());

//        MusicPlayerTwoDeck11 musicPlayerTwoDeck11 = context.getBean("musicPlayerTwoDeck11", MusicPlayerTwoDeck11.class);
//        System.out.println(musicPlayerTwoDeck11.playMusic());

        MusicPlayerTask11 musicPlayerTask11 = context.getBean("musicPlayerTask11", MusicPlayerTask11.class);
        MusicGenre genre = MusicGenre.values()[RandomUtils.nextInt(0, MusicGenre.values().length)];
        System.out.println("GENRE=" + genre);
        System.out.println(musicPlayerTask11.playMusic(genre));
        MusicPlayerTask11 musicPlayerTask12 = context.getBean("musicPlayerTask11", MusicPlayerTask11.class);
        MusicPlayerTask11 musicPlayerTask13 = context.getBean("musicPlayerTask11", MusicPlayerTask11.class);
        boolean compare = musicPlayerTask12 == musicPlayerTask13;
        System.out.println("COMPARE PLAYER=" + compare);
        context.close();
    }
}
