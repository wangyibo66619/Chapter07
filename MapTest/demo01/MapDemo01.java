package MapTest.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王艺博
 * @date 2021/5/12 9:53
 */
/*
    Map集合概述：
        Interface Map<K,V>  K：键的类型；V：值的类型
        将键映射到值的对象：不能包含重复的键；每个键可以映射到最多一个值
        举例：学生的学号和姓名
            1111  大根
            2222  二根
            3333  小根
    创建Map集合的对象
        多态的形式
        具体实现类HashMap
 */
public class MapDemo01 {
    public static void main(String[] args) {
        // 创建集合对象
        Map<String,String> map = new HashMap<>();
        // V put(K key,V value) 将指定的值与该映射中指定键相关联
        map.put("编号001","大根");
        map.put("编号002","二根");
        map.put("编号003","小根");
        map.put("编号003","小小根");
        // 输出集合对象
        System.out.println(map);
    }
}
