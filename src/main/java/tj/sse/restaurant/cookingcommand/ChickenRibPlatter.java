package tj.sse.restaurant.cookingcommand;

//具体命令：烤鸡排骨拼盘
public class ChickenRibPlatter implements Food {
    //创建接收者
    private ChickenChef receiver1;
    private RibChef receiver2;
    private FrenchFriesChef receiver3;
    private ColaChef receiver4;

    public ChickenRibPlatter() {
        receiver1 = new ChickenChef();       //创建烤鸡厨师对象
        receiver2 = new RibChef();           //创建排骨厨师对象
        receiver3 = new FrenchFriesChef();   //创建薯条厨师对象
        receiver4 = new ColaChef();          //创建可乐厨师对象
    }

    public void cooking() {
        receiver1.cooking();
        receiver2.cooking();
        receiver3.cooking();
        receiver3.cooking();
        receiver4.cooking();
        receiver4.cooking();
    }
}
