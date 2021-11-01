package tj.sse.restaurant.menucomponent;
/**
 * @Classname MenuComponent
 * @Description 菜单抽象类，定义各类所需函数
 * @Author Wang Haoting
 * @Date 2021/10/22 14:52
 * @Version 1.0
 **/
abstract class MenuComponent {

    public abstract void notChoose();
    public abstract void choose();

    public void add(MenuComponent menu) {
            throw new UnsupportedOperationException();
        }

        public void remove(MenuComponent menu) {
            throw new UnsupportedOperationException();
        }

        public MenuComponent getChild(int i) {
            throw new UnsupportedOperationException();
        }

        public String getName() {
            throw new UnsupportedOperationException();
        }

        public double getPrice() {
            throw new UnsupportedOperationException();
        }

        public abstract void print(int level);

    }






