package tj.sse.playItems.decorator;


/**
 * @Classname Robot_B
 * @Description A concrete class B extends from Decorator with new functions.
 * @Author Mocha
 * @Date 2021/10/22 14:52
 * @Version 1.0
 **/
public class Robot_B extends RobotDecorator{
    public Robot_B(Robot robot){
        super(robot);
    }

    public void Sing(){
        System.out.println("Added function: I can also sing a song for you!");
    }

    @Override
    public void operation() {
        super.operation();
        Sing();
    }
}
