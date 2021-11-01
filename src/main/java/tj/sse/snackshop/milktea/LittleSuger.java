package tj.sse.snackshop.milktea;

/**
 * @Classname littleSuger
 * @Description 甜度子类，桥接模式
 * @Author tianxi
 * @Date 2021-10-10 13:25
 * @Version 1.0
 **/
public class LittleSuger implements Sweetness {
    /**
     * @class LittleSuger.java
     * @method getSweetness
     * @description 继承，获取糖度
     * @param []
     * @return java.lang.String
     * */
    @Override
    public String getSweetness() {
        return "LittleSuger";
    }
}
