package study.reflection;

import java.lang.annotation.ElementType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/*
* 通过反射获得泛型
* */
public class Generic {
    public void test01(Map<String,User> map,List<User> list) {
        System.out.println("test01");
    }

    public Map<String,User> test02() {
        System.out.println("test02");
        return null;
    }
    public static void main(String[] args) throws NoSuchMethodException {
        Method me = Generic.class.getDeclaredMethod("test01", Map.class,List.class);
        Type[] genericParameterTypes = me.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println("#"+genericParameterType);
            if (genericParameterType instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println("actual: " + actualTypeArgument);
                }
            }
        }
    }
}
