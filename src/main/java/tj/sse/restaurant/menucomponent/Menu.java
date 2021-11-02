package tj.sse.restaurant.menucomponent;

import java.util.ArrayList;
import java.util.List;
/**
 * @Classname Menu
 * @Description 菜单类的具体实现
 * @Author Wang Haoting
 * @Date 2021/10/22 14:52
 * @Version 1.0
 **/

public class Menu extends MenuComponent {
    private List<MenuComponent> menuList = new ArrayList<>();//创建菜单列表
    private String name;//定义菜单名

    public Menu(String name) {
        this.name = name;
    }//菜单名赋值

    @Override
    public void add(MenuComponent menu) {
        menuList.add(menu);
    }//重载增加菜单函数，增加现有菜单

    @Override
    public void remove(MenuComponent menu) {
        menuList.remove(menu);
    }//重载移除菜单函数，移除现有菜单

    @Override
    public MenuComponent getChild(int i) {
        return menuList.get(i);
    }//重载得到子菜单函数

    @Override
    public String getName() {
        return name;
    }//重载得到菜单名函数

    @Override//打印函数，用于输出整个套餐内容
    public void print(int level) {
        if (level == 0) {
            System.out.println("\n++++++++++++++++++++++++++++++++++++++");
            System.out.println("   " + getName() + "   ");
            System.out.println("++++++++++++++++++++++++++++++++++++++\n");
        } else if (level == 1) {
            System.out.println("【" + getName() + "】");
        } else {
            System.out.println(getName() + "--------");
        }
        //打印所有子菜单
        for (MenuComponent menu : menuList) {
            if (level == 0) {
                System.out.println("=============================");
            }
            menu.print(++level);
            if (level == 0) {
                System.out.println("=============================\n");
            }
            level--;
        }

    }

    @Override//菜单选择状态
    public void choose() {
        for (MenuComponent menu : menuList) {
            menu.choose();
        }

    }

    @Override//菜单不选择状态
    public void notChoose() {
        for (MenuComponent menu : menuList) {
            menu.notChoose();
        }
    }
}
