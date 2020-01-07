package com.yakov.spring04;

public class MusicPlayer {

    private Music music;

    //IOC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
