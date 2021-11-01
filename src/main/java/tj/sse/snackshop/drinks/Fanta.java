package tj.sse.snackshop.drinks;

/**
 * @author DOGGY_LEE
 * @date 2021/10/16 18:36
 * @description 芬达，饮料子类，工厂方法模式
 */
public class Fanta implements Drinks{
    /**
     * @class Fanta.java
     * @method getInf
     * @description 继承，返回信息
     * @param []
     * @return java.lang.String
     * */
    @Override
    public String getInf() {
        return "This is a Fanta";
    }
}
