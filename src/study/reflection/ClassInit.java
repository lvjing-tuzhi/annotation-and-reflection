package study.reflection;

public class ClassInit {
    static {
        System.out.println("Main初始化");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        int[] arr = new int[5];
        for (int i : arr) {
            
        }
//        主动引用
//        1.new对象
//        Son son = new Son();
//        2.调用类的静态方法和静态成员除了了final
//        System.out.println(Son.s);
//        反射
//        Class c = Class.forName("study.reflection.Son");

//        被动引用(不会初始化)
//        1.通过子类访问父类的静态
//        System.out.println(Son.F);
//        2.数组
//        Son[] sons = new Son[5];
//        3.引用常量
        System.out.println(Son.S);
    }
}
class Father {
    static {
        System.out.println("父类被加载了");
    }
    static int F;
}
class Son extends Father {
    static {
        System.out.println("子类被加载了");
    }
    static int s;
    static final int S = 1;
}
