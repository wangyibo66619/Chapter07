package edu.xcdq.tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 王艺博
 * @date 2021/5/6 16:29
 */
public class Test01 {
    public static void main(String[] args) {
        String[] str = {"中文", "计算机", "ABC", "123", "@qq.com"};

        // 1 Arrays.asList()    把数组转换成list列表
        List<String> strList = Arrays.asList(str);
        for (String s : strList) {
            System.out.print(s + "\t");
        }
        System.out.println();
        // new ArrayList<>(Arrays.asList(str));   把数组转换为ArrayList,因此就拥有了众多的操作方法
        ArrayList<String> alist = new ArrayList<>(Arrays.asList(str));
        alist.remove(2);
        for (String string : strList) {
            System.out.print(string + "\t");
        }
    }
}
