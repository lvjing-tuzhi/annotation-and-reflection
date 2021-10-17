package study.annotation;

import java.util.ArrayList;
import java.util.List;

public class Interior {
    public static void main(String[] args) {
        test();
    }
//    重写（规则）注解
    @Override
    public String toString() {
        return super.toString();
    }

//    反对注解
    @Deprecated
    static void test() {
    }
//    镇压注解
    @SuppressWarnings("all")
    static void test1() {
        List list = new ArrayList();
    }
}