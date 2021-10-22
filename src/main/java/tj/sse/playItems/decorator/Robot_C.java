package tj.sse.playItems.decorator;

public class Robot_C extends RobotDecorator{
    public Robot_C(Robot robot){
        super(robot);
    }

    public void Shoot(){
        System.out.println("Added function: I can also shoot at enemy!");
    }

    @Override
    public void operation() {
        super.operation();
        Shoot();
    }

}
