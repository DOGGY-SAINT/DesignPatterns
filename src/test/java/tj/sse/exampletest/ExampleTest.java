package tj.sse.exampletest;


import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author DOGGY_LEE
 * @date 2021/10/19 19:42
 * @description 样例测试
 */
public class ExampleTest {
    @Test
    public void exampleTest(){
        assertTrue(true);
        System.out.println("---------------- [Example Test] --------------");
        System.out.println("True");
        System.out.println("--------------------- [End] ------------------");
    }
}
