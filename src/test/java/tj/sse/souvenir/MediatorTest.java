package tj.sse.souvenir;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;
import tj.sse.souvenir.mediator.*;

/**
 * 周边售卖中介代理的测试
 */
public class MediatorTest {
    @Test
    public void test(){
        System.out.println("-------------------- [Mediator Test] -------------------");
        Mediator md = new ConcreteMediator();
        Trader c1, c2;
        c1 = new ConcreteTrader1();
        c2 = new ConcreteTrader2();
        md.register(c1);
        md.register(c2);

        if(AppTest.input){
            System.out.println("\n【Souvenir agent: Do you want to enter souvenirs market？（Y/N）】");
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
                    System.out.println("error");
            }
        }else{
            c1.autoSend();
            System.out.println("-------------");
            c2.autoSend();
        }
        System.out.println("-------------------------[End]----------------------------");

    }





}
