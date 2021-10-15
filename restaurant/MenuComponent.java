package command_composite;

import java.util.ArrayList;
import java.util.List;

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


    class Menu extends MenuComponent {
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
            if(level==0){
                System.out.println("\n++++++++++++++++++++++");
                System.out.println("+++"+getName()+"+++");
                System.out.println("++++++++++++++++++++++\n");
            } else if(level==1){
                System.out.println("【"+getName()+"】");
            }else{
                System.out.println("\t"+getName()+"");
            }
            //打印所有子菜单
            for (MenuComponent menu : menuList) {
                if(level==0){
                    System.out.println("======================");
                }
                menu.print(++level);
                if(level==0){
                    System.out.println("======================\n");
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

    class MenuItem extends MenuComponent {
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
            System.out.println("=\t"+getName() + ":\t" + getPrice()+"\t=");
        }
    }






