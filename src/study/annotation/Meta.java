package study.annotation;

import java.lang.annotation.*;

//元注解定义其他的注解
@MyAnnotation
public class Meta {

}

//目标注解(拦截)：规定那些可以
@Target(value = {ElementType.TYPE,ElementType.METHOD})

//运行注解:规定什么时候运行
@Retention(RetentionPolicy.RUNTIME)

//文档注解:要不要加入文档
@Documented

//子类可不可以继承父类
@Inherited
@interface MyAnnotation {

}
