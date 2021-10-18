package tj.sse.restaurant.cookingcommand;

//具体命令：可乐
public class Cola implements Food {
    private ColaChef receiver;      //创建接收者

    public Cola() {
        receiver = new ColaChef();  //创建可乐厨师对象
    }

    public void cooking() {
        receiver.cooking();
    }
}
