package study.reflection;

public class GetClassMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是：" + person);

//        1.通过对象获得Class
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

//        2.通过forName
        Class c2 = Class.forName("study.reflection.GetClassMethod");
        System.out.println(c2.hashCode());

//        3.通过类名.class获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

//        4.基本内置类型的包装类都有一个type类型
        Class c4 = Integer.TYPE;
        System.out.println(c4);

//        5.获得父类的类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5);
    }
}
class Person {
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Teacher extends Person {
    public Teacher() {
        this.name = "老师";
    }
}
class Student extends Person {
    public Student() {
        this.name = "学生";
    }
}
