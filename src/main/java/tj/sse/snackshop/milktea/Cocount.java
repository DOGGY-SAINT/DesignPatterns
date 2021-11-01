package tj.sse.snackshop.milktea;

/**
 * @author DOGGY_LEE
 * @date 2021/10/15 16:19
 * @description 小料子类，桥接模式
 */
public class Cocount implements Item{
    /**
     * @class Cocount.java
     * @method getItem
     * @description 继承，获取小料信息
     * @param []
     * @return java.lang.String
     * */
    @Override
    public String getItem() {
        return "Cocount";
    }
}
