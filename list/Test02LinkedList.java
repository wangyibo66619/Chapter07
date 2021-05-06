package edu.xcdq.list;

import java.util.LinkedList;

/**
 * @author 王艺博
 * @date 2021/5/6 10:18
 */
public class Test02LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // 1 添加
        list.add(123);
        list.add(456);
        list.add(789);
        System.out.println(list);
        // 2 设置、修改
        list.set(1,777);
        System.out.println(list);
        // 3 将list2中的所有数据放到list1中
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(666);
        list2.add(999);
        list.addAll(list2);
        System.out.println(list);
        // 4 循环list2中所有的数据
        for (Integer i : list2 ) {
            System.out.print(i + "\t");
        }

        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + "\t");
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
