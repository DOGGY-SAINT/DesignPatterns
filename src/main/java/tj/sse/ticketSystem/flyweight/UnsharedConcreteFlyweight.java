package tj.sse.ticketSystem.flyweight;

/**
 * @Classname UnsharedConcreteFlyweight
 * @Description 不共享的享元处理
 * @Author Administrator
 * @Date 2021/10/22 14:53
 * @Version 1.0
 **/
class UnsharedConcreteFlyweight extends Flyweight {

    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("Specific information not shared Flyweight:" + extrinsic);
    }

}
