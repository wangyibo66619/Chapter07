package SetTest;

/**
 * @author 王艺博
 * @date 2021/5/10 15:03
 */
public class Score implements Comparable<Score>{
    private String name; // 姓名
    private int YUScore;// 语文成绩
    private int ShuScore;// 数学成绩

    public Score() {
    }

    public Score(String name, int YUScore, int shuScore) {
        this.name = name;
        this.YUScore = YUScore;
        ShuScore = shuScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYUScore() {
        return YUScore;
    }

    public void setYUScore(int YUScore) {
        this.YUScore = YUScore;
    }

    public int getShuScore() {
        return ShuScore;
    }

    public void setShuScore(int shuScore) {
        ShuScore = shuScore;
    }

    @Override
    public int compareTo(Score o) {
        int sum = o.getYUScore() + o.getShuScore();
        int sum2 = this.getYUScore() + this.getShuScore();
        int num = sum - sum2;
        int num2 = num == 0 ? ( this.getName().compareTo(o.getName()) ) : num;
        return num2;
    }

}
