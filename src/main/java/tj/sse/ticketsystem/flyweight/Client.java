package tj.sse.ticketsystem.flyweight;

/**
 * @Classname Client
 * @Description Client
 * @Author Administrator
 * @Date 2021/10/22 14:51
 * @Version 1.0
 **/
public class Client {

    public static void main() {
        int extrinsic = 0;

        tj.sse.ticketsystem.flyweight.Flyweight flyweightX = tj.sse.ticketsystem.flyweight.FlyweightFactory.getFlyweight("Adult ticket");
        flyweightX.operate(++extrinsic);

        tj.sse.ticketsystem.flyweight.Flyweight flyweightY = tj.sse.ticketsystem.flyweight.FlyweightFactory.getFlyweight("Trial operation ticket");
        flyweightY.operate(++extrinsic);

        tj.sse.ticketsystem.flyweight.Flyweight flyweightZ = tj.sse.ticketsystem.flyweight.FlyweightFactory.getFlyweight("Internal test ticket");
        flyweightZ.operate(++extrinsic);

        tj.sse.ticketsystem.flyweight.Flyweight flyweightReX = tj.sse.ticketsystem.flyweight.FlyweightFactory.getFlyweight("Adult ticket");
        flyweightReX.operate(++extrinsic);

        tj.sse.ticketsystem.flyweight.Flyweight unsharedFlyweight = new tj.sse.ticketsystem.flyweight.UnsharedConcreteFlyweight("Adult ticket");
        unsharedFlyweight.operate(++extrinsic);
    }

}
