package Collections.Demo01;

import Collections.Demo01.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author 王艺博
 * @date 2021/5/15 8:50
 */
public class TestStudent {
    public static void main(String[] args) {
        // 创建集合对象
        List<Student> list = new ArrayList<>();
        // 创建学生对象
        Student s1 = new Student("dagen", 18);
        Student s2 = new Student("xiaogen", 18);
        Student s3 = new Student("xiaoxiaogen", 17);
        Student s4 = new Student("dadagen", 19);

        // 添加学生对象到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        // 排序
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge() - o2.getAge();
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                return num2;
            }
        });

        for ( Student s : list ) {
            System.out.println(s.getName() + "\t" + s.getAge());
        }
    }
}
