package tj.sse.restaurant.menucomponent;
/**
 * @Classname MenuComponent
 * @Description 菜单类，重载定义所需函数
 * @Author Wang Haoting
 * @Date 2021/10/22 14:52
 * @Version 1.0
 **/
public class MenuItem extends MenuComponent {//定义菜单元素，包括名字与价格
    private String name;
    private double price;

    public MenuItem(String name, double price) {//实例化菜单
        this.name = name;
        this.price = price;
    }

    @Override
    public void choose() {
        this.choose();
    }//返回此次选择

    @Override
    public void notChoose() {
        this.notChoose();
    }//返回此次不选择

    @Override
    public String getName() {
        return name;
    }//返回菜单名

    @Override
    public double getPrice() {
        return price;
    }//返回菜单价格

    @Override
    public void print(int level) {
        System.out.println(getName() + "\t" + getPrice());
    }
    //输出实例化后菜单名与菜单价格
}
