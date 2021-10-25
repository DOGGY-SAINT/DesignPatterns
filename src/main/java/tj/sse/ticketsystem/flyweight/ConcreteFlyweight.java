package tj.sse.ticketsystem.flyweight;

/**
 * @Classname ConcreteFlyweight
 * @Description Processing mode according to external state
 * @Author Administrator
 * @Date 2021/10/22 14:52
 * @Version 1.0
 **/
class ConcreteFlyweight extends Flyweight {

    //receive external state
    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    //Logical processing according to external state
    @Override
    public void operate(int extrinsic) {
        System.out.println("Specific Flyweight:" + extrinsic);
    }

}
