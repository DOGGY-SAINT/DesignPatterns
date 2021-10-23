package tj.sse.souvenir;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;
import tj.sse.Souvenir.mediator.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 周边售卖中介代理的测试
 */
public class MediatorTest {
    @Test
    public void test(){
        Mediator md = new ConcreteMediator();
        Trader c1, c2;
        c1 = new ConcreteTrader1();
        c2 = new ConcreteTrader2();
        md.register(c1);
        md.register(c2);

        System.out.println("\n【Souvenir agent: Do you want to buy some souvenirs？（Y/N）】");

        if(AppTest.input){
            while (true){
                String choice;
                choice = AppTest.scanner.next();
                if(choice.equals("N"))
                    break;
                else if(choice.equals("Y")){
                    c1.send();
                    System.out.println("-------------");
                    c2.send();
                    break;
                }
                else
                    System.out.println("Please enter Y/N:");
            }
        }else{
            c1.send();
            System.out.println("-------------");
            c2.send();
            return;
        }
        System.out.println("-----------------------[End]--------------------------");

    }





}
