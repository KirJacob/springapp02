package com.yakov.spring09;

import org.springframework.stereotype.Component;

//@Component("someClassicalMusic")
@Component
public class ClassicalMusic09 implements Music09 {

    private String genreName;

    public ClassicalMusic09() {
    }

    public ClassicalMusic09(String genreName) {
        this.genreName = genreName;
    }

    void doMyInit(){
        System.out.println("Bean Initialization - " + getGenreName());
    }

    void doMyDestroy(){
        System.out.println("Bean Destroy - " + getGenreName());
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
