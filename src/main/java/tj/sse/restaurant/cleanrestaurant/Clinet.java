package tj.sse.restaurant.cleanrestaurant;

/**
 * @Classname Clinet
 * @Description 模拟场景
 * @Author Administrator
 * @Date 2021/11/4 23:15
 * @Version 1.0
 **/
public class Clinet {
    public static void main(String[] args) {
        Cleaner cleaner = new Cleaner();
        cleaner.clean(new Table());
        cleaner.clean(new Kitchen());
        cleaner.clean(new Ground());
    }
}