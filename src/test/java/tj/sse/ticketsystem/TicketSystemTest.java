package tj.sse.ticketsystem;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;

import tj.sse.ticketsystem.proxy.*;

import java.util.Objects;

public class TicketSystemTest {
    @Test
    public void test() {
        System.out.println("---------------  [Test] proxy   ---------------");
        UniversalStudiosTickets target = new UniversalStudiosTickets();
        //代理对象,把目标对象传给代理对象,建立代理关系
        Ticket ticket=null;
        if (AppTest.input) {
            while (true) {
                if(ticket==null){
                    System.out.println("Choose to purchase through Meituan：#1");
                    System.out.println("Choose to purchase through Tongcheng：#2");
                    System.out.println("Choose to purchase through Qunaer：#3");
                    System.out.println("exit：#exit");
                    System.out.println("Please choose where to buy:");
                    String cmd = AppTest.scanner.next();
                    if (Objects.equals(cmd, "#exit"))
                        break;
                    else if (Objects.equals(cmd, "#1")) {
                        ticket=new MeiTuan(target);
                    } else if (Objects.equals(cmd, "#2")) {
                        ticket=new Tongcheng(target);
                    } else if (Objects.equals(cmd, "#3")) {
                        ticket=new QuNaEr(target);
                    }
                }
                else{
                    ticket.ask();
                    String cmd = AppTest.scanner.next();
                    if(ticket.display(cmd)==-2)
                        break;
                }
            }
        } else {
            ticket=new MeiTuan(target);
            ticket.ask();
            System.out.println("#exit");
            ticket.display("#exit");
            System.out.println("--------------------- [End]  ----------------------");

            ticket=new MeiTuan(new UniversalStudiosTickets());
            System.out.println("-------------------- [Test] Memento --------------------");
            ticket.ask();
            System.out.println("#input");
            ticket.display("#input");
            ticket.ask();
            System.out.println("LiSheng");
            ticket.display("LiSheng");
            ticket.ask();
            System.out.println("#change");
            ticket.display("#change");
            ticket.ask();
            System.out.println("ShenXingYu");
            ticket.display("ShenXingYu");
            ticket.ask();
            System.out.println("#rollback");
            ticket.display("#rollback");
            System.out.println("--------------------- [End]  ----------------------");

            ticket.ask();
            System.out.println("#continue");
            ticket.display("#continue");

            System.out.println("-------------------- [Test] Flyweight --------------------");
            ticket.ask();
            System.out.println("#1");
            ticket.display("#1");
            System.out.println("--------------------- [End]  ----------------------");

            System.out.println("-------------------- [Test] Interpreter --------------------");
            ticket.ask();
            System.out.println("#2");
            ticket.display("#2");
        }
        System.out.println("--------------------- [End]  ----------------------");
    }
}