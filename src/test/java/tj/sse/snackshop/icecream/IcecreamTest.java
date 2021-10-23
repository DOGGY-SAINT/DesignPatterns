package tj.sse.snackshop.icecream;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @Classname IcecreamTest
 * @Description Icecream测试
 * @Author tianxi
 * @Date 2021-10-16 1:07
 * @Version 1.0
 **/
public class IcecreamTest {
    @Test
    public void IcecreamTest()
    {

        System.out.println("--------------- [Test] Icecream -------------");
        if(AppTest.input){
            System.out.println("What flavor of ice cream do you want(blueberries, chocolate, or something else):");
            String str= AppTest.scanner.next();
            IcecreamMachine im=new IcecreamMachine();
            System.out.println(im.getIcecream(str));
        }
        else{
            assertTrue(true);
            IcecreamMachine im=new IcecreamMachine();
            System.out.println(im.getIcecream("Nothing"));
            System.out.println(im.getIcecream("Apple"));
        }
        System.out.println("--------------------- [End] ------------------");
    }
}
