package tj.sse.ticketSystem.flyweight;
import org.junit.jupiter.api.Test;
import tj.sse.AppTest;

import java.util.Objects;

import static tj.sse.ticketSystem.flyweight.FlyweightFactory.getFlyweight;

/**
 * @Classname ticketTest
 * @Description 享元模式测试
 * @Author Administrator
 * @Date 2021/10/23 13:26
 * @Version 1.0
 **/
public class saleTicketTest {
    @Test
    public void saleTicketTest(){
        System.out.println("--------------- [Test] saleDifferentTicket ---------------");
        if(AppTest.input){
            while(true){
                System.out.println("Choose to purchase adult tickets：#1");
                System.out.println("Choose to purchase trial operation ticket：#2");
                System.out.println("Choose to purchase internal test ticket：#3");
                System.out.println("Choose to purchase children tickets：#4");
                System.out.println("Choose to purchase group tickets：#5");
                System.out.println("exit：#exit");
                System.out.println("Please choose tickets to buy:");
                //接受输入的指令
                String cmd= AppTest.scanner.next();
                if(Objects.equals(cmd, "#exit")){
                    break;
                }
                else if (Objects.equals(cmd,"#1")){
                    getFlyweight("Adult tickets");
                }
                else if (Objects.equals(cmd,"#2")){
                    getFlyweight("Trial operation ticket");
                }
                else if (Objects.equals(cmd,"#3")){
                    getFlyweight("Internal test ticket");
                }
                else if (Objects.equals(cmd,"#4")){
                    getFlyweight("Children tickets");

                }
                else if (Objects.equals(cmd,"#5")){
                    getFlyweight("Group tickets");
                }
                else{
                    System.out.println("please input right command.");
                }
            }
        }
        else{
            getFlyweight("Adult tickets");
            System.out.println("\n");
            getFlyweight("Trial operation ticket");
            System.out.println("\n");
            getFlyweight("Internal test ticket");
            System.out.println("\n");
            getFlyweight("Children tickets");
            System.out.println("\n");
            getFlyweight("Group tickets");
            System.out.println("\n");
            getFlyweight("Adult tickets");
            System.out.println("\n");
        }
        System.out.println("--------------------- [End]  ----------------------");
    }

}
