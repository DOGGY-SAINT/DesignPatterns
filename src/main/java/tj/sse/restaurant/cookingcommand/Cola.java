package tj.sse.restaurant.cookingcommand;

/** @Author zsy326
 * @Description Cola类，是具体命令，是对Food接口的实现
 * @Date 21:08 2021/11/1
 **/
public class Cola implements Food {
    /** @Author zsy326
     * @Description 对于可乐，则可乐厨师为命令接收者
     **/
    private ColaChef receiver;      //创建接收者

    /*
     * @Author zsy326
     * @Description Cola的构造方法，创建一个可乐厨师对象
     * @Param []
     * @return
     **/
    public Cola() {
        receiver = new ColaChef();  //创建可乐厨师对象
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
