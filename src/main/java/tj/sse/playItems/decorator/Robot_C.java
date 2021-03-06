package tj.sse.playItems.decorator;

/**
 * @Classname Robot_C
 * @Description A concrete class C extends from Decorator with new functions.
 * @Author Mocha
 * @Date 2021/10/22 14:57
 * @Version 1.0
 **/
public class Robot_C extends RobotDecorator{
    public Robot_C(Robot robot){
        super(robot);
    }
    /**
     * @class Robot_C
     * @method Shoot
     * @description Added operation for a robot
     * */
    public void Shoot(){
        System.out.println("Added function: I can also shoot at enemy!");
    }

    /**
     * @class Robot_C
     * @method operation
     * @description Implement the methods in the abstract interface:Robot
     * @param
     * @return void
     * */
    @Override
    public void operation() {
        super.operation();
        Shoot();
    }

}
