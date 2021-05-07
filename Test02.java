package edu.xcdq.tools;


import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author 王艺博
 * @date 2021/5/7 8:22
 */
public class Test02 {
    public static void main(String[] args) {
        String [] str ={"中文","计算机","ABC","123","@qq.com","中文"};
        // 将数组先转为list，再把list转为set
        HashSet<String> set = new HashSet<>(Arrays.asList(str));
        for ( String s : set ) {
            System.out.print(s + "\t");
        }
        System.out.println();
        // 将set转为数组
        Object[] objects = set.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i] + "\t");
        }
        System.out.println();
        for ( Object o : objects ) {
            System.out.print( o + "\t");
        }
    }
}
