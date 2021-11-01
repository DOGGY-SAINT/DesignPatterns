package tj.sse.snackshop.milktea;

/**
 * @Classname ColdMilkTea
 * @Description 温度子类，桥接模式
 * @Author tianxi
 * @Date 2021-10-10 13:31
 * @Version 1.0
 **/
public class ColdMilkTea extends MilkTea {
    /**
     * @class ColdMilkTea.java
     * @method getInf
     * @description 继承，返回奶茶具体信息
     * @param []
     * @return java.lang.String
     * */
    @Override
    public String getInf(){
        return "Cold Milk Tea + "+sweetness.getSweetness()+" + "+item.getItem();
    };
}
