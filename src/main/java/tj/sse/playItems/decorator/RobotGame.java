package tj.sse.playItems.decorator;

import tj.sse.playItems.visitor.StampDisplayVisitor;
import tj.sse.playItems.visitor.StampRobot;

/**
 * @Classname RobotGame
 * @Description This is a Class for RobotGame which implements related operation for a game
 *                  like book, play and end.
 * @Author Mocha
 * @Date 2021/10/22 14:52
 * @Version 1.0
 **/
public class RobotGame {

    public void book(){
        System.out.println("——————————————Congratulations on booking Robot Game successfully!——————————————\n");
    }

    public void play(){
        System.out.println("--------------------");
        System.out.println("You have got a new basic robot!\n" +
                "Try what it can do!");
        Robot base = new BasicRobot();
        base.operation();

        System.out.println("----------------------------------------");
        System.out.println("Your basic has been upgraded with an arm!");
        Robot_A robot_a = new Robot_A(base);
        robot_a.operation();

        System.out.println("----------------------------------------");
        System.out.println("Your basic has been upgraded with voice!");
        Robot_B robot_b = new Robot_B(base);
        robot_b.operation();

        System.out.println("----------------------------------------");
        System.out.println("Your basic has been upgraded with an eye!");
        Robot_C robot_c = new Robot_C(base);
        robot_a.operation();

        this.end();
    }
    private void end(){
        StampRobot rb = new StampRobot();
        StampDisplayVisitor sdv=new StampDisplayVisitor();
        sdv.visit(rb);
    }

}
