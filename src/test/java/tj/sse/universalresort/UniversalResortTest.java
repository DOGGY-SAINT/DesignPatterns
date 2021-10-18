package tj.sse.universalresort;

import org.junit.Test;

/**
 * @author DOGGY_LEE
 * @date 2021/10/15 13:00
 * @description 环球影城测试类
 */
public class UniversalResortTest {
    @Test
    public void Test(){
        System.out.println("---------------- [Test] UniversalResort ----------------");
        UniversalResort u1=UniversalResort.getInstance(),u2=UniversalResort.getInstance();
        System.out.println("u1: "+u1);
        System.out.println("u2: "+u1);
        System.out.println("------------------------- [End] -------------------------");
    }
}
