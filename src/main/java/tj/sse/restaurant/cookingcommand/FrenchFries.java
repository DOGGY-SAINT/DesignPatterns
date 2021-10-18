package tj.sse.restaurant.cookingcommand;

//具体命令：薯条
public class FrenchFries implements Food {
    private FrenchFriesChef receiver;       //创建接收者

    public FrenchFries() {
        receiver = new FrenchFriesChef();   //创建薯条厨师对象
    }

    public void cooking() {
        receiver.cooking();
    }
}
