package tj.sse.ticketsystem;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;
import tj.sse.ticketsystem.frontcontroller.FrontController;

import java.util.Objects;

public class FrontEndTest {
    @Test
    public void test() {
        FrontController frontController = new FrontController();
        if (AppTest.input) {
            System.out.println("---------------  [Test] FrontController   ---------------");
            System.out.println("please enter the 'BUYER' or 'SELLER' to log in the system.");
            System.out.println("you can enter 'exit' to quit.");
            int cmd = AppTest.scanner.nextInt();
            if (Objects.equals(cmd, "BUYER")) {
                frontController.dispatchRequest("BUYER");
            } else {
                frontController.dispatchRequest("SELLER");
            }
            System.out.println("---------------  [End]  ---------------");
        }else {
            System.out.println("---------------  [Test] FrontController   ---------------");
            frontController.dispatchRequest("BUYER");
            frontController.dispatchRequest("SELLER");
            System.out.println("---------------  [End]  ---------------");
        }
    }
}
