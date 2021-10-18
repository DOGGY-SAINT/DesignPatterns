package tj.sse.playItems.Decorator;

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
