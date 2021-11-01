package tj.sse.playItems.decorator;

//3.抽象装饰，包含具体构件的实例，可以通过其子类扩展具体构件的功能
/**
 * @Classname RobotDecorator
 * @Description An abstract decorator containing entity of concrete components
 *                  whose function have been enriched.
 * @Author Mocha
 * @Date 2021/10/22 14:52
 * @Version 1.0
 **/
public class RobotDecorator implements Robot{
    private Robot robot;
    public RobotDecorator(Robot robot){
        this.robot = robot;
    }
    @Override
    public void operation() {
        robot.operation();
    }

}
