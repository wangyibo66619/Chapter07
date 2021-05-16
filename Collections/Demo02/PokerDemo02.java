package Collections.Demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * @author 王艺博
 * @date 2021/5/15 10:10
 */
/*
    需求：
        通过程序实现斗地主过程中的洗牌，发牌和看牌。要求：对牌进行排序
    思路：
        1.创建HashMap，键是编号，值是牌
        2.创建ArrayList，储存编号
        3.创建花色数组和点色数组
        4.从0开始往HashMap里面存储吧编号，并存储对应的牌。同时往ArrayList里面存储编号
        5.洗牌（洗的是编号），用Collections的shuffle()方法实现
        6.发牌（发的也是编号，为了保证编号是排序的，创建TreeSet集合接收）
        7.定义方法看牌（遍历TreeSet集合，获取编号，到HashMap集合找对应的牌）
        8.调用看牌方法
 */
public class PokerDemo02 {
    public static void main(String[] args) {
        // 1.创建HashMap，键是编号，值是牌
        HashMap<Integer, String> hm = new HashMap<>();
        // 2.创建ArrayList，储存编号
        ArrayList<Integer> list = new ArrayList<>();
        // 3.创建花色数组和点色数组

        String[] color = {"♠", "♣", "♦", "❤"};
        String[] poker = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        // 4.从0开始往HashMap里面存储吧编号，并存储对应的牌。同时往ArrayList里面存储编号
        int index = 0;
        for (String p : poker) {
            for (String c : color) {
                hm.put(index, c + p);
                list.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        list.add(index);
        index++;
        hm.put(index,"大王");
        list.add(index);
        // 5.洗牌（洗的是编号），用Collections的shuffle()方法实现
        Collections.shuffle(list);
        // 6.发牌（发的也是编号，为了保证编号是排序的，创建TreeSet集合接收）
        TreeSet<Integer> dagen = new TreeSet<>();
        TreeSet<Integer> xiaogen = new TreeSet<>();
        TreeSet<Integer> xxgen = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if ( i >= list.size() - 3 ) {
                dipai.add(x);
            }else if( i % 3 == 0 ) {
                dagen.add(x);
            }else if( i % 3 == 1 ) {
                xiaogen.add(x);
            }else if( i % 3 == 2 ) {
                xxgen.add(x);
            }
        }

        // 7.定义方法看牌（遍历TreeSet集合，获取编号，到HashMap集合找对应的牌）
        lookPoker("大根",dagen,hm);
        lookPoker("小根",xiaogen,hm);
        lookPoker("小小根",xxgen,hm);
        lookPoker("底牌",dipai,hm);


    }
    public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm) {
        System.out.print(name + "的牌是:");
        for( Integer key : ts ) {
            String poker = hm.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
