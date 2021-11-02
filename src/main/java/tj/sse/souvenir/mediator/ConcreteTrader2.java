package tj.sse.souvenir.mediator;

import java.util.Scanner;

//具体交易者类：游客（购买者）
public class ConcreteTrader2 extends Trader {
    //收到信息
    public void receive() {
        System.out.println("Tourist receives the message.");
    }
    //发送消息
    public void send() {
        System.out.println("Please enter the message the visitor wants to send:");
        Scanner sc =new Scanner (System. in) ;
        this.message = sc. next ();
        mediator.relay(this); //请中介者转发
    }
    public void autoSend() {
        System.out.println("Visitor have sent a message: I want to buy a magic wand.");
        mediator.relay(this); //请中介者转发
    }
}
