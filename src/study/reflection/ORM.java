package study.reflection;

import java.lang.annotation.*;

public class ORM {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

        Class c1 = Class.forName("study.reflection.Student2");

//        通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
//        获得注解的value值
        Table annotation = (Table)c1.getAnnotation(Table.class);
        String value = annotation.value();
        System.out.println(value);
//        获得类指定的注解
        java.lang.reflect.Field id = c1.getDeclaredField("id");
        Field annotation1 = id.getAnnotation(Field.class);
        String s = annotation1.columnName();
        System.out.println(s);
    }

}
@Table("db_student")
class Student2 {
    @Field(columnName = "id",type = "int",length = 10)
    private int id;

    @Field(columnName = "age",type = "int",length = 10)
    private int age;

    @Field(columnName = "name",type = "varchar",length = 100)
    private String name;

    public Student2() {
    }

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Table {
    String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Field {
    String columnName();
    String type();
    int length();
}