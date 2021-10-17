package study.reflection;

/*
* 类的加载过程
* */
public class ClassRun {
    public static void main(String[] args) {
        /*
        * 1.加载class到内存
        * 2.链接
        * 3.初始化
        * */
        A a = new A();
        System.out.println(a.m);
    }
}
class A {
//    1
    static {
        System.out.println("静态代码块");
        m = 300;
    }

//    3
    static int m = 100;

//    2
    public A() {
        System.out.println("无参构造");
    }
}
