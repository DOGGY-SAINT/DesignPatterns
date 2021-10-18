package tj.sse.playItems.Decorator;

import tj.sse.playItems.visitor.StampDisplayVisitor;
import tj.sse.playItems.visitor.StampPotion;

public class RobotGame {

    public void book(){
        System.out.println("——————————————恭喜你预约成功“机器人工厂”游乐项目——————————————\n");
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
        StampPotion sp = new StampPotion();
        StampDisplayVisitor sdv=new StampDisplayVisitor();
        sdv.visit(sp);
    }

}
