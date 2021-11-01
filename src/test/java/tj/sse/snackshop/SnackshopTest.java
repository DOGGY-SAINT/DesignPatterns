package tj.sse.snackshop;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;
import tj.sse.snackshop.drinks.Drinks;
import tj.sse.snackshop.drinks.DrinksSeller;
import tj.sse.snackshop.icecream.IcecreamMachine;
import tj.sse.snackshop.milktea.MilkTea;
import tj.sse.snackshop.milktea.MilkTeaMachine;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @Classname SnackshopTest
 * @Description 测试甜点部分，包含工厂模式，建造者模式，适配器模式，桥接模式
 * @Author tianxi
 * @Date 2021-10-29 13:35
 * @Version 1.0
 **/
public class SnackshopTest {
    @Test
    public void SnackshopTest(){
        System.out.println("------------- [Test] Snackshop -------------");
        if(AppTest.input){
            while(true){
                System.out.println("What do you want to buy?");
                System.out.println("1.Drinks");
                System.out.println("2.Icecream");
                System.out.println("3.MilkTea");
                System.out.println("4.Nothing to buy");
                System.out.println("Select the above serial number:");
                int i= AppTest.scanner.nextInt();
                if(i==1){
                    System.out.println("------------ [Test] Factory Method ------------");
                    System.out.println("Do you want Fanta or Cola?:");
                    String str= AppTest.scanner.next();
                    DrinksSeller seller=new DrinksSeller();
                    Drinks mt;
                    mt=seller.getDrinks(str);
                    if(mt==null)
                        System.out.println(str+" not exist");
                    else{
                        System.out.println("With a spell, your hands appeared out of thin air:");
                        System.out.println(mt.getInf());
                    }
                }
                else if(i==2){
                    System.out.println("--------------- [Test] Adapter ---------------");
                    System.out.println("If you don't want to buy anything, please enter NO.");
                    System.out.println("What flavor of ice cream do you want(blueberries, chocolate, nothing or something else):");
                    String str= AppTest.scanner.next();
                    if(str.equals("NO")){
                        continue;
                    }
                    IcecreamMachine im=new IcecreamMachine();
                    System.out.println(im.getIcecream(str));
                }
                else if(i==3) {
                    System.out.println("--------- [Test] Bridge and Builder ----------");
                    System.out.println("MilkTea is as follows:");
                    System.out.println("1.PearlMilkTea");
                    System.out.println("2.CocountMilkTea");
                    System.out.println("3.Free set milk tea");
                    System.out.println("4.I don't drink milk tea!");
                    System.out.println("What kind of milk tea do you want:");
                    int choose = AppTest.scanner.nextInt();

                    MilkTeaMachine machine = new MilkTeaMachine();
                    MilkTea mt;
                    if (choose == 1) {
                        mt = machine.getMilkTea("PearlMilkTea");
                        System.out.println("With a spell, your hands appeared out of thin air:");
                        System.out.println("Your MilkTea:" + mt.getInf());
                    } else if (choose == 2) {
                        mt = machine.getMilkTea("CocountMilkTea");
                        System.out.println("With a spell, your hands appeared out of thin air:");
                        System.out.println("Your MilkTea:" + mt.getInf());
                    } else if (choose == 3) {
                        System.out.println("Ice:Hot/Cold");
                        System.out.println("Sweetness:HalfSuger/LittleSuger");
                        System.out.println("Item:Cocount/Pearl");
                        System.out.println("This is an example:Hot;HalfSuger;Cocount");
                        System.out.println("Please enter your milk tea type according to the above format:");
                        String str = AppTest.scanner.next();
                        mt = machine.getMilkTea(str);
                        if (mt == null)
                            System.out.println("Wrong input");
                        else{
                            System.out.println("With a spell, your hands appeared out of thin air:");
                            System.out.println("Your MilkTea:" + mt.getInf());
                        }
                    } else if (choose == 4) {
                        System.out.println("Send you a cup of milk tea, maybe you will become addicted!");
                        mt = machine.getMilkTea("PearlMilkTea");
                        System.out.println("With a spell, your hands appeared out of thin air:");
                        System.out.println("Your MilkTea:" + mt.getInf());
                    } else {
                        System.out.println("The option you entered does not exist.");
                    }
                }
                else if(i==4){
                    System.out.println("Thank you for coming and hope to see you again.");
                    break;
                }
                else{
                    System.out.println("The option you entered does not exist.");
                }
            }
        }
        else{
            System.out.println("----------- [Test] Factory Method ----------");
            DrinksSeller seller=new DrinksSeller();
            Drinks dk;
            dk=seller.getDrinks("Cola");
            System.out.println(dk.getInf());
            dk=seller.getDrinks("Fanta");;
            System.out.println(dk.getInf());
            System.out.println("------------------- [End] ------------------");

            System.out.println("-------------- [Test] Adapter --------------");
            assertTrue(true);
            IcecreamMachine im=new IcecreamMachine();
            System.out.println(im.getIcecream("Nothing"));
            System.out.println(im.getIcecream("Apple"));
            System.out.println("------------------- [End] ------------------");

            System.out.println("-------------- [Test] Builder --------------");
            MilkTeaMachine machine=new MilkTeaMachine();
            MilkTea mt;
            System.out.println("Template milk tea:");
            mt=machine.getMilkTea("PearlMilkTea");
            System.out.println(mt.getInf());
            mt=machine.getMilkTea("CocountMilkTea");
            System.out.println(mt.getInf());
            System.out.println("------------------ [End] ------------------");

            System.out.println("-------------- [Test] Bridge --------------");
            System.out.println("");
            System.out.println("Free set milk tea:");
            mt=machine.getMilkTea("Hot;HalfSuger;Cocount");
            System.out.println(mt.getInf());
            mt=machine.getMilkTea("Cold;LittleSuger;Pearl");
            System.out.println(mt.getInf());
            System.out.println("------------------ [End] -----------------");
        }
        System.out.println("------------- [End] Snackshop --------------");
    }
}
