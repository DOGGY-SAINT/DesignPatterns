package tj.sse.Souvenir.mediator;
import java.util.Scanner;

//具体交易者类
public class ConcreteTrader1 extends Trader {
    public void receive() {
        System.out.println("店铺收到请求。");
    }
    public void send() {
        System.out.println("请输入店铺要发出的信息:");
        Scanner sc =new Scanner (System. in) ;
        this.message = sc. next ();
        mediator.relay(this); //请中介者转发
    }
    public void autoSend() {
        System.out.println("店铺发出信息：您好，这里是哈利波特周边专卖店！");
        mediator.relay(this); //请中介者转发
    }
}
