package tj.sse.snackshop.milktea;

import org.junit.jupiter.api.Test;

/**
 * @author DOGGY_LEE
 * @date 2021/10/15 18:46
 * @description 奶茶测试
 */
public class MilkTeaTest {
    @Test
    public void milkTeaTest()
    {
        System.out.println("---------------- [Test] MilkTea ----------------");
        MilkTeaMachine machine=new MilkTeaMachine();
        MilkTea mt;
        System.out.println("Template milk tea:");
        mt=machine.getMilkTea("PearlMilkTea");
        System.out.println(mt.getInf());
        mt=machine.getMilkTea("CocountMilkTea");
        System.out.println(mt.getInf());

        System.out.println("");
        System.out.println("Free set milk tea:");
        mt=machine.getMilkTea("Hot HalfSuger Cocount");
        System.out.println(mt.getInf());
        mt=machine.getMilkTea("Cold LittleSuger Pearl");
        System.out.println(mt.getInf());
        System.out.println("-------------------- [End] --------------------");
    }
}
