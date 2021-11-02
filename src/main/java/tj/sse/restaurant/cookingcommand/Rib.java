package tj.sse.restaurant.cookingcommand;

/** @Author zsy326
 * @Description Rib类，是具体命令，是对Food接口的实现
 * @Date 21:10 2021/11/1
 **/
public class Rib implements Food {
    /** @Author zsy326
     * @Description 对于排骨，则排骨厨师为命令接收者
     **/
    private RibChef receiver;        //创建接收者

    /** @Author zsy326
     * @Description Rib的构造方法，创建一个排骨厨师对象
     * @Param []
     * @return
     **/
    public Rib() {
        receiver = new RibChef();   //创建排骨厨师对象
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
