package tj.sse.exampletest;


import org.junit.jupiter.api.Test;
import tj.sse.App;
import tj.sse.AppTest;

import java.util.Scanner;
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
        System.out.println("---------------- [Example Test] --------------");
        if(AppTest.input){
            System.out.println("Input:");
            String str= AppTest.scanner.next();
            System.out.println("You input:"+str);
        }
        else{
            assertTrue(true);
            System.out.println("True");
        }
        System.out.println("--------------------- [End] ------------------");
    }
}
