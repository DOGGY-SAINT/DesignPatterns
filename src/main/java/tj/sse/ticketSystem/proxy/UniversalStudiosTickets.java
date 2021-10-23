package tj.sse.ticketSystem.proxy;

import javax.swing.*;
import java.awt.*;

//真实主题：环球影城门票
public class UniversalStudiosTickets implements Ticket {
    public void display() {
        System.out.println("----data saved!----");
    }
}