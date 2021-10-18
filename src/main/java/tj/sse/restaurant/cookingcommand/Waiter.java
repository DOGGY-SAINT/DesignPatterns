package tj.sse.restaurant.cookingcommand;

import java.util.Scanner;

//调用者：服务员
public class Waiter {
    private Food Chicken, Rib, ChickenRib, FrenchFries, Cola;

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

    public void order() {
        System.out.println("【餐品名称\t\t价格（RMB）】");

        System.out.print("1. 烤鸡：\t\t100\n" +
                "2. 排骨：\t\t80RMB\n" +
                "3. 薯条：\t\t30RMB\n" +
                "4. 可乐：\t\t20RMB\n" +
                "5. 烤鸡拼盘：\t\t120RMB\n" +
                "6. 排骨拼盘：\t\t100RMB\n" +
                "7. 烤鸡排骨拼盘\t200RMB\n" +
                "0. 结束点餐\n");

        while (true) {
            System.out.println("\n【请选择您需要的单品/拼盘：（输入1个序号后点击回车）】");
            Scanner scanner = new Scanner(System.in);
            String choice;
            choice = scanner.next();
            switch (choice) {
                case "1":
                    this.chooseChicken();
                    break;
                case "2":
                    this.chooseRib();
                    break;
                case "3":
                    this.chooseFrenchFries();
                    break;
                case "4":
                    this.chooseCola();
                    break;
                case "5":
                    this.chooseChickenPlatter();
                    break;
                case "6":
                    this.chooseRibPlatter();
                    break;
                case "7":
                    this.chooseChickenRibPlatter();
                    break;
                case "0":
                    System.out.println("点餐完成，请等待美食吧！");
                    System.exit(1);
                default:
                    System.out.println("请输入0-7中的某个数字");
                    break;
            }
        }


    }
}
