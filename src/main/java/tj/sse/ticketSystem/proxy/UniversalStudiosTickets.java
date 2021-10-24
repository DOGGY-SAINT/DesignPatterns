package tj.sse.ticketSystem.proxy;

import tj.sse.ticketSystem.memento.InfoRecovery;
import tj.sse.ticketSystem.flyweight.ChooseTicket;
import tj.sse.ticketSystem.interpreter.CheckCOVID19;

//真实主题：环球影城门票
public class UniversalStudiosTickets implements Ticket {
    public void display() {
        InfoRecovery.infoRecovery();
        ChooseTicket.main();
        CheckCOVID19.checkCOVID19();
    }
}