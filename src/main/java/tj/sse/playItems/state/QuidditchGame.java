package tj.sse.playItems.state;

import tj.sse.playItems.visitor.StampDisplayVisitor;
import tj.sse.playItems.visitor.StampQuidditch;

public class QuidditchGame {
    public void book(){
        System.out.println("——————————————Congratulations on booking your Quidditch——————————————\n");
    };

    public void play(){
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


