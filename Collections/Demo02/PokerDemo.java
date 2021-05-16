package Collections.Demo02;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 王艺博
 * @date 2021/5/15 9:08
 */
/*
    需求：
        通过程序实现斗地主过程中的洗牌，发牌和看牌
    思路：
        1.创建一个牌盒，也就是定义一个集合对象，用ArrayList实现
        2.往牌盒里面装牌
        3.洗牌，用Collections的shuffle()方法实现
        4.发牌，遍历集合，给三个玩家发牌
        5.看牌，三个玩家分别遍历自己的牌
 */
public class PokerDemo {
    public static void main(String[] args) {
        // 1.创建一个牌盒，也就是定义一个集合对象，用ArrayList实现
        ArrayList<String> array = new ArrayList<>();
        // 2.往牌盒里面装牌

        String[] color = {"♠","❤","♣","♦"};
        String[] num = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        for ( String c : color ) {
            for ( String n : num ) {
                array.add(c+n);
            }
        }
        array.add("大王");
        array.add("小王");
        // 洗牌
        Collections.shuffle(array);

        // 发牌
        ArrayList<String> dagen = new ArrayList<>();
        ArrayList<String> xiaogen = new ArrayList<>();
        ArrayList<String> xiaoxiaogen = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if ( i >= array.size() - 3 ) {
                dipai.add(poker);
            }else if ( i % 3 == 0 ) {
                dagen.add(poker);
            }else if ( i % 3 == 1 ) {
                xiaogen.add(poker);
            }else if ( i % 3 == 2 ) {
                xiaoxiaogen.add(poker);
            }
        }

        // 看牌
        lookPoker("大根",dagen);
        lookPoker("小根",xiaogen);
        lookPoker("小小根",xiaoxiaogen);
        lookPoker("底牌" , dipai);

    }

    public static void lookPoker( String name,ArrayList<String> array ) {
        System.out.print(name + "的牌是：");
        for ( String a : array ) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
