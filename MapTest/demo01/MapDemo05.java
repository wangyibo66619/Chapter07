package MapTest.demo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 王艺博
 * @date 2021/5/12 15:08
 */
/*
    Map集合的遍历（方式2）：
        1：获取所有键值对对象的集合
            Set<Map.Entry<K,V>> entrySet():获取所有键值对对象的集合
        2：遍历键值对对象的集合，得到每一个键值对对象
            用增强for实现，得到每一个Map.Entry
        3：根据键值对对象取键和值
            用getKey()获取键
            用getValue()获取值
 */
public class MapDemo05 {
    public static void main(String[] args) {
        // 创建集合对象
        Map<String,String> map = new HashMap<>();
        // 添加元素
        map.put("大根","大");
        map.put("小根","小");
        map.put("小小跟","很小");
        // 获取所有键值对对象的集合
        Set<Map.Entry<String,String>> en = map.entrySet();

        for ( Map.Entry<String,String> m : en ) {
            System.out.println(m.getKey() + "," + m.getValue());
        }

    }
}
