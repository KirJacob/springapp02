package com.yakov.spring07;

public class ClassicalMusic07 implements Music07 {

    private String genreName;

    public ClassicalMusic07() {
    }

    public ClassicalMusic07(String genreName) {
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
