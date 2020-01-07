package com.yakov.spring13;

import com.yakov.spring11.MusicGenre;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring13 {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext13.xml");
//        MusicPlayer13 musicPlayer13 = context.getBean("musicPlayer13", MusicPlayer13.class);
        MusicGenre genre = MusicGenre.values()[RandomUtils.nextInt(0, MusicGenre.values().length)];
        System.out.println("GENRE=" + genre);
//        System.out.println(musicPlayer13.playMusic(genre));

        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer13 musicPlayer131 = context1.getBean("musicPlayer132", MusicPlayer13.class);
        System.out.println(musicPlayer131.playMusic(genre));

//        MusicPlayer14 musicPlayer14 = context1.getBean("musicPlayer14", MusicPlayer14.class);
//        System.out.println(musicPlayer14.playMusic(genre));

        context1.close();
    }
}
