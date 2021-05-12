package MapTest.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王艺博
 * @date 2021/5/12 11:14
 */
/*
    Map集合的获取功能：
        V get(Object key):根据建获取值
        Set<K> keySet():获取所有键的集合
        Collection<V> values():获取所有值的集合
 */
public class MapDemo03 {
    public static void main(String[] args) {
        // 创建集合对象
        Map<String,String> map = new HashMap<>();
        map.put("大根","大");
        map.put("小根","小");
        map.put("小小根","小小");

//        V get(Object key):根据建获取值
        System.out.println(map.get("大根"));
        System.out.println(map.get("大大根"));
//        Set<K> keySet():获取所有键的集合
        System.out.println(map.keySet());
//        Collection<V> values():获取所有值的集合
        System.out.println(map.values());
    }
}
