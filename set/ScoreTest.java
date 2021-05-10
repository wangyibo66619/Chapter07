package SetTest;

import java.util.TreeSet;

/**
 * @author 王艺博
 * @date 2021/5/10 15:03
 */
public class ScoreTest {
    public static void main(String[] args) {
        // 通过有参构造传入值
        Score s1 = new Score("dagen", 84, 66);
        Score s2 = new Score("ergen", 90, 55);
        Score s3 = new Score("xiaogen", 60, 75);
        Score s4 = new Score("xiaoxiaogen", 60, 75);

        // 创建集合对象并写入对象
        TreeSet<Score> set2 = new TreeSet<>();
        set2.add(s1);
        set2.add(s2);
        set2.add(s3);
        set2.add(s4);
        // 遍历
        System.out.println("姓名    语文  数学");
        for ( Score s : set2 ) {
            System.out.println(s.getName() + "\t" + s.getYUScore() + "\t" + s.getShuScore());
        }
    }
}
