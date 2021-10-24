package tj.sse.souvenir.mediator;

import java.util.Scanner;

//具体交易者类
public class ConcreteTrader2 extends Trader {
    public void receive() {
        System.out.println("Tourist receives the message.");
    }
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
