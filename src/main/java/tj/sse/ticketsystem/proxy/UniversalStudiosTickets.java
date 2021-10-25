package tj.sse.ticketsystem.proxy;

import tj.sse.ticketsystem.memento.InfoRecovery;
import tj.sse.ticketsystem.flyweight.Client;
import tj.sse.ticketsystem.interpreter.CheckCOVID19;

//真实主题：环球影城门票
public class UniversalStudiosTickets implements Ticket {
    public void display() {
        System.out.println("------ [Test] memento -------");
        InfoRecovery.infoRecovery();
        System.out.println("----------- [End]  ----------");
        System.out.println("---- [Test] flyweight ----");
        Client.main();
        System.out.println("---------- [End]  --------");
        System.out.println("---- [Test] interpreter ----");
        CheckCOVID19.checkCOVID19();
        System.out.println("----------- [End]  ---------");
    }
}