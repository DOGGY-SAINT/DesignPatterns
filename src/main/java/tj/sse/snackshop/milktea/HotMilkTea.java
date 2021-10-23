package tj.sse.snackshop.milktea;

/**
 * @Classname HotMilkTea
 * @Description 温度子类，桥接模式
 * @Author tianxi
 * @Date 2021-10-10 13:31
 * @Version 1.0
 **/
 public class HotMilkTea extends MilkTea {
    @Override
    public String getInf() {
        return "Hot Milk Tea + "+sweetness.getSweetness()+" + "+item.getItem();
    }
}
