package edu.xcdq.set;

import java.util.TreeSet;

/**
 * @author 王艺博
 * @date 2021/5/6 11:26
 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<Object> set01 = new TreeSet<>();
        set01.add("aaa");
        set01.add("bbb");
        set01.add("ccc");
        set01.add("ddd");
        set01.add("eee");
        set01.add("fff");

        for ( Object o : set01 ) {
            System.out.print(o + "\t");
        }
    }
}
