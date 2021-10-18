package tj.sse.restaurant;


import java.util.Scanner;
import tj.sse.restaurant.menucomponent.*;
import tj.sse.restaurant.cookingcommand.*;

import static org.junit.Assert.assertTrue;

public class RestaurantTest {
    public static void main(String[] args) {
        Menu menu = new Menu("哈利波特主题餐厅菜单");
        Menu menu1 = new Menu("排骨烤鸡拼盘: 200.0");
        Menu menu2 = new Menu("排骨拼盘:\t100.0");
        Menu menu3 = new Menu("烤鸡拼盘\t120.0");

        //给所有菜单添加三个子菜单
        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);

        //给第二个菜单添加菜单项
        menu2.add(new MenuItem("炸排骨", 80.0));
        menu2.add(new MenuItem("炸薯条", 30.0));
        menu2.add(new MenuItem("可乐", 20.0));

        //给第三个菜单添加菜单项
        menu3.add(new MenuItem("烤鸡", 100.0));
        menu3.add(new MenuItem("炸薯条", 30.0));
        menu3.add(new MenuItem("可乐", 20.0));


        //给第一个菜单添加两个子菜单
        menu1.add(menu2);
        menu1.add(menu3);

        //打印所有菜单
        menu.print(0);

        System.out.println("\n【请问现在需要点单吗？（Y/N）】");
        Scanner scanner = new Scanner(System.in);
        while (true){
            String choice;
            choice = scanner.next();
            switch (choice){
                case"Y":
                    Food food1 = new Chicken();
                    Food food2 = new Rib();
                    Food food3 = new FrenchFries();
                    Food food4 = new Cola();
                    Food food5 = new ChickenPlatter();
                    Food food6 = new RibPlatter();
                    Food food7 = new ChickenRibPlatter();
                    Waiter waiter = new Waiter();      //new一个服务员
                    //设置单品
                    waiter.setChicken(food1);          //设置烤鸡
                    waiter.setRib(food2);              //设置排骨
                    waiter.setFrenchfries(food3);      //设置薯条
                    waiter.setCola(food4);             //设置可乐
                    //点菜
                    waiter.order();
                case"N":
                    System.out.println("感谢使用！");
                    System.exit(1);
                default:
                    System.out.println("请输入Y或者N:");
                    break;
            }
        }
    }
}
