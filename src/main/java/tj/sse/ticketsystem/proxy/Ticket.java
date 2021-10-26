package tj.sse.ticketsystem.proxy;

//抽象主题：门票
public interface Ticket {
    void ask();
    int display(String req);
}
