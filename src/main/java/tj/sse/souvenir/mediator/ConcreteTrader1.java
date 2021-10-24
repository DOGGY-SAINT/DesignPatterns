package tj.sse.souvenir.mediator;
import java.util.Scanner;

//具体交易者类
public class ConcreteTrader1 extends Trader {
    public void receive() {
        System.out.println("The seller received the message.");
    }
    public void send() {
        System.out.println("Please enter the message to be sent by the seller:");
        Scanner sc =new Scanner (System. in) ;
        this.message = sc. next ();
        mediator.relay(this); //请中介者转发
    }
    public void autoSend() {
        System.out.println("Seller：Hello, this is harry Potter store!");
        mediator.relay(this); //请中介者转发
    }
}
