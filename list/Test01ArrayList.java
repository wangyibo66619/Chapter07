package edu.xcdq.list;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 王艺博
 * @date 2021/5/6 8:22
 */
public class Test01ArrayList {
    public static void main(String[] args) {
        //Constructs an empty list with an initial capacity of ten  构造一个初始容量为10的空列表
        ArrayList<Integer> list = new ArrayList<>(); // 数组列表

        // 1 添加数据
        list.add(123);
        list.add(456);
        System.out.println(list);
        // 2 替换数据
        list.set(1,777);
        System.out.println(list);

        // 3 将list2中的所有数据放到list1中   addAll()         user Testing         swagbucks  cliclworker
        ArrayList<Integer> list2 = new ArrayList<>();// 默认给定的长度是10 DEFAULT_CAPACITY = 10
        list2.add(666);
        list2.add(999);
        list.addAll(list2);
        System.out.println(list);
        // 4 循环list2中所有的数据
        for ( Integer integer : list2 ) {
            System.out.println(integer);
        }

        // 5 删除循环出的对象
        list2.remove(0);
        System.out.println(list2);

        // 6 list 集合是否有数据  isEmpty()是否为空
        if ( !list.isEmpty() ) {
            System.out.println("list.size = " + list.size());
            // 7 清空  list
            list.clear();
        }
        System.out.println("list.size = " + list.size());


    }
}
