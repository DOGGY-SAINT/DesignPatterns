package tj.sse.playItems.reschain;

import tj.sse.playItems.utils.Visitor;
import tj.sse.playItems.visitor.StampDisplayVisitor;
import tj.sse.playItems.visitor.StampWand;
import tj.sse.playItems.specification.VisitorAgeLessThanSpec;
import tj.sse.playItems.specification.VisitorHeightLessThanSpec;
import tj.sse.playItems.specification.VisitorGenderSpec;
/** @Author zsy326
 * @Description 魔杖游戏类，将责任链模式组织在一起的总的类
 * @Date 12:59 2021/11/2
 **/
public class WandGame {
    private Visitor vs;
    private void setVisitor(Visitor vs) {
        this.vs = vs;
    }
    private boolean canPlay(Visitor vs) {
        VisitorAgeLessThanSpec ageCheck = new VisitorAgeLessThanSpec(18);
        VisitorHeightLessThanSpec heightCheck = new VisitorHeightLessThanSpec(170);
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

    public void book(){
        System.out.println("——————————————Congratulations! you have successfully booked the\"Interactive Magic Wand\"——————————————\n");
    }

    public void play(Visitor vs_new){
        this.vs = vs_new;

        if( !canPlay(vs) ){
            return;
        }
        else{
            System.out.println(vs.getName() + " meet all requirements and are allowed to go on");
        }
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


