package tj.sse.playItems.Decorator;

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
