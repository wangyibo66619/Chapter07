package MapTest.demo02anli;

import java.util.*;

/**
 * @author 王艺博
 * @date 2021/5/12 17:08
 */
/*
    需求：
        创建一个HashMap集合，存储三个键值对元素，每一个键值对元素的键都是String,值是ArrayList，每一个ArrayList的值是String，并遍历
 */
public class Demo02 {
    public static void main(String[] args) {
        // 创建HashMap集合对象
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        // 创建ArrayList集合对象
        ArrayList<String> list = new ArrayList<>();
        list.add("大根");
        list.add("小根");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("大大根");
        list2.add("小小根");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("大大大根");
        list3.add("小小小根");

        // 将ArrayList集合对象添加到HashMap集合对象中
        map.put("根1",list);
        map.put("根2",list2);
        map.put("根3",list3);
        // 遍历
        Set<String> str = map.keySet();
        for ( String key : str ) {
            System.out.println(key);

            ArrayList<String> s1 = map.get(key);
            for ( String s : s1 ) {
                System.out.println( "\t" + s );
            }
        }


    }
}
