package com.yakov.spring11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class MusicPlayer11 {

    private Music11 music11;

//    Qualifier with field
//    @Autowired
//    @Qualifier("rockMusic")
//    private Music11 music11;

//    Qualifier with constructor
    @Autowired
    public MusicPlayer11(@Qualifier("classicalMusic") Music11 music11) {
        this.music11 = music11;
    }

    public String playMusic(){
        return "Playing ..." + this.music11.getSong();
    }
}
