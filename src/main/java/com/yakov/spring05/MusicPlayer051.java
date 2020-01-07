package com.yakov.spring05;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer051 {

    private List<Music05> musicList= new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer051() {

    }

    public void playMusic() {
        System.out.println(String.format("Player characteristics"));
        System.out.println(String.format("Name = %s : Volume = %s", this.name, this.volume));
        for (Music05 musicTrack: musicList){
            System.out.println("Playing: " + musicTrack.getSong());

        }
    }

    public List<Music05> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music05> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "MusicPlayer051{" +
                "musicList=" + musicList +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
