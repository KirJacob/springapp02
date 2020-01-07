package com.yakov.spring09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer09 {
    private int id;
    private MusicPlayer09 musicPlayer09;

    @Autowired
    public Computer09(MusicPlayer09 musicPlayer09) {
        this.id = 1;
        this.musicPlayer09 = musicPlayer09;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayer09.playMusic();
    }
}
