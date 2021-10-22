package tj.sse.ticketSystem.interpreter;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;

import java.util.Objects;

public class CheckCOVID19Test {
    @Test
    public void checkCOVID19Test(){
        System.out.println("--------------- [Test] CheckCOVID19 ---------------");
        if(AppTest.input){
            Context condition = new Context();
            while(true){
                System.out.println("Universal Studios in Beijing：#1");
                System.out.println("Universal Studios in Los Angeles：#2");
                System.out.println("Universal Studios in Florida：#3");
                System.out.println("Universal Studios in Osaka：#4");
                System.out.println("Universal Studios in Singapore：#5");
                System.out.println("exit：#exit");
                System.out.println("please choose the Universal Studio to buy tickets:");
                //接受输入的指令
                String cmd= AppTest.scanner.next();
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
                    System.out.println("please input right command.");
                }
            }
        }
        else{
            Context condition = new Context();
            condition.freeRide("Universal Studios in Beijing");
            condition.freeRide("Universal Studios in Los Angeles");
            condition.freeRide("Universal Studios in Florida");
            condition.freeRide("Universal Studios in Osaka");
            condition.freeRide("Universal Studios in Singapore");
        }
        System.out.println("--------------------- [End]  ----------------------");
    }
}
