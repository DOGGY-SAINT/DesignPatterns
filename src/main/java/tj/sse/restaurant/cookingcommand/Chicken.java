package tj.sse.restaurant.cookingcommand;

/** @Author zsy326
 * @Description Chicken类，是具体命令，是对Food接口的实现
 * @Date 21:07 2021/11/1
 **/

public class Chicken implements Food {

    /** @Author zsy326
     * @Description 对于烤鸡，则烤鸡厨师为命令接收者
     **/
    private ChickenChef receiver;       //创建接收者

    /** @Author zsy326
     * @Description Chicken的构造方法，创建一个烤鸡厨师对象
     * @Param []
     * @return
     **/
    public Chicken() {
        receiver = new ChickenChef();   //创建烤鸡厨师对象
    }

    /** @Author zsy326
     * @Description 该方法是让命令接收者执行命令
     * @Param []
     * @return void
     **/
    public void cooking() {
        receiver.cooking();
    }
}
