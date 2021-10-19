package tj.sse.ticketSystem.interpreter;
import java.util.*;

public class CheckCOVID19 {
    /*文法规则
      <expression> ::= <address>的<name>
      <address> ::= Beijing | Los Angeles | Florida | Osaka | Singapore
      <name> ::= Universal Studios
    */
    public static void infoRecovery() {
        Context condition = new Context();
        System.out.println("--------------");
        System.out.println("Universal Studios in Beijing：#1");
        System.out.println("Universal Studios in Los Angeles：#2");
        System.out.println("Universal Studios in Florida：#3");
        System.out.println("Universal Studios in Osaka：#4");
        System.out.println("Universal Studios in Singapore：#5");
        System.out.println("exit：#exit");
        System.out.println("please choose the Universal Studio to buy tickets:");

        while(true){
            //接受输入的指令
            String cmd = new Scanner(System.in).next();
            if(Objects.equals(cmd, "#exit")){
                break;
            }
            else if (Objects.equals(cmd,"#1")){
                condition.freeRide("Universal Studios in Beijing");
            }
            else if (Objects.equals(cmd,"#2")){
                condition.freeRide("Universal Studios in Los Angeles");
            }
            else if (Objects.equals(cmd,"#3")){
                condition.freeRide("Universal Studios in Florida");
            }
            else if (Objects.equals(cmd,"#4")){
                condition.freeRide("Universal Studios in Osaka");

            }
            else if (Objects.equals(cmd,"#5")){
                condition.freeRide("Universal Studios in Singapore");
            }
            else{
                System.out.println("please input right command");
            }
        }
    }
}

