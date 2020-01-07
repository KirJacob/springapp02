package com.yakov.spring09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
@Component("musicPlayer01")
public class MusicPlayer09 {

    //    private Music09 music09;

    private ClassicalMusic09 classicalMusic09;
    private RockMusic09 rockMusic09;

    //    AUTOWIRED for class property
    //    @Autowired
    //    private Music09 music09;

    //    AUTOWIRED via Constructor
    //    public MusicPlayer09(Music09 music09) {
    //        this.music09 = music09;
    //    }

    //    AUTOWIRED via SETTER
    //    @Autowired
    //    public void setMusic09(Music09 music09) {
    //        this.music09 = music09;
    //    }

    @Autowired
    public MusicPlayer09(ClassicalMusic09 classicalMusic09, RockMusic09 rockMusic09) {
        this.classicalMusic09 = classicalMusic09;
        this.rockMusic09 = rockMusic09;
    }

    public String playMusic() {
//        System.out.println("Playing: " + classicalMusic09.getSong());
//        System.out.println("Playing: " + rockMusic09.getSong());
        //System.out.println("Playing: " + music09.getSong());
        //System.out.println(String.format("Name = %s : Volume = %s", getPlayerName(), getVolume()));
        return "Playing: " + classicalMusic09.getSong();
    }

}
