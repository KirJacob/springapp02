package com.yakov.spring05;

public class MusicPlayer05 {

    private Music05 music;
    private String name;
    private int volume;

    //IOC
    public MusicPlayer05(Music05 music) {
        this.music = music;
    }

    public MusicPlayer05() {

    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
        System.out.println(String.format("Name = %s : Volume = %s", getName(), getVolume()));
    }

    public Music05 getMusic() {
        return music;
    }

    public void setMusic(Music05 music) {
        this.music = music;
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
        return "MusicPlayer05{" +
                "music=" + music.getSong() +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
