package com.yakov.spring15;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("com.yakov.spring15")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig15 {

    @Bean
    public Music15 musicBeanClassical() {
        return new ClassicalMusic15();
    }

    @Bean
    public Music15 musicBeanRock() {
        return new RockMusic15();
    }

    @Bean
    public Music15 musicBeanJazz() {
        return new JazzMusic15();
    }

    @Bean
    public List<Music15> music15List() {
        return Arrays.asList(musicBeanClassical(), musicBeanRock(), musicBeanJazz());
    }

    @Bean
    public MusicPlayer15 musicPlayer151(){
        return new MusicPlayer15(music15List());
    }

}
