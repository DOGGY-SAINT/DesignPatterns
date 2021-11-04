package tj.sse.restaurant.cleanrestaurant;

/**
 * @Classname Cleaner
 * @Description 仆人类，具体实现打扫卫生
 * @Author Administrator
 * @Date 2021/11/4 22:53
 * @Version 1.0
 **/
public class Cleaner {
    public void clean(ICleanable cleanable) {
        cleanable.cleaned();
    }
}
