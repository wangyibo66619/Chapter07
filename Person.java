package edu.xcdq.tools;

/**
 * @author 王艺博
 * @date 2021/5/7 11:16
 */
public class Person {
    private int userId;
    private String name;

    public Person() {
    }

    public Person(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }
}
