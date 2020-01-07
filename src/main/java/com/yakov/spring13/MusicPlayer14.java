package com.yakov.spring13;

import com.yakov.spring11.Music11;
import com.yakov.spring11.MusicGenre;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer14 {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private Music14 classicalMusic14;
    private Music14 rockMusic14;

    @Autowired
    public MusicPlayer14(@Qualifier("classicalMusic14") Music14 classicalMusic,
                             @Qualifier("rockMusic14") Music14 rockMusic) {
        this.classicalMusic14 = classicalMusic;
        this.rockMusic14 = rockMusic;
    }

    public String playMusic(MusicGenre genre){
        List<String> result = genre.equals(MusicGenre.ROCK) ? rockMusic14.getSong() : classicalMusic14.getSong();
        String playerParameters = String.format("using player %s with volume %s", this.name, this.volume);
        return "Playing ..." + result.get(RandomUtils.nextInt(0, result.size())) + "\n" + playerParameters;
    }
}
