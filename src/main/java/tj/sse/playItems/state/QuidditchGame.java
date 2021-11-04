package tj.sse.playItems.state;

import tj.sse.playItems.specification.VisitorAgeLessThanSpec;
import tj.sse.playItems.specification.VisitorHeightLessThanSpec;
import tj.sse.playItems.utils.Visitor;
import tj.sse.playItems.visitor.StampDisplayVisitor;
import tj.sse.playItems.visitor.StampQuidditch;

public class QuidditchGame {
    private Visitor vs;
    private void setVisitor(Visitor vs) {
        this.vs = vs;
    }
    private boolean canPlay(Visitor vs) {
        VisitorAgeLessThanSpec ageCheck = new VisitorAgeLessThanSpec(21);
        VisitorHeightLessThanSpec heightCheck = new VisitorHeightLessThanSpec(175);
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
        System.out.println("——————————————Congratulations on booking your Quidditch——————————————\n");
    };

    public void play(Visitor vs_new){
        this.vs = vs_new;

        if( !canPlay(vs) )
            return;
        ScoreContext account = new ScoreContext();
        System.out.println("Quidditch performance status：");
        //五轮游戏
        account.add(10);
        account.add(10);
        account.add(10);
        account.add(10);
        account.add(150);
        this.end();
    }
    private void end(){
        //收集印章
        StampQuidditch sq = new StampQuidditch();
        StampDisplayVisitor sdv=new StampDisplayVisitor();
        sdv.visit(sq);
    }
}


