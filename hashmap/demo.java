package edu.xcdq.hashmap;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author 王艺博
 * @date 2021/5/6 16:25
 */
public class demo {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("大根","小根");
        treeMap.put("2大根","2小根");
        treeMap.put("3大根","3小根");
        System.out.println(treeMap);

        for (Map.Entry<String,String> key : treeMap.entrySet()){
            System.out.println(key);
        }


    }
}
