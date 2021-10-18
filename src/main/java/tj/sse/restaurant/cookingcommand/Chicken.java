package tj.sse.restaurant.cookingcommand;

//具体命令：烤鸡
public class Chicken implements Food {
    private ChickenChef receiver;       //创建接收者

    public Chicken() {
        receiver = new ChickenChef();   //创建烤鸡厨师对象
    }

    public void cooking() {
        receiver.cooking();
    }
}
