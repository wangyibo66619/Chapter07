package edu.xcdq.set;

import java.util.HashSet;

/**
 * @author 王艺博
 * @date 2021/5/6 11:07
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        HashSet<Object> set01 = new HashSet<>();
        set01.add("aaa");
        set01.add("bbb");
        set01.add("ccc");
        set01.add(123);
        set01.add(456);
        set01.add(789);
        for ( Object o : set01 ) {
            System.out.print(o + "\t");
        }

    }
}
