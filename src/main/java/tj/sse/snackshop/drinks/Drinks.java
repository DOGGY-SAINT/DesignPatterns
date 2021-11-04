package tj.sse.snackshop.drinks;

/**
 * @author DOGGY_LEE
 * @date 2021/10/16 18:34
 * @description 饮料接口类，工厂方法模式
 */
public interface Drinks {
    /**
     * @class drinks
     * @method getInf
     * @description 获取饮料信息
     * @param []
     * @return java.lang.String
     * */
    public String getInf();
    /**
     *@Author tianxi
     *@Description 判断是否为空，空对象模式
     *@Date 23:27 2021-11-04
     *@Param []
     *@return boolean
     **/

    public boolean isNull();
}
