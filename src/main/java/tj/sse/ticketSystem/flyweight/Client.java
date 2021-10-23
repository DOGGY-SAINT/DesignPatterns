package tj.sse.ticketSystem.flyweight;

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

        tj.sse.ticketSystem.flyweight.Flyweight flyweightX = tj.sse.ticketSystem.flyweight.FlyweightFactory.getFlyweight("Adult ticket");
        flyweightX.operate(++extrinsic);

        tj.sse.ticketSystem.flyweight.Flyweight flyweightY = tj.sse.ticketSystem.flyweight.FlyweightFactory.getFlyweight("Trial operation ticket");
        flyweightY.operate(++extrinsic);

        tj.sse.ticketSystem.flyweight.Flyweight flyweightZ = tj.sse.ticketSystem.flyweight.FlyweightFactory.getFlyweight("Internal test ticket");
        flyweightZ.operate(++extrinsic);

        tj.sse.ticketSystem.flyweight.Flyweight flyweightReX = tj.sse.ticketSystem.flyweight.FlyweightFactory.getFlyweight("Adult ticket");
        flyweightReX.operate(++extrinsic);

        tj.sse.ticketSystem.flyweight.Flyweight unsharedFlyweight = new tj.sse.ticketSystem.flyweight.UnsharedConcreteFlyweight("Adult ticket");
        unsharedFlyweight.operate(++extrinsic);
    }

}
