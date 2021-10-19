package tj.sse.playItems.State;

import tj.sse.playItems.visitor.StampDisplayVisitor;
import tj.sse.playItems.visitor.StampImplementation;
import tj.sse.playItems.visitor.StampWand;
import tj.sse.playItems.visitor.StampQuidditch;

public class QuidditchGame {
    public void book(){
        System.out.println("——————————————Congratulations on booking your Quidditch——————————————\n");
    };

    public void play(){
        ScoreContext account = new ScoreContext();
        System.out.println("Quidditch performance status：");
        account.add(10);
        account.add(10);
        account.add(10);
        account.add(10);
        account.add(150);
        this.end();
    }
    private void end(){
        StampQuidditch sq = new StampQuidditch();
        StampDisplayVisitor sdv=new StampDisplayVisitor();
        sdv.visit(sq);
    }
}


