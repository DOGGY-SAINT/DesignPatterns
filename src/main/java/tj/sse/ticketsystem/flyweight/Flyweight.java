package tj.sse.ticketsystem.flyweight;

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

