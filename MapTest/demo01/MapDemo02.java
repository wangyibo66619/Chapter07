package MapTest.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王艺博
 * @date 2021/5/12 10:47
 */
/*
    Map集合的基本功能：
        V put(K key,V value):添加元素
        V remove(Object key):根据键删除键值对元素
        void clear():移除所有键值对元素
        boolean containsKey(Object key):判断集合是否包含指定的值
        boolean containsValue(Object value):判断集合是否包含指定的值
        boolean isEmpty():判断集合是否为空
        int size():集合的长度，也就是集合中键值对的个数

 */
public class MapDemo02 {
    public static void main(String[] args) {
        // 创建集合对象
        Map<String,String> map = new HashMap<>();
        // 添加元素 V put(K key,V value)
        map.put("大根","大");
        map.put("二根","中");
        map.put("小根","小");
        // 输出集合对象
        System.out.println(map);
        // V remove(Object key):根据键删除键值对元素
        map.remove("二根");
        System.out.println(map);

//        void clear():移除所有键值对元素
//        map.clear();

//        boolean containsKey(Object key):判断集合是否包含指定的值
        System.out.println(map.containsKey("小根"));
//        boolean containsValue(Object value):判断集合是否包含指定的值
        System.out.println(map.containsValue("大"));
//        boolean isEmpty():判断集合是否为空
        System.out.println(map.isEmpty());
//        int size():集合的长度，也就是集合中键值对的个数
        System.out.println(map.size());

    }
}
