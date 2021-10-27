package tj.sse.snackshop.drinks;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;
import tj.sse.snackshop.icecream.IcecreamMachine;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author DOGGY_LEE
 * @date 2021/10/16 18:58
 * @description 饮料测试
 */
public class DrinksTest {
    @Test
    public void drinksTest()
    {
        System.out.println("---------------- [Test] Factory Method ----------------");
        if(AppTest.input){
            System.out.println("Do you want Fanta or Coke?:");
            String str= AppTest.scanner.next();
            DrinksSeller seller=new DrinksSeller();
            Drinks mt;
            mt=seller.getDrinks(str);
            if(mt==null)
                System.out.println("Drinks not exist");
            else
                System.out.println(mt.getInf());
        }
        else{
            DrinksSeller seller=new DrinksSeller();
            Drinks mt;
            mt=seller.getDrinks("Cola");
            System.out.println(mt.getInf());
            mt=seller.getDrinks("Fanta");;
            System.out.println(mt.getInf());
        }
        System.out.println("--------------------- [End] ---------------------");
    }
}
