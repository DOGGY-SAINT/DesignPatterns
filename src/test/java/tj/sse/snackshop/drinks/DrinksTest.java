package tj.sse.snackshop.drinks;

import org.junit.jupiter.api.Test;

/**
 * @author DOGGY_LEE
 * @date 2021/10/16 18:58
 * @description 饮料测试
 */
public class DrinksTest {
    @Test
    public void drinksTest()
    {
        System.out.println("---------------- [Test] Drinks ----------------");
        DrinksSeller seller=new DrinksSeller();
        Drinks mt;
        mt=seller.getDrinks("Cola");
        System.out.println(mt.getInf());
        mt=mt=seller.getDrinks("Fanta");;
        System.out.println(mt.getInf());
        System.out.println("-------------------- [End] --------------------");
    }
}
