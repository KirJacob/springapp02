package com.yakov.spring13;

import com.yakov.spring11.MusicGenre;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

//@Component("musicPlayer13")
public class MusicPlayer13 {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private Music13 classicalMusic13;
    private Music13 rockMusic13;

    public MusicPlayer13(Music13 classicalMusic, Music13 rockMusic) {
        this.classicalMusic13 = classicalMusic;
        this.rockMusic13 = rockMusic;
    }

    public String playMusic(MusicGenre genre){
        List<String> result = genre.equals(MusicGenre.ROCK) ? rockMusic13.getSong() : classicalMusic13.getSong();
        String playerParameters = String.format("using player %s with volume %s", this.name, this.volume);
        return "Playing ..." + result.get(RandomUtils.nextInt(0, result.size())) + "\n" + playerParameters;
    }
}
