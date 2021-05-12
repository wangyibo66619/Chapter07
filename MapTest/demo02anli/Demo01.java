package MapTest.demo02anli;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author 王艺博
 * @date 2021/5/12 16:43
 */
/*
    需求：
        创建一个ArrayList集合，存储三个元素，每一个元素都是HashMap,每一个HashMap的键和值都是String，并遍历
 */
public class Demo01 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("大根","大");
        map.put("小根","小");
        HashMap<String,String> map2 = new HashMap<>();
        map2.put("大大根","大");
        map2.put("小小根","小");
        HashMap<String,String> map3 = new HashMap<>();
        map3.put("大大大根","大大大");
        map3.put("小小小根","...");

        ArrayList<HashMap<String,String>> list = new ArrayList<>();
        list.add(map);
        list.add(map2);
        list.add(map3);

        for ( HashMap<String,String> h : list ) {
            Set<String> str = h.keySet();
            for ( String s : str ) {
                String value = h.get(s);
                System.out.println(s + "," + value);
            }
        }
    }
}
