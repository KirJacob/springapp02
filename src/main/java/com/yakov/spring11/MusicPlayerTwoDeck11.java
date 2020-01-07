package com.yakov.spring11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class MusicPlayerTwoDeck11 {

    private Music11 music11;
    private Music11 music12;

    @Autowired
    public MusicPlayerTwoDeck11(@Qualifier("rockMusic") Music11 music11,
                                @Qualifier("classicalMusic") Music11 music12) {
        this.music11 = music11;
        this.music12 = music12;
    }

    public String playMusic(){
        return "Playing ..." + this.music11.getSong() + " and " + this.music12.getSong();
    }
}
