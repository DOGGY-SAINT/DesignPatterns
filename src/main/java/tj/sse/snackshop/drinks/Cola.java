package tj.sse.snackshop.drinks;

/**
 * @author DOGGY_LEE
 * @date 2021/10/16 18:51
 * @description 可乐类，饮料子类，工厂方法模式
 */
public class Cola implements Drinks{
    /**
     * @class Cola.java
     * @method getInf
     * @description 继承，返回信息
     * @param []
     * @return java.lang.String
     * */
    @Override
    public String getInf() {
        return "This is a Cola";
    }

    /**
     *@Author tianxi
     *@Description 判断饮料是否为空
     *@Date 23:33 2021-11-04
     *@Param []
     *@return boolean
     **/
    @Override
    public boolean isNull(){
        return false;
    }
}
