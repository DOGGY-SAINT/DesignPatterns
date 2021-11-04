package tj.sse.snackshop.drinks;

/**
 * @Classname NullShelf
 * @Description 处理null情况，空对象模式
 * @Author tianxi
 * @Date 2021-11-04 23:31
 * @Version 1.0
 **/
public class NullShelf implements Shelf{
    /**
     *@Author tianxi
     *@Description 获取饮料，空对象模式
     *@Date 23:35 2021-11-04
     *@Param []
     *@return tj.sse.snackshop.drinks.Drinks
     **/

    @Override
    public Drinks getDrinks(){
        return new NullDrink();
    }
}
