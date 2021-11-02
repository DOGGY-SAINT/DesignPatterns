package tj.sse.restaurant.cookingcommand;

/** @Author zsy326
 * @Description 排骨拼盘类，对food接口的实现，有三个命令接收者
 * @Date 21:20 2021/11/1
 **/
public class RibPlatter implements Food {
    //创建接收者
    private RibChef receiver1;
    private FrenchFriesChef receiver2;
    private ColaChef receiver3;

    public RibPlatter() {
        receiver1 = new RibChef();           //创建排骨厨师对象
        receiver2 = new FrenchFriesChef();   //创建薯条厨师对象
        receiver3 = new ColaChef();          //创建可乐厨师对象
    }

    public void cooking() {
        receiver1.cooking();
        receiver2.cooking();
        receiver3.cooking();
    }
}
