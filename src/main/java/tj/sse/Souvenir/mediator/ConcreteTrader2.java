package tj.sse.Souvenir.mediator;

//具体交易者类
public class ConcreteTrader2 extends Trader {
    public void receive() {
        System.out.println("具体交易者类2收到请求。");
    }
    public void send() {
        System.out.println("具体交易者类2发出请求。");
        mediator.relay(this); //请中介者转发
    }
}
