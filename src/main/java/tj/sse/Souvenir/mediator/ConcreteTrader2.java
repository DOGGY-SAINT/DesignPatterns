package tj.sse.Souvenir.mediator;

import java.util.Scanner;

//具体交易者类
public class ConcreteTrader2 extends Trader {
    public void receive() {
        System.out.println("游客甲收到信息。");
    }
    public void send() {
        System.out.println("请输入游客要发出的信息:");
        Scanner sc =new Scanner (System. in) ;
        this.message = sc. next ();
        mediator.relay(this); //请中介者转发
    }
    public void autoSend() {
        System.out.println("游客要发出信息:我要购买一根魔法棒。");
        mediator.relay(this); //请中介者转发
    }
}
