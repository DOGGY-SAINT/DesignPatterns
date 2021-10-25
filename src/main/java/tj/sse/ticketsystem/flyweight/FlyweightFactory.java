package tj.sse.ticketsystem.flyweight;

import java.util.HashMap;

/**
 * @Classname FlyweightFactory
 * @Description 享元工厂
 * @Author Administrator
 * @Date 2021/10/22 14:52
 * @Version 1.0
 **/
public class FlyweightFactory {

    //定义一个池容器
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    //享元工厂
    public static Flyweight getFlyweight(String extrinsic) {
        Flyweight flyweight = null;

        if (pool.containsKey(extrinsic)) {    //池中有该对象
            flyweight = pool.get(extrinsic);
            System.out.print("Already existing " + extrinsic + " sale directly---->");
        } else {
            //根据外部状态创建享元对象
            flyweight = new ConcreteFlyweight(extrinsic);
            //放入池中
            pool.put(extrinsic, flyweight);
            System.out.print("Establish " + extrinsic + " and sale directly---->");
        }

        return flyweight;
    }
}
