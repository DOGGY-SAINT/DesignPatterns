package tj.sse.restaurant.menucomponent;
/**
 * @Classname MenuComponent
 * @Description 菜单抽象类，定义各类所需函数
 * @Author Wang Haoting
 * @Date 2021/10/22 14:52
 * @Version 1.0
 **/
abstract class MenuComponent {

    public abstract void notChoose();//未选择套餐时的状态函数
    public abstract void choose();//选择套餐时的状态函数

    public void add(MenuComponent menu) {
            throw new UnsupportedOperationException();
        }
    //添加新菜单
    public void remove(MenuComponent menu) {
            throw new UnsupportedOperationException();
        }
    //移除已有菜单
    public MenuComponent getChild(int i) {
            throw new UnsupportedOperationException();
        }
    //得到子菜单
    public String getName() {
            throw new UnsupportedOperationException();
        }
    //得到菜单名
    public double getPrice() {
            throw new UnsupportedOperationException();
        }
    //得到菜单价格
    public abstract void print(int level);
    //打印菜单内容

    }






