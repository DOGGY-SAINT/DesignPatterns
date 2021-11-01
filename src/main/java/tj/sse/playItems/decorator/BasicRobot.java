package tj.sse.playItems.decorator;

/**
 * @Classname BasicRobot
 * @Description Implement the abstract interface:Robot and methods in it.
 **/
public class BasicRobot implements Robot{
    @Override
    public void operation() {
        System.out.println("I am a base");
    }
}
