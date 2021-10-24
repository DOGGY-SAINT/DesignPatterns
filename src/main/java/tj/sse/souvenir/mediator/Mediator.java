package tj.sse.souvenir.mediator;

//抽象中介者
public abstract class Mediator {
    public abstract void register(Trader trader);
    public abstract void relay(Trader cl); //转发
}
