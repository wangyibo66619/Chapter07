package SetTest;

import java.util.HashSet;

/**
 * @author 王艺博
 * @date 2021/5/9 15:55
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("大根",18);
        Student s2 = new Student("二根",18);
        Student s3 = new Student("小根",18);
        Student s4 = new Student("小根",18);

        HashSet<Student> h1 = new HashSet<>();
        h1.add(s1);
        h1.add(s2);
        h1.add(s3);

        for ( Student s : h1 ) {
            System.out.println(s.getName() + s.getAge());
        }
    }
}
