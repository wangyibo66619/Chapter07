package GenericTest.demo03;

import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王艺博
 * @date 2021/5/11 11:03
 */
public class GenericDemo {
    public static void main(String[] args) {
        // 类型通配符：<?>
        List<?> list = new ArrayList<Object>();
        List<?> list2 = new ArrayList<String>();
        List<?> list3 = new ArrayList<Integer>();
        // 类型通配符上限：<? extends 类型>
//        List<? extends Number> list4 = new ArrayList<Object>();
          List<? extends Number> list4 = new ArrayList<Number>();
          List<? extends Number> list5 = new ArrayList<Integer>();
        // 类型通配符下限：<? super 类型>
        List<? super Number> list6 = new ArrayList<Object>();
        List<? super Number> list7 = new ArrayList<Number>();
//        List<? super Number> list8 = new ArrayList<Integer>();


    }

}
