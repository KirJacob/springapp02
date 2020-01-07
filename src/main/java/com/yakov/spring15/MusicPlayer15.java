package com.yakov.spring15;

import org.apache.commons.lang3.RandomUtils;

import java.util.List;

public class MusicPlayer15 {

    private List<Music15> music15List;

    public MusicPlayer15(List<Music15> music15List) {
        this.music15List = music15List;
    }

    public String playMusic(){
        Music15 randomMusic = music15List.get(RandomUtils.nextInt(0, music15List.size()));
        String song = randomMusic.getSong().get(RandomUtils.nextInt(0, randomMusic.getSong().size()));
        String className = randomMusic.getClass().toString().replace("com.yakov.spring15.", "");
        String playerParameters = "";
        return "Playing ..." + song + " from Genre " + className + "\n" + playerParameters;
    }

}
