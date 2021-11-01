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
    private List<MenuComponent> menuList = new ArrayList<>();
    private String name;

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent menu) {
        menuList.add(menu);
    }

    @Override
    public void remove(MenuComponent menu) {
        menuList.remove(menu);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuList.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
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

    @Override
    public void choose() {
        for (MenuComponent menu : menuList) {
            menu.choose();
        }

    }

    @Override
    public void notChoose() {
        for (MenuComponent menu : menuList) {
            menu.notChoose();
        }
    }
}
