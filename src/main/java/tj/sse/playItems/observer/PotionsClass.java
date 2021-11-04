package tj.sse.playItems.observer;

import tj.sse.playItems.utils.Visitor;
import tj.sse.playItems.visitor.StampDisplayVisitor;
import tj.sse.playItems.visitor.StampPotion;
import tj.sse.playItems.specification.VisitorAgeLessThanSpec;
import tj.sse.playItems.specification.VisitorHeightLessThanSpec;
import tj.sse.playItems.specification.VisitorGenderSpec;

public class PotionsClass {
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
        System.out.println("——————————————Congratulations on booking the Potions class Experience——————————————\n");
    };
    public void play(Visitor vs_new){
        this.vs = vs_new;

        if( !canPlay(vs) )
            return;
        BellEventSource bell = new BellEventSource();    //铃（事件源）
        bell.addPersonListener(new TeachEventListener()); //注册监听器（魔药课斯内普教授）
        bell.addPersonListener(new StuEventListener());    //注册监听器（刚入学的小魔法师）
        bell.ring(true);   //打上课铃声
        System.out.println("------------");
        bell.ring(false);  //打下课铃声
        this.end();
    }
    private void end(){
        StampPotion sp = new StampPotion();
        StampDisplayVisitor sdv=new StampDisplayVisitor();
        sdv.visit(sp);
    }
}








