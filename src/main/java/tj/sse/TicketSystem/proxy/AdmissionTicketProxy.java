package tj.sse.TicketSystem.proxy;
import java.awt.*;
import javax.swing.*;

public class AdmissionTicketProxy {
    public static void main(String[] args) {
        MeiTuan proxy = new MeiTuan();
        proxy.display();
    }
}
//抽象主题：门票
interface Ticket {
    void display();
}

//真实主题：环球影城门票
class UniversalStudiosTickets extends JFrame implements Ticket {
    private static final long serialVersionUID = 1L;
    public UniversalStudiosTickets() {
        super("环球影城门票代理购票测试");
        this.setLayout(new GridLayout(1, 1));
        JLabel l1 = new JLabel(new ImageIcon("src/my.proxy/tickets.jpg"));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void display() {
        this.setVisible(true);
    }
}

//代理：美团代理
class MeiTuan implements Ticket {
    private UniversalStudiosTickets realSubject = new UniversalStudiosTickets();
    public void display() {
        preRequest();
        realSubject.display();
        postRequest();
    }
    public void preRequest() {
        System.out.println("美团环球影城门票购票开始。");
    }
    public void postRequest() {
        System.out.println("美团环球影城门票购票结束。");
    }
}
