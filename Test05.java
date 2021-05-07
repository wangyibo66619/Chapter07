package edu.xcdq.tools;

import java.util.Comparator;
import java.util.Map;
import java.util.SplittableRandom;
import java.util.TreeMap;

/**
 * @author 王艺博
 * @date 2021/5/7 10:26
 */
public class Test05 {
    public static void main(String[] args) {
        TreeMap<String, String> tree = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);// 按照字母顺序排
            }
        });

        tree.put("name","大根");
        tree.put("age","18");
        tree.put("high","175");
        tree.put("sex","man");
        tree.put("weight","70KG");

        for (Map.Entry<String,String> entry : tree.entrySet()) {
            System.out.println(entry);
        }
    }
}
