package tj.sse.playItems.Observer;

import tj.sse.playItems.visitor.StampDisplayVisitor;
import tj.sse.playItems.visitor.StampPotion;
import java.util.*;

public class PotionsClass {
    public void book(){
        System.out.println("——————————————Congratulations! you have successfully booked the \"potions lesson\"——————————————\n");
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

//铃声事件类：用于封装事件源及一些与事件相关的参数
class RingEvent extends EventObject {
    private static final long serialVersionUID = 1L;
    private boolean sound;    //true表示上课铃声,false表示下课铃声

    public RingEvent(Object source, boolean sound) {
        super(source);
        this.sound = sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }

    public boolean getSound() {
        return this.sound;
    }
}

//目标类：事件源，铃
class BellEventSource {
    private List<BellEventListener> listener; //监听器容器

    public BellEventSource() {
        listener = new ArrayList<BellEventListener>();
    }

    //给事件源绑定监听器
    public void addPersonListener(BellEventListener ren) {
        listener.add(ren);
    }

    //事件触发器：敲钟，当铃声sound的值发生变化时，触发事件。
    public void ring(boolean sound) {
        String type = sound ? "霍格沃茨上课铃" : "霍格沃茨下课铃";
        System.out.println(type + "响！");
        RingEvent event = new RingEvent(this, sound);
        notifies(event);    //通知注册在该事件源上的所有监听器
    }

    //当事件发生时,通知绑定在该事件源上的所有监听器做出反应（调用事件处理方法）
    protected void notifies(RingEvent e) {
        BellEventListener ren = null;
        Iterator<BellEventListener> iterator = listener.iterator();
        while (iterator.hasNext()) {
            ren = iterator.next();
            ren.heardBell(e);
        }
    }
}

//抽象观察者类：铃声事件监听器
interface BellEventListener extends EventListener {
    //事件处理方法，听到铃声
    public void heardBell(RingEvent e);
}

//具体观察者类：魔药课斯内普教授事件监听器
class TeachEventListener implements BellEventListener {
    public void heardBell(RingEvent e) {
        if (e.getSound()) {
            System.out.println("教魔药课的斯内普教授一脸严肃走进教室。");
        } else {
            System.out.println("斯内普教授一脸严肃离开教室。");
        }
    }
}

//具体观察者类：刚入学的小魔法师事件监听器
class StuEventListener implements BellEventListener {
    public void heardBell(RingEvent e) {
        if (e.getSound()) {
            System.out.println("教室里的小魔法师们胆战心惊安静下来。");
        } else {
            System.out.println("教室里的小魔法师们开始叽叽喳喳讨论学院晚饭会吃什么。");
        }
    }
}

