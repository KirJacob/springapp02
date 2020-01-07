package com.yakov.spring09;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring09 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext09.xml");
        //SAMPLE WITHOUT AUTOWIRED
//        Music09 rockMusic = context.getBean("someRockMusic", RockMusic09.class);
//        Music09 classicMusic = context.getBean("someClassicalMusic", ClassicalMusic09.class);
//        MusicPlayer09 rockPlayer09 = new MusicPlayer09(rockMusic);
//        rockPlayer09.playMusic();
//        MusicPlayer09 classicPlayer09 = new MusicPlayer09(classicMusic);
//        classicPlayer09.playMusic();

        //SAMPLE WITH AUTOWIRED
//        MusicPlayer09 player09Autowired = context.getBean("musicPlayer01", MusicPlayer09.class);
//        player09Autowired.playMusic();

        Computer09 computer09 = context.getBean("computer09", Computer09.class);
        System.out.println(computer09);

        context.close();
    }
}
