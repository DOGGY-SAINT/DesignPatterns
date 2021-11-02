package tj.sse.playItems.decorator;


/**
 * @Classname Robot_A
 * @Description A concrete class A extends from Decorator with new functions.
 * @Author Mocha
 * @Date 2021/10/22 14:52
 * @Version 1.0
 **/
public class Robot_A extends RobotDecorator{
    public Robot_A(Robot robot){
        super(robot);
    }

    /**
     * @class Robo_A
     * @method Fetch
     * @description Added operation for a robot
     * */
    public void Fetch(){
        System.out.println("New function: I can also fetch things from ground!");
    }

    /**
     * @class Robot_A
     * @method operation
     * @description Implement the methods in the abstract interface:Robot
     * @param
     * @return void
     * */
    @Override
    public void operation() {
        super.operation();
        Fetch();
    }
}
