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
        System.out.println("【   name\t\t   price（RMB）】");

        System.out.print("1. chicken：\t\t100RMB\n" +
                "2. rib：\t\t\t80RMB\n" +
                "3. french fries：\t30RMB\n" +
                "4. cola：\t\t\t20RMB\n" +
                "5. Chicken Platter：120RMB\n" +
                "6. Rib Platter：\t100RMB\n" +
                "7. ChickenRib Platter 200RMB\n" +
                "0. over\n");

        while (true) {
            System.out.println("\n【Choose what you want to eat：（Enter 0~7 and hit enter）】");
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
                    System.out.println("The order is complete, please wait for the food！");
                    return;
                default:
                    System.out.println("Please enter a number from 0-7");
                    break;
            }
        }
    }

    public void order2() {
        System.out.println("【   name\t\t   price（RMB）】");

        System.out.print("1. Chicken：\t\t100RMB\n" +
                "2. Rib：\t\t\t80RMB\n" +
                "3. French Fries：\t30RMB\n" +
                "4. Cola：\t\t\t20RMB\n" +
                "5. Chicken Platter：120RMB\n" +
                "6. Rib Platter：\t100RMB\n" +
                "7. ChickenRib Platter 200RMB\n" +
                "0. over\n");

            System.out.println("\n【Choose what you want to eat：（Enter 0~7 and hit enter）】");

            System.out.println("\n1");
            this.chooseChicken();

            System.out.println("\n4");
            this.chooseRib();

            System.out.println("\n6");
            this.chooseFrenchFries();

            System.out.println("\n7");
            this.chooseRibPlatter();

            System.out.println("The order is complete, please wait for the food！");

            }
}
