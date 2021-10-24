package tj.sse.ticketSystem.flyweight;

import java.util.Objects;
import java.util.Scanner;

import static tj.sse.ticketSystem.flyweight.FlyweightFactory.getFlyweight;

/**
 * @Classname Client
 * @Description Client
 * @Author Administrator
 * @Date 2021/10/22 14:51
 * @Version 1.0
 **/
public class ChooseTicket {

    public static void main() {
        System.out.println("--------------- [Test] saleDifferentTicket ---------------");
        System.out.println("Choose to purchase adult tickets：#1");
        System.out.println("Choose to purchase trial operation ticket：#2");
        System.out.println("Choose to purchase internal test ticket：#3");
        System.out.println("Choose to purchase children tickets：#4");
        System.out.println("Choose to purchase group tickets：#5");
        System.out.println("exit：#exit");
        while(true){
            System.out.println("Please input command:");
            //接受输入的指令
            String cmd= new Scanner(System.in).nextLine();
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
        System.out.println("--------------------- [End]  ----------------------");
    }

}
