package tj.sse.snackshop.milktea;

/**
 * @author DOGGY_LEE
 * @date 2021/10/15 15:18
 * @description 小料子类，桥接模式
 */
public class Pearl implements Item{
    @Override
    public String getItem() {
        return "Pearl";
    }
}
