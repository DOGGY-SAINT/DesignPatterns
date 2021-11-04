package tj.sse.snackshop.drinks;

/**
 * @Classname NullDrink
 * @Description 处理null的情况，空对象模式
 * @Author tianxi
 * @Date 2021-11-04 23:28
 * @Version 1.0
 **/
public class NullDrink implements Drinks{
    /**
     *@Author tianxi
     *@Description 判断饮料是否为空
     *@Date 23:33 2021-11-04
     *@Param []
     *@return boolean
     **/
    @Override
    public boolean isNull(){
        return true;
    }
    /**
     *@Author tianxi
     *@Description 获取饮料信息，空对象模式
     *@Date 23:34 2021-11-04
     *@Param []
     *@return java.lang.String
     **/

    @Override
    public String getInf(){
        return "Nothing appears!Because the drink you selected does not exist or has been sold out.";
    }
}
