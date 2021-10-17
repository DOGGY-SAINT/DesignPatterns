package tj.sse.snackshop.icecream;

import org.junit.Test;

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
        System.out.println("--------------- [Test] Icecream ---------------");
        IcecreamMachine im=new IcecreamMachine();
        System.out.println(im.getIcecream("Nothing"));
        System.out.println(im.getIcecream("Apple"));
        im.getIcecream("apple");
        System.out.println("-------------------- [End] --------------------");
    }
}
