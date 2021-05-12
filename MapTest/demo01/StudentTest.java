package MapTest.demo01;

import MapTest.demo01.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 王艺博
 * @date 2021/5/12 15:44
 */
/*

 */
public class StudentTest {
    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();
        Student s1 = new Student("大大跟");
        Student s2 = new Student("小根");
        Student s3 = new Student("小小跟");
        map.put("001",s1);
        map.put("002",s2);
        map.put("003",s3);

        /*// 方法1  键找值
        Set<String> str = map.keySet();
        for ( String s : str ) {
            String value = map.get(s).getName();
            System.out.println(s + "," + value);
        }*/


        // 方法二   键值对找键和值
        Set<Map.Entry<String, Student>> en = map.entrySet();

        for ( Map.Entry<String,Student> a : en ) {
            System.out.println(a.getKey() + "," + a.getValue().getName());
        }
    }
}
