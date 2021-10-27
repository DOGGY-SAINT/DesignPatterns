package tj.sse.universalresort;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;

/**
 * @author DOGGY_LEE
 * @date 2021/10/15 13:00
 * @description 环球影城测试类
 */
public class UniversalResortTest {
    @Test
    public void Test(){
        System.out.println("---------------- [Test] Singleton ----------------");
        UniversalResort u1=UniversalResort.getInstance(),u2=UniversalResort.getInstance();
        if(AppTest.input){
            while(true){
                System.out.println("u1: "+u1);
                System.out.println("u2: "+u2);
                System.out.println("0 exit, 1 refresh u1, 2 refresh u2");
                String str=AppTest.scanner.next();
                if(str.equals("0"))
                    break;
                else if(str.equals("1"))
                    u1=UniversalResort.getInstance();
                else if(str.equals("2"))
                    u2=UniversalResort.getInstance();
            }
        }
        else{
            System.out.println("u1: "+u1);
            System.out.println("u2: "+u2);
        }
        System.out.println("------------------------- [End] -------------------------");
    }
}
