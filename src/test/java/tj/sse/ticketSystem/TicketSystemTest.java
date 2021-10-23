package tj.sse.ticketSystem;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;

import tj.sse.ticketSystem.interpreter.Context;
import tj.sse.ticketSystem.memento.Caretaker;
import tj.sse.ticketSystem.memento.Originator;
import tj.sse.ticketSystem.proxy.MeiTuan;
import tj.sse.ticketSystem.proxy.QuNaEr;
import tj.sse.ticketSystem.proxy.Tongcheng;
import tj.sse.ticketSystem.proxy.UniversalStudiosTickets;

import java.util.Objects;

import static tj.sse.ticketSystem.flyweight.FlyweightFactory.getFlyweight;

public class TicketSystemTest {
    @Test
    public void proxyTest() {
        System.out.println("---------------  [Test] proxy   ---------------");
        UniversalStudiosTickets target = new UniversalStudiosTickets();
        //代理对象,把目标对象传给代理对象,建立代理关系
        MeiTuan Mproxy = new MeiTuan(target);
        Tongcheng Tproxy = new Tongcheng(target);
        QuNaEr Qproxy = new QuNaEr(target);
        if (AppTest.input) {
            while (true) {
                System.out.println("Choose to purchase through Meituan：#1");
                System.out.println("Choose to purchase through Tongcheng：#2");
                System.out.println("Choose to purchase through Qunaer：#3");
                System.out.println("exit：#exit");
                System.out.println("Please choose where to buy:");
                String cmd = AppTest.scanner.next();
                if (Objects.equals(cmd, "#exit"))
                    break;
                else if (Objects.equals(cmd, "#1")) {
                    Mproxy.display();
                } else if (Objects.equals(cmd, "#2")) {
                    Tproxy.display();
                } else if (Objects.equals(cmd, "#3")) {
                    Qproxy.display();
                }
            }
        } else {
            Mproxy.display();
            Tproxy.display();
            Qproxy.display();
        }
        System.out.println("--------------------- [End]  ----------------------");
    }
}