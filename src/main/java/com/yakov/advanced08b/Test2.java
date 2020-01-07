package com.yakov.advanced08b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InstantiationException, InvocationTargetException {

        Scanner scanner = new Scanner(System.in);
        // FirstClassName SecondClassName MethodName
        Class classObject1 = Class.forName(scanner.next());
        Class classObject2 = Class.forName(scanner.next());
        String methodName = scanner.next();

        Method m = classObject1.getMethod(methodName, classObject2);
        System.out.println(String.format("classObject1=%s, classObject2=%s, m=%s", classObject1, classObject2, m));
        Object o1 = classObject1.newInstance();
        Object o2 = classObject2.getConstructor(String.class).newInstance("String value");

        m.invoke(o1, o2);

        System.out.println(o1);
        System.out.println(o2);

        //parameters for console 1
        //com.yakov.advanced08b.Person java.lang.String setName

        //parameters for console 2
        //
    }
}
