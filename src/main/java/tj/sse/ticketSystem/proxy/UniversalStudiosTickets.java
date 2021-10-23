package tj.sse.ticketSystem.proxy;

import javax.swing.*;
import java.awt.*;
import tj.sse.ticketSystem.memento.InfoRecovery;
import tj.sse.ticketSystem.flyweight.Client;
import tj.sse.ticketSystem.interpreter.CheckCOVID19;

//真实主题：环球影城门票
public class UniversalStudiosTickets implements Ticket {
    public void display() {
        InfoRecovery.infoRecovery();
        Client.main();
        CheckCOVID19.checkCOVID19();
        System.out.println("----data saved!----");
    }
}