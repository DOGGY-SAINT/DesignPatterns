package tj.sse.ticketSystem.interpreter;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;

import java.util.Objects;

public class CheckCOVID19Test {
    @Test
    public void checkCOVID19Test(){
        System.out.println("--------------- [Test] CheckCOVID19 ---------------");
        Context condition = new Context();
        if(AppTest.input){
            while(true){
                System.out.println("UniversalStudio in Beijing：#1");
                System.out.println("UniversalStudio in LosAngeles：#2");
                System.out.println("UniversalStudio in Florida：#3");
                System.out.println("UniversalStudio in Osaka：#4");
                System.out.println("UniversalStudio in Singapore：#5");
                System.out.println("exit：#exit");
                System.out.println("please choose the UniversalStudio to buy tickets:");
                //接受输入的指令
                String cmd= AppTest.scanner.next();
                if(Objects.equals(cmd, "#exit")){
                    break;
                }
                else if (Objects.equals(cmd,"#1")){
                    condition.freeRide("UniversalStudio in Beijing");
                }
                else if (Objects.equals(cmd,"#2")){
                    condition.freeRide("UniversalStudio in LosAngeles");
                }
                else if (Objects.equals(cmd,"#3")){
                    condition.freeRide("UniversalStudio in Florida");
                }
                else if (Objects.equals(cmd,"#4")){
                    condition.freeRide("UniversalStudio in Osaka");

                }
                else if (Objects.equals(cmd,"#5")){
                    condition.freeRide("UniversalStudio in Singapore");
                }
                else{
                    System.out.println("please input right command.");
                }
            }
        }
        else{
            condition.freeRide("UniversalStudio in Beijing");
            condition.freeRide("UniversalStudio in LosAngeles");
            condition.freeRide("UniversalStudio in Florida");
            condition.freeRide("UniversalStudio in Osaka");
            condition.freeRide("UniversalStudio in Singapore");
        }
        System.out.println("--------------------- [End]  ----------------------");
    }
}
