package com.yakov.advanced08b;

import com.yakov.advanced08.MyAnnotation;
import com.yakov.advanced08a.MethodInfo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

    static void printClass(Class clazz) {
        System.out.println("getName=" + clazz.getName());
        System.out.println("getPackage=" + clazz.getPackage());
        System.out.println("getPackage=" + Arrays.toString(clazz.getMethods()));
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // method - 1
        Class clazz = SomeClass.class;

        // method - 2
        SomeClass someClass = new SomeClass();
        Class clazz2 = someClass.getClass();

        // method - 3
        Class clazz3 = Class.forName("com.yakov.advanced08b.SomeClass");

        printClass(clazz);
        System.out.println("----------");
        printClass(clazz2);
        System.out.println("----------");
        printClass(clazz3);

        System.out.println(">>>>>>>>>>>>>>>>");
        Class personClass = Person.class;
        Method[]methods = personClass.getMethods();
        for (Method method: methods) {
            System.out.println("--------------");
            System.out.print(method.getName() + "\n");
            System.out.print(method.getReturnType() + "\n");
            System.out.println(Arrays.toString(method.getParameterTypes()));
        }

        System.out.println(">>>>>>>>>>>>>>>>");
        Field[]fields = personClass.getDeclaredFields();
        for (Field field: fields) {
            System.out.println("--------------");
            System.out.println(field.getName());
            System.out.println(field.getType());
        }
        System.out.println(">>>>>>>>>>>>>>>>");
        Annotation[] annotations = personClass.getAnnotations();
        System.out.println(Arrays.toString(annotations));
        for (Annotation annotation: annotations) {
            if (annotation instanceof MyAnnotation){
                System.out.println("MethodInfo exists");
            }
        }

        Person personInstance = (Person) personClass.newInstance();

    }
}
