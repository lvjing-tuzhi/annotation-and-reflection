package study.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AlterClass {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("study.reflection.User");

//        构造一个对象
        User u = (User)c1.newInstance();//本质上是调用了类的无参构造器
        System.out.println(u);

        System.out.println("==============");
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class);
        Object o = declaredConstructor.newInstance("吕竟", 1);
        System.out.println(o);

        System.out.println("==============");
        Method setName = c1.getDeclaredMethod("setName", String.class);
        setName.invoke(u,"大神");
        System.out.println(u.getName());

        System.out.println("==============");
        Field name = c1.getDeclaredField("name");
        name.setAccessible(true);
        name.set(u,"吕竟大神");
        System.out.println(u.getName());
    }
}
