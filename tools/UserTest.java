package edu.xcdq.tools;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 王艺博
 * @date 2021/5/7 11:04
 */
public class UserTest {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<User>();

        list.add( new User(110,"Mark") );
        list.add( new User(101,"张三") );
        list.add( new User(100,"李四") );
        list.add( new User(111,"大根") );

        Collections.sort(list);
        for (User user : list) {
            System.out.println(user);
        }
    }
}
