package tj.sse.playItems.utils;
/**
 * @author Mocha
 *
 * 游客
 */
public class Visitor {

    /**
     * 游客年龄
     */
    private int age;

    /**
     * 游客名字
     */
    private String name;

    /**
     * 游客身高
     */
    private double height;

    /**
     * 游客性别
     */
    private Gender gender;

    public Visitor(String name) {
        this.name = name;
    }

    public Visitor setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Visitor setAge(int age) {
        this.age = age;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public Visitor setHeight(double height) {
        this.height = height;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Visitor setGender(Gender gender) {
        this.gender = gender;
        return this;
    }
}
