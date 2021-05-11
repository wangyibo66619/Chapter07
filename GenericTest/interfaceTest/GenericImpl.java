package GenericTest.interfaceTest;

/**
 * @author 王艺博
 * @date 2021/5/11 10:53
 */
public class GenericImpl<E> implements Generic<E> {

    @Override
    public void show(E e) {
        System.out.println(e);
    }
}
