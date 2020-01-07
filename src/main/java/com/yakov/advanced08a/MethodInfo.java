package com.yakov.advanced08a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
public @interface MethodInfo {
    String author() default "Me";
    int dateOfCreation() default 2019;
    String purpose();
}
