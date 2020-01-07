package com.yakov.spring13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.yakov.spring13")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic13 musicBean132() {
        return new ClassicalMusic13();
    }

    @Bean
    public RockMusic13 musicBean133() {
        return new RockMusic13();
    }

    @Bean
    public MusicPlayer13 musicPlayer132(){
        return new MusicPlayer13(musicBean132(), musicBean133());
    }

}
