package tj.sse.ticketSystem.interpreter;
import java.util.Objects;
import java.util.Scanner;

public class CheckCOVID19 {
    public static void checkCOVID19(){
        System.out.println("UniversalStudio in Beijing：#1");
        System.out.println("UniversalStudio in LosAngeles：#2");
        System.out.println("UniversalStudio in Florida：#3");
        System.out.println("UniversalStudio in Osaka：#4");
        System.out.println("UniversalStudio in Singapore：#5");
        System.out.println("exit：#exit");
        System.out.println("please choose the UniversalStudio to buy tickets:");
        Context condition = new Context();
        while(true){
            System.out.println("please input command:");
            //接受输入的指令
            String cmd= new Scanner(System.in).nextLine();
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
}
