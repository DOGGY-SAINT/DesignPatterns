package tj.sse.TicketSystem.Flyweight;
import java.util.HashMap;

/**
 * @Classname Flyweight
 * @Description 售出不同类型的票
 * @Author Wang Haoting
 * @Date 2021/10/10 15:45
 * @Version 1.0
 **/
public abstract class Flyweight {//所有具体享元类的超类或接口，通过这个接口，Flyweight可以接受并作用于外部状态

    //内部状态
    public String intrinsic;
    //外部状态
    protected final String extrinsic;

    //要求享元角色必须接受外部状态
    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    //定义业务操作
    public abstract void operate(int extrinsic);

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

}
class ConcreteFlyweight extends Flyweight {

    //接受外部状态
    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    //根据外部状态进行逻辑处理
    @Override
    public void operate(int extrinsic) {
        System.out.println("具体Flyweight:" + extrinsic);
    }

}
class UnsharedConcreteFlyweight extends Flyweight {

    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("不共享的具体Flyweight:" + extrinsic);
    }

}
class FlyweightFactory {

    //定义一个池容器
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    //享元工厂
    public static Flyweight getFlyweight(String extrinsic) {
        Flyweight flyweight = null;

        if(pool.containsKey(extrinsic)) {    //池中有该对象
            flyweight = pool.get(extrinsic);
            System.out.print("已有 " + extrinsic + " 直接从池中取出---->");
        } else {
            //根据外部状态创建享元对象
            flyweight = new ConcreteFlyweight(extrinsic);
            //放入池中
            pool.put(extrinsic, flyweight);
            System.out.print("创建 " + extrinsic + " 并从池中取出---->");
        }

        return flyweight;
    }
}
class Client {

    public static void main(String[] args) {
        int extrinsic = 22;

        Flyweight flyweightX = FlyweightFactory.getFlyweight("成人票");
        flyweightX.operate(++ extrinsic);

        Flyweight flyweightY = FlyweightFactory.getFlyweight("试运营票");
        flyweightY.operate(++ extrinsic);

        Flyweight flyweightZ = FlyweightFactory.getFlyweight("内测票");
        flyweightZ.operate(++ extrinsic);

        Flyweight flyweightReX = FlyweightFactory.getFlyweight("成人票");
        flyweightReX.operate(++ extrinsic);

        Flyweight unsharedFlyweight = new UnsharedConcreteFlyweight("成人票");
        unsharedFlyweight.operate(++ extrinsic);
    }

}
