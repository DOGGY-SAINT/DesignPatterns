package tj.sse.playItems.decorator;

/**
 * @Classname BasicRobot
 * @Description Implement the abstract interface:Robot and methods in it.
 **/
public class BasicRobot implements Robot{
    /**
     * @class BasicRobot
     * @method operation
     * @description Implement the methods in the abstract interface:Robot
     * @param
     * @return void
     * */
    @Override
    public void operation() {
        System.out.println("I am a base");
    }
}
