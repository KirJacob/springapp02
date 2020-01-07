package com.yakov.advanced08;

@Author(name = "Stephen King", dateOfBirth = 1947)
@MyAnnotation
public class Test {

    @MyAnnotation
    private String name;

    @MyAnnotation
    public Test (){
    }

    @MyAnnotation
    public void someMethod(@MyAnnotation String parameter) {
        System.out.println("do something");
    }

    @MyAnnotation
    public static String someStaticMethod() {
        return "something";
    }

    public static void main(String[] args) {

    }

}
