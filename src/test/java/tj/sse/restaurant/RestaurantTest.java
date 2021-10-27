package tj.sse.restaurant;


import java.util.Scanner;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;
import tj.sse.restaurant.menucomponent.*;
import tj.sse.restaurant.cookingcommand.*;


public class RestaurantTest {
    @Test
    public void restaruanrTest(){
        System.out.println("------------------[Restaurant Test]---------------------");

        System.out.println("---------------- [Test] Composite ----------------");
        Menu menu = new Menu("Harry Potter restaurant menu");
        Menu menu1 = new Menu("ChickenRib Platter: 200.0");
        Menu menu2 = new Menu("Rib Platter:\t100.0");
        Menu menu3 = new Menu("Chicken Platter\t120.0");

        //给所有菜单添加三个子菜单
        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);

        //给第二个菜单添加菜单项
        menu2.add(new MenuItem("Rib         ", 80.0));
        menu2.add(new MenuItem("French Fries", 30.0));
        menu2.add(new MenuItem("Cola        ", 20.0));

        //给第三个菜单添加菜单项
        menu3.add(new MenuItem("Chicken      ", 100.0));
        menu3.add(new MenuItem("French Fries", 30.0));
        menu3.add(new MenuItem("Cola         ", 20.0));

        //给第一个菜单添加两个子菜单
        menu1.add(menu2);
        menu1.add(menu3);

        //打印所有菜单
        menu.print(0);
        System.out.println("--------------------- [End] ---------------------");

        System.out.println("---------------- [Test] Command ----------------");
        //实例化点菜模板
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

        if(AppTest.input){
            System.out.println("\n【Order now？（Y/N）】");
            while (true){
                String choice;
                choice = AppTest.scanner.next();
                if(choice.equals("N"))
                    break;
                else if(choice.equals("Y")){
                    waiter.order();
                    break;
                }
                else
                    System.out.println("Please enter Y/N:");
            }
        }else{
            waiter.order2();
        }
        System.out.println("-----------------------[End]--------------------------");
    }
}
