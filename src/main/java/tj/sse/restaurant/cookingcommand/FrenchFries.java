package tj.sse.restaurant.cookingcommand;

/** @Author zsy326
 * @Description FrenchFries类，是具体命令，是对Food接口的实现
 * @Date 21:09 2021/11/1
 **/
public class FrenchFries implements Food {
    /** @Author zsy326
     * @Description 对于薯条，则薯条厨师为命令接收者
     **/
    private FrenchFriesChef receiver;       //创建接收者

    /*
     * @Author zsy326
     * @Description FrenchFries的构造方法，创建一个薯条厨师对象
     * @Param []
     * @return
     **/
    public FrenchFries() {
        receiver = new FrenchFriesChef();   //创建薯条厨师对象
    }

    /*
     * @Author zsy326
     * @Description 该方法是让命令接收者执行命令
     * @Param []
     * @return void
     **/
    public void cooking() {
        receiver.cooking();
    }
}
