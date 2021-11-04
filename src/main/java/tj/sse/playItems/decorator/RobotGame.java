package tj.sse.playItems.decorator;

import tj.sse.playItems.utils.Visitor;
import tj.sse.playItems.visitor.StampDisplayVisitor;
import tj.sse.playItems.visitor.StampRobot;
import tj.sse.playItems.specification.VisitorAgeLessThanSpec;
import tj.sse.playItems.specification.VisitorHeightLessThanSpec;
import tj.sse.playItems.specification.VisitorGenderSpec;

/**
 * @Classname RobotGame
 * @Description This is a Class for RobotGame which implements related operation for a game
 *                  like book, play and end.
 * @Author Mocha
 * @Date 2021/10/22 14:52
 * @Version 1.0
 **/
public class RobotGame {
    private Visitor vs;
    private void setVisitor(Visitor vs) {
        this.vs = vs;
    }
    private boolean canPlay(Visitor vs) {
        VisitorAgeLessThanSpec ageCheck = new VisitorAgeLessThanSpec(18);
        VisitorHeightLessThanSpec heightCheck = new VisitorHeightLessThanSpec(165);
        if(!ageCheck.isSatisfiedBy(vs))
            System.out.println(vs.getName() + " dose not meet age requirement");
        if(!heightCheck.isSatisfiedBy(vs))
            System.out.println(vs.getName() + " dose not meet height requirement");
        if(ageCheck.isSatisfiedBy(vs) && heightCheck.isSatisfiedBy(vs)){
            System.out.println(vs.getName() + " meet all the requirement !");
            return true;
        }
        return false;
    }
    /**
     * @class RobotGame
     * @method book
     * @description Offering a booking interface for upper systems
     * @param
     * @return void
     * */
    public void book(){
        System.out.println("——————————————Congratulations on booking Robot Game successfully!——————————————\n");
    }
    /**
     * @class RobotGame
     * @method play
     * @description Offering a playing interface for upper systems
     * @param
     * @return void
     * */
    public void play(Visitor vs_new){
        this.vs = vs_new;

        if( !canPlay(vs) )
            return;

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

    /**
     * @class RobotGame
     * @method end
     * @description Offering a end interface for upper systems
     * @param
     * @return void
     * */
    private void end(){
        StampRobot rb = new StampRobot();
        StampDisplayVisitor sdv=new StampDisplayVisitor();
        sdv.visit(rb);
    }

}
