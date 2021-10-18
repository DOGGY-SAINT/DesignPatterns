package tj.sse.restaurant.cookingcommand;

//具体命令：排骨
public class Rib implements Food {
    private RibChef receiver;        //创建接收者

    public Rib() {
        receiver = new RibChef();   //创建排骨厨师对象
    }

    public void cooking() {
        receiver.cooking();
    }
}
