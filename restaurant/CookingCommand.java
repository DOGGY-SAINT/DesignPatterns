package command_composite;

import java.util.Scanner;

public class CookingCommand { }

//调用者：服务员
class Waiter {
    private Food Chicken, Rib, ChickenRib,FrenchFries,Cola;

    //设置单品
    public void setChicken(Food f) {
        Chicken = f;
    }
    public void setRib(Food f) {
        Rib = f;
    }
    public void setFrenchfries(Food f) {
        FrenchFries = f;
    }
    public void setCola(Food f) {
        Cola = f;
    }

    //选择餐品
    public void chooseChicken() {
        Chicken.cooking();
    }
    public void chooseRib() {
        Rib.cooking();
    }
    public void chooseFrenchFries() {
        FrenchFries.cooking();
    }
    public void chooseCola() {
        Cola.cooking();
    }
    public void chooseChickenPlatter() {
        Chicken.cooking();
        FrenchFries.cooking();
        Cola.cooking();
    }
    public void chooseRibPlatter() {
        Rib.cooking();
        FrenchFries.cooking();
        Cola.cooking();
    }
    public void chooseChickenRibPlatter() {
        Chicken.cooking();
        FrenchFries.cooking();
        Cola.cooking();
        Rib.cooking();
        FrenchFries.cooking();
        Cola.cooking();
    }

    public void order(){
        System.out.println("【餐品名称\t\t价格（RMB）】");

        System.out.print("1. 烤鸡：\t\t100\n" +
                "2. 排骨：\t\t80RMB\n"+
                "3. 薯条：\t\t30RMB\n"+
                "4. 可乐：\t\t20RMB\n"+
                "5. 烤鸡拼盘：\t\t120RMB\n"+
                "6. 排骨拼盘：\t\t100RMB\n"+
                "7. 烤鸡排骨拼盘\t200RMB\n"+
                "0. 结束点餐\n");

        while(true){
            System.out.println("\n【请选择您需要的单品/拼盘：（输入1个序号后点击回车）】");
            Scanner scanner = new Scanner(System.in);
            String choice;
            choice = scanner.next();
            switch (choice){
                case"1":
                    this.chooseChicken();
                    break;
                case"2":
                    this.chooseRib();
                    break;
                case"3":
                    this.chooseFrenchFries();
                    break;
                case"4":
                    this.chooseCola();
                    break;
                case"5":
                    this.chooseChickenPlatter();
                    break;
                case"6":
                    this.chooseRibPlatter();
                    break;
                case"7":
                    this.chooseChickenRibPlatter();
                    break;
                case"0":
                    System.out.println("点餐完成，请等待美食吧！");
                    System.exit(1);
                default:
                    System.out.println("请输入0-7中的某个数字");
                    break;
            }
        }



    }
}

//抽象命令：食物
interface Food {
    public abstract void cooking();
}

//具体命令：烤鸡
class Chicken implements Food {
    private ChickenChef receiver;       //创建接收者
    Chicken() {
        receiver = new ChickenChef();   //创建烤鸡厨师对象
    }
    public void cooking() {
        receiver.cooking();
    }
}

//具体命令：排骨
class Rib implements Food {
    private RibChef receiver;        //创建接收者
    Rib() {
        receiver = new RibChef();   //创建排骨厨师对象
    }
    public void cooking() {
        receiver.cooking();
    }
}

//具体命令：薯条
class FrenchFries implements Food {
    private FrenchFriesChef receiver;       //创建接收者
    FrenchFries() {
        receiver = new FrenchFriesChef();   //创建薯条厨师对象
    }
    public void cooking() {
        receiver.cooking();
    }
}

//具体命令：可乐
class Cola implements Food {
    private ColaChef receiver;      //创建接收者
    Cola() {
        receiver = new ColaChef();  //创建可乐厨师对象
    }
    public void cooking() {
        receiver.cooking();
    }
}

//具体命令：烤鸡拼盘
class ChickenPlatter implements Food {
    //创建接收者
    private ChickenChef receiver1;
    private FrenchFriesChef receiver2;
    private ColaChef receiver3;

    ChickenPlatter(){
        receiver1= new ChickenChef();       //创建烤鸡厨师对象
        receiver2= new FrenchFriesChef();   //创建薯条厨师对象
        receiver3= new ColaChef();          //创建可乐厨师对象
    }
    public void cooking() {
        receiver1.cooking();
        receiver2.cooking();
        receiver3.cooking();
    }
}

//具体命令：排骨拼盘
class RibPlatter implements Food {
    //创建接收者
    private RibChef receiver1;
    private FrenchFriesChef receiver2;
    private ColaChef receiver3;

    RibPlatter(){
        receiver1= new RibChef();           //创建排骨厨师对象
        receiver2= new FrenchFriesChef();   //创建薯条厨师对象
        receiver3= new ColaChef();          //创建可乐厨师对象
    }
    public void cooking() {
        receiver1.cooking();
        receiver2.cooking();
        receiver3.cooking();
    }
}

//具体命令：烤鸡排骨拼盘
class ChickenRibPlatter implements Food {
    //创建接收者
    private ChickenChef receiver1;
    private RibChef receiver2;
    private FrenchFriesChef receiver3;
    private ColaChef receiver4;

    ChickenRibPlatter(){
        receiver1= new ChickenChef();       //创建烤鸡厨师对象
        receiver2= new RibChef();           //创建排骨厨师对象
        receiver3= new FrenchFriesChef();   //创建薯条厨师对象
        receiver4= new ColaChef();          //创建可乐厨师对象
    }
    public void cooking() {
        receiver1.cooking();
        receiver2.cooking();
        receiver3.cooking();
        receiver3.cooking();
        receiver4.cooking();
        receiver4.cooking();
    }
}



//接收者：烤鸡厨师
class ChickenChef  {
    public void cooking() {
        System.out.println("一份烤鸡");
    }
}

//接收者：排骨厨师
class RibChef{
    public void cooking() {
        System.out.println("一份排骨");
    }
}

//接收者：薯条厨师
class FrenchFriesChef  {
    public void cooking() {
        System.out.println("一份薯条");
    }
}

//接收者：可乐厨师
class ColaChef{
    public void cooking() {
        System.out.println("一份可乐");
    }
}
