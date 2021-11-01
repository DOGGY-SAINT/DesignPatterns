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

    public void Fetch(){
        System.out.println("New function: I can also fetch things from ground!");
    }

    @Override
    public void operation() {
        super.operation();
        Fetch();
    }
}
