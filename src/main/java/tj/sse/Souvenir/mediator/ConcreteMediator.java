package tj.sse.Souvenir.mediator;

import java.util.ArrayList;
import java.util.List;

//具体中介者
public class ConcreteMediator extends Mediator {
    private List<Trader> traders = new ArrayList<Trader>();
    public void register(Trader Trader) {
        if (!traders.contains(Trader)) {
            traders.add(Trader);
            Trader.setMedium(this);
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
