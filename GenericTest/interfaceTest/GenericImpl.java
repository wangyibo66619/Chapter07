package GenericTest.interfaceTest;

/**
 * @author ηθΊε
 * @date 2021/5/11 10:53
 */
public class GenericImpl<E> implements Generic<E> {

    @Override
    public void show(E e) {
        System.out.println(e);
    }
}
