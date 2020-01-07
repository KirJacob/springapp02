package com.yakov.spring11;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Scope("singleton")
@Component
public class MusicPlayerTask11 {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private Music11 classicalMusic11;
    private Music11 rockMusic11;

    @Autowired
    public MusicPlayerTask11(@Qualifier("classicalMusic11") Music11 classicalMusic,
                             @Qualifier("rockMusic11") Music11 rockMusic) {
        this.classicalMusic11 = classicalMusic;
        this.rockMusic11 = rockMusic;
    }

    public String playMusic(MusicGenre genre){
        List<String> result = genre.equals(MusicGenre.ROCK) ? rockMusic11.getSong() : classicalMusic11.getSong();
        String playerParameters = String.format("using player %s with volume %s", this.name, this.volume);
        return "Playing ..." + result.get(RandomUtils.nextInt(0, result.size())) + "\n" + playerParameters;
    }

    public Music11 getClassicalMusic11() {
        return classicalMusic11;
    }

    public Music11 getRockMusic11() {
        return rockMusic11;
    }
}
