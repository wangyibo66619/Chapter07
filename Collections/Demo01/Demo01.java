package Collections.Demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 王艺博
 * @date 2021/5/15 8:37
 */
public class Demo01 {
    public static void main(String[] args) {
        List<Integer> i = new ArrayList<>();
        i.add(10);
        i.add(20);
        i.add(50);
        i.add(30);
        i.add(40);

        System.out.println(i);
        // 排序
        Collections.sort(i);
        System.out.println("升序排序" + i);
        // 反转指定列表中元素的顺序
        Collections.reverse(i);
        System.out.println("反转元素顺序" + i);
        Collections.shuffle(i);
        // 随机排列指定的集合
        System.out.println(i);
    }
}
