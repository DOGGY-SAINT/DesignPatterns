package tj.sse.restaurant.menucomponent;
/**
 * @Classname MenuComponent
 * @Description 菜单类，重载定义所需函数
 * @Author Wang Haoting
 * @Date 2021/10/22 14:52
 * @Version 1.0
 **/
public class MenuItem extends MenuComponent {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void choose() {
        this.choose();
    }

    @Override
    public void notChoose() {
        this.notChoose();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print(int level) {
        System.out.println(getName() + "\t" + getPrice());
    }
}
