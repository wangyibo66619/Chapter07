package GenericTest.interfaceTest;

/**
 * @author 王艺博
 * @date 2021/5/11 10:51
 */
public class GenericDemo {
    public static void main(String[] args) {
        GenericImpl<String> s = new GenericImpl<>();
        s.show("大根");
        GenericImpl<Integer> i = new GenericImpl<>();
        i.show(18);
    }
}
