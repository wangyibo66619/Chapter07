package MapTest.demo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 王艺博
 * @date 2021/5/12 11:35
 */
/*
    Map集合的遍历（方式1）：
        1.获取所有键的集合。用keySet()方法实现
        2.遍历键的集合，获取到每一个键。用增强for实现
        3.根据键去找值。用get(Object key)方法实现
 */
public class MapDemo04 {
    public static void main(String[] args) {
        // 创建集合对象
        Map<String,String> map = new HashMap<>();

        // 添加元素
        map.put("大根","大");
        map.put("小根","小");
        map.put("小小根","小小");
//        获取所有键的集合。用keySet()方法实现
        Set<String> keySet = map.keySet();
//        遍历键的集合，获取到每一个键。用增强for实现
        for ( String key : keySet ) {
            String value = map.get(key);
            System.out.println(key + "," + value);
        }
    }
}
