package tj.sse.Souvenir.mediator;

//抽象中介者
public abstract class Mediator {
    public abstract void register(Trader Trader);
    public abstract void relay(Trader cl); //转发
}
