package tj.sse.souvenir.mediator;

import java.util.ArrayList;
import java.util.List;

//具体中介者
public class ConcreteMediator extends Mediator {
    private List<Trader> traders = new ArrayList<Trader>();
    public void register(Trader trader) {
        if (!traders.contains(trader)) {
            traders.add(trader);
            trader.setMedium(this);
        }
    }
    public void relay(Trader cl) {
        for (Trader ob : traders) {
            if (!ob.equals(cl)) {
                ((Trader) ob).receive();
            }
        }
    }
}
