package edu.xcdq.tools;

import java.util.*;

/**
 * @author 王艺博
 * @date 2021/5/7 8:35
 */
public class Test03 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1","个1");
        map.put("2","个2");
        map.put("3","个3");

        for (Map.Entry<String,String> e : map.entrySet()) {
            System.out.println(e);
        }
        // 迭代器访问map，优点：占用内存小，速度快，能够访问较大的map
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext() ) {
            Map.Entry<String, String> e = iterator.next();
            System.out.println(e);
        }
        /*// 取出所有的键的值作为一个集合
        System.out.println( map.keySet() );

        // 取出所有的值，把值放在一个list中    new ArrayList<>(接收一个集合);
        ArrayList<String> strList = new ArrayList<>(map.values());
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }*/


    }
}
