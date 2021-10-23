package tj.sse.ticketSystem.interpreter;
import java.util.Objects;
import java.util.Scanner;

public class CheckCOVID19 {
    public static void checkCOVID19(){
        Context condition = new Context();
        condition.freeRide("UniversalStudios in Beijing");
        condition.freeRide("UniversalStudios in LosAngeles");
        condition.freeRide("UniversalStudios in Florida");
        condition.freeRide("UniversalStudios in Osaka");
        condition.freeRide("UniversalStudios in Singapore");
    }
}
