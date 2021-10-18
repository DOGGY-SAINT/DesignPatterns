package tj.sse.restaurant.cookingcommand;

//具体命令：烤鸡拼盘
public class ChickenPlatter implements Food {
    //创建接收者
    private ChickenChef receiver1;
    private FrenchFriesChef receiver2;
    private ColaChef receiver3;

    public ChickenPlatter() {
        receiver1 = new ChickenChef();       //创建烤鸡厨师对象
        receiver2 = new FrenchFriesChef();   //创建薯条厨师对象
        receiver3 = new ColaChef();          //创建可乐厨师对象
    }

    public void cooking() {
        receiver1.cooking();
        receiver2.cooking();
        receiver3.cooking();
    }
}
