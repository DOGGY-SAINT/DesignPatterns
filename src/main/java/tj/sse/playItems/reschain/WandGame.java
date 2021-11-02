package tj.sse.playItems.reschain;

import tj.sse.playItems.visitor.StampDisplayVisitor;
import tj.sse.playItems.visitor.StampWand;

/** @Author zsy326
 * @Description 魔杖游戏类，将责任链模式组织在一起的总的类
 * @Date 12:59 2021/11/2
 **/
public class WandGame {

    public void book(){
        System.out.println("——————————————Congratulations! you have successfully booked the\"Interactive Magic Wand\"——————————————\n");
    }

    public void play(){
        //组装责任链
        Staff staff1 = new Ollivander();
        Staff staff2 = new Cashier();
        Staff staff3 = new Director();
        staff1.setNext(staff2);
        staff2.setNext(staff3);
        //提交请求
        staff1.handleRequest(0);
        this.end();
    }
    private void end(){
        StampWand sw = new StampWand();
        StampDisplayVisitor sdv=new StampDisplayVisitor();
        sdv.visit(sw);
    }

}


