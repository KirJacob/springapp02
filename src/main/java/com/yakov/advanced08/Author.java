package com.yakov.advanced08;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//RetentionPolicy = SOURCE, CLASS, RUNTIME
//Target = TYPE, METHOD, CLASS
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface Author {
    String name();
    int dateOfBirth();
    String city() default "Kyiv";
    int distance() default 10;
}
