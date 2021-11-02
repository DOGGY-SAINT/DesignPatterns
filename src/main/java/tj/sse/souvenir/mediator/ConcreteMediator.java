package tj.sse.souvenir.mediator;

import java.util.ArrayList;
import java.util.List;

//具体中介者
public class ConcreteMediator extends Mediator {
    //定义一个 List 来管理交易者对象
    private List<Trader> traders = new ArrayList<Trader>();
    //注册交易者
    public void register(Trader trader) {
        if (!traders.contains(trader)) {
            traders.add(trader);
            trader.setMedium(this);
        }
    }
    //像不是cl的交易者转发信息
    public void relay(Trader cl) {
        for (Trader ob : traders) {
            if (!ob.equals(cl)) {
                ((Trader) ob).receive();
            }
        }
    }
}
