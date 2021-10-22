package tj.sse.playItems.observer;

import java.util.EventListener;

//抽象观察者类：铃声事件监听器
public interface BellEventListener extends EventListener {
    //事件处理方法，听到铃声
    public void heardBell(RingEvent e);
}