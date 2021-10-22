package tj.sse.snackshop.milktea;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;
import tj.sse.snackshop.icecream.IcecreamMachine;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author DOGGY_LEE
 * @date 2021/10/15 18:46
 * @description 奶茶测试
 */
public class MilkTeaTest {
    @Test
    public void milkTeaTest()
    {
        System.out.println("---------------- [Test] MilkTea ----------------");
        if(AppTest.input){
            System.out.println("MilkTea is as follows:");
            System.out.println("1.PearlMilkTea");
            System.out.println("2.CocountMilkTea");
            System.out.println("3.Free set milk tea");
            System.out.println("4.I don't drink milk tea!");
            System.out.println("What kind of milk tea do you want:");
            int i=AppTest.scanner.nextInt();

            MilkTeaMachine machine=new MilkTeaMachine();
            MilkTea mt;
            if(i==1){
                mt=machine.getMilkTea("PearlMilkTea");
                System.out.println("Your MilkTea:"+mt.getInf());
            }
            else if(i==2){
                mt=machine.getMilkTea("CocountMilkTea");
                System.out.println("Your MilkTea:"+mt.getInf());
            }
            else if(i==3){
                System.out.println("Ice:Hot/Cold");
                System.out.println("Sweetness:HalfSuger/LittleSuger");
                System.out.println("Item:Cocount/Pearl");
                System.out.println("This is an example:Hot;HalfSuger;Cocount");
                System.out.println("Please enter your milk tea type according to the above format:");
                String str=AppTest.scanner.next();
                mt=machine.getMilkTea(str);
                System.out.println("Your MilkTea:"+mt.getInf());
            }
            else if(i==4){
                System.out.println("Send you a cup of milk tea, maybe you will become addicted!");
                mt=machine.getMilkTea("PearlMilkTea");
                System.out.println("Your MilkTea:"+mt.getInf());
            }
            else {
                System.out.println("The option you entered does not exist, please enter a number between 1-3.");
            }
        }
        else{
            MilkTeaMachine machine=new MilkTeaMachine();
            MilkTea mt;
            System.out.println("Template milk tea:");
            mt=machine.getMilkTea("PearlMilkTea");
            System.out.println(mt.getInf());
            mt=machine.getMilkTea("CocountMilkTea");
            System.out.println(mt.getInf());

            System.out.println("");
            System.out.println("Free set milk tea:");
            mt=machine.getMilkTea("Hot;HalfSuger;Cocount");
            System.out.println(mt.getInf());
            mt=machine.getMilkTea("Cold;LittleSuger;Pearl");
            System.out.println(mt.getInf());
        }
        System.out.println("--------------------- [End] -------------- ----");
    }
}
