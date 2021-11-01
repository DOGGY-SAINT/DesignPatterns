package tj.sse.snackshop.milktea;

/**
 * @Classname HotMilkTea
 * @Description 温度子类，桥接模式
 * @Author tianxi
 * @Date 2021-10-10 13:31
 * @Version 1.0
 **/
 public class HotMilkTea extends MilkTea {
     /**
      * @class HotMilkTea.java
      * @method getInf
      * @description 继承，获取奶茶信息
      * @param []
      * @return java.lang.String
      * */
    @Override
    public String getInf() {
        return "Hot Milk Tea + "+sweetness.getSweetness()+" + "+item.getItem();
    }
}
