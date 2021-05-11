package GenericTest.demo01;

/**
 * @author 王艺博
 * @date 2021/5/11 9:04
 */
/*
    测试类
 */
public class GenericDemo01 {
    public static void main(String[] args) {
        Student01 s = new Student01("大根");
        System.out.println(s.getName());
        Teacher01 t = new Teacher01(18);
        System.out.println(t.getAge());

        System.out.println("------------");

        Generic01<String> g1 = new Generic01<>();
        g1.setT("大根");
        System.out.println(g1.getT());

        Generic01<Integer> g2 = new Generic01<>();
        g2.setT(18);
        System.out.println(g2.getT());
    }
}
