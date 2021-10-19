package tj.sse.playItems.Observer;

import tj.sse.playItems.visitor.StampDisplayVisitor;
import tj.sse.playItems.visitor.StampPotion;
import java.util.*;

public class PotionsClass {
    public void book(){
        System.out.println("——————————————Congratulations on booking the Potions class Experience——————————————\n");
    };
    public void play(){
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








