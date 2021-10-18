package tj.sse.playItems.Decorator;

//3.抽象装饰，包含具体构件的实例，可以通过其子类扩展具体构件的功能
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
