package tj.sse.ticketSystem.proxy;

import javax.swing.*;
import java.awt.*;

//真实主题：环球影城门票
class UniversalStudiosTickets implements Ticket {
    public void display() {
        System.out.println("----已经保存数据!----");
    }
}