package edu.xcdq.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author 王艺博
 * @date 2021/5/7 11:17
 */
public class PersonTest {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        list.add( new Person(110,"Mark") );
        list.add( new Person(101,"张三") );
        list.add( new Person(100,"李四") );
        list.add( new Person(111,"大根") );
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getUserId() - o2.getUserId();
            }
        });

        for ( Person p : list ) {
            System.out.println( p );
        }
    }
}
