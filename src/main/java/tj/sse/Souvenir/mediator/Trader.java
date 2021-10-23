package tj.sse.Souvenir.mediator;

import java.util.*;


//抽象交易者类
public abstract class Trader {
    protected Mediator mediator;
    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void receive();
    public abstract void send();
}

