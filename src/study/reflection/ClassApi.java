package study.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
* Class的Api方法
* */
public class ClassApi {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("study.reflection.User");

//        获得类的名字
        System.out.println(c1.getClass());
        System.out.println(c1.getSimpleName());
        System.out.println("===========================");
//        获得类的属性
        Field[] fields = c1.getFields();//获得public的属性
        System.out.println(fields);
        System.out.println("===========================");
        Field[] declaredFields = c1.getDeclaredFields();//获得全部的属性
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("===========================");
//        获得指定属性
        Field name = c1.getDeclaredField("name");
        System.out.println(name);
//        获得类的方法
        System.out.println("===========================");
        Method[] methods = c1.getMethods();//获得本类获得父类public方法
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("===========================");
        Method[] declaredMethods = c1.getDeclaredMethods();//获得本类的所有方法
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("===========================");
//        获得指定方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        System.out.println(setName);
        System.out.println("===========================");
//        获得指定构造器
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class);
        System.out.println(declaredConstructor);
    }
}
