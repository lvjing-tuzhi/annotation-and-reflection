package study.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class Test {
    @MyAnnotation2(name = "吕竟",id = 1,schools = "北京大学")
    void test(){}

    @MyAnnotation3("吕竟Value")
    void test1(){}

}

//注解类
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
//注解的参数 : 数据类型 + 数据名();如果没给参数默认值则使用注解的时候要传参数
@interface MyAnnotation2 {
    String name() default "";
    int id();
    String[] schools() default {"苏州科技大学","清华大学"};
}
//只有一个参数的时候使用value名字，则传递参数的时候参数名可以省略
@interface MyAnnotation3 {
    String value();
}