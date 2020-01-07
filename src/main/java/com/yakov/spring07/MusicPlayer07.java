package com.yakov.spring07;

import com.yakov.spring04.MusicPlayer;
import com.yakov.spring04.RockMusic;
import com.yakov.spring05.RapMusic05;

public class MusicPlayer07 {
    private Music07 music07;
    private String playerName;
    private int volume;

    public MusicPlayer07(Music07 music07) {
        this.music07 = music07;
    }

    public MusicPlayer07() {
    }

    public MusicPlayer07(Music07 music07, String playerName, int volume) {
        this.music07 = music07;
        this.playerName = playerName;
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("Playing: " + music07.getSong());
        System.out.println(String.format("Name = %s : Volume = %s", getPlayerName(), getVolume()));
    }

    public Music07 getMusic07() {
        return music07;
    }

    public void setMusic07(Music07 music07) {
        this.music07 = music07;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public static MusicPlayer07 getMPFactoryMethod(){
        System.out.println("create bean using factory method");
        return new MusicPlayer07(new RockMusic07(), "Sony", 100);
    }
}
