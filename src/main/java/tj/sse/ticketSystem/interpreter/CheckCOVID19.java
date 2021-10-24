package tj.sse.ticketSystem.interpreter;
import java.util.Objects;
import java.util.Scanner;

public class CheckCOVID19 {
    public static void checkCOVID19(){
        Context condition = new Context();
        condition.freeRide("UniversalStudio in Beijing");
        condition.freeRide("UniversalStudio in LosAngeles");
        condition.freeRide("UniversalStudio in Florida");
        condition.freeRide("UniversalStudio in Osaka");
        condition.freeRide("UniversalStudio in Singapore");
    }
}
