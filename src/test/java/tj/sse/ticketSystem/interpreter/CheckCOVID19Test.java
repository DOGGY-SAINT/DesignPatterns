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
                System.out.println("UniversalStudios in Beijing：#1");
                System.out.println("UniversalStudios in LosAngeles：#2");
                System.out.println("UniversalStudios in Florida：#3");
                System.out.println("UniversalStudios in Osaka：#4");
                System.out.println("UniversalStudios in Singapore：#5");
                System.out.println("exit：#exit");
                System.out.println("please choose the UniversalStudio to buy tickets:");
                //接受输入的指令
                String cmd= AppTest.scanner.next();
                if(Objects.equals(cmd, "#exit")){
                    break;
                }
                else if (Objects.equals(cmd,"#1")){
                    condition.freeRide("UniversalStudios in Beijing");
                }
                else if (Objects.equals(cmd,"#2")){
                    condition.freeRide("UniversalStudios in LosAngeles");
                }
                else if (Objects.equals(cmd,"#3")){
                    condition.freeRide("UniversalStudios in Florida");
                }
                else if (Objects.equals(cmd,"#4")){
                    condition.freeRide("UniversalStudios in Osaka");

                }
                else if (Objects.equals(cmd,"#5")){
                    condition.freeRide("UniversalStudios in Singapore");
                }
                else{
                    System.out.println("please input right command.");
                }
            }
        }
        else{
            condition.freeRide("UniversalStudios in Beijing");
            condition.freeRide("UniversalStudios in LosAngeles");
            condition.freeRide("UniversalStudios in Florida");
            condition.freeRide("UniversalStudios in Osaka");
            condition.freeRide("UniversalStudios in Singapore");
        }
        System.out.println("--------------------- [End]  ----------------------");
    }
}
