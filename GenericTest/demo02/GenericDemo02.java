package GenericTest.demo02;

import GenericTest.demo02.Generic02;

/**
 * @author 王艺博
 * @date 2021/5/11 10:06
 */
public class GenericDemo02 {
    public static void main(String[] args) {
        /*Generic02 g1 = new Generic02();
        g1.show("大根");
        g1.show(18);
        g1.show(true);
        */
        System.out.println("--------------------");

//        Generic02<String> g1 = new Generic02<>();
//        g1.show("大根");
//
//        Generic02<Integer> g2 = new Generic02<>();
//        g2.show(18);
//
//        Generic02<Boolean> g3 = new Generic02<>();
//        g3.show(true);

        System.out.println("---------------------");

        Generic02 g1 = new Generic02();
        g1.show("大根");
        g1.show(18);
        g1.show(true);
    }
}
