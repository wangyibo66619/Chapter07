package GenericTest.demo02;

/**
 * @author 王艺博
 * @date 2021/5/11 10:05
 */
/*
    泛型方法
 */
/*
public class Generic02 {
    public void show(String s) {
        System.out.println(s);
    }
    public void show(Integer i) {
        System.out.println(i);
    }
    public void show(Boolean b) {
        System.out.println(b);
    }
}*/



// 泛型类改进
//public class Generic02<E> {
//    public void show(E e) {
//        System.out.println(e);
//    }
//}



public class Generic02 {
    public <T> void show(T t) {
        System.out.println(t);
    }
}


