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
    public void proxyTest(){
        System.out.println("---------------  [Test] proxy   ---------------");
        UniversalStudiosTickets target=new UniversalStudiosTickets();
        //代理对象,把目标对象传给代理对象,建立代理关系
        MeiTuan Mproxy = new MeiTuan(target);
        Tongcheng Tproxy= new Tongcheng(target);
        QuNaEr Qproxy=new QuNaEr(target);
        if(AppTest.input){
            while(true){
                System.out.println("Choose to purchase through Meituan：#1");
                System.out.println("Choose to purchase through Tongcheng：#2");
                System.out.println("Choose to purchase through Qunaer：#3");
                System.out.println("exit：#exit");
                System.out.println("Please choose where to buy:");
                String cmd= AppTest.scanner.next();
                if(Objects.equals(cmd, "#exit"))
                    break;
                else if (Objects.equals(cmd,"#1")){
                    Mproxy.display();
                }
                else if (Objects.equals(cmd,"#2")){
                    Tproxy.display();
                }
                else if (Objects.equals(cmd,"#3")){
                    Qproxy.display();
                }
            }
        }
        else{
            Mproxy.display();
            Tproxy.display();
            Qproxy.display();
        }
        System.out.println("--------------------- [End]  ----------------------");

        System.out.println("--------------- [Test] InfoRecovery ---------------");
        Originator or = new Originator();
        Caretaker cr = new Caretaker();
        if(AppTest.input){
            while(true){
                System.out.println("input information：#input");
                System.out.println("change information：#change");
                System.out.println("roll back information：#rollback");
                System.out.println("exit this module：#exit");
                System.out.println("please input command：");
                //接受输入的指令
                String cmd= AppTest.scanner.next();
                if(Objects.equals(cmd,"#input")){
                    System.out.println("please input your name：");
                    String name = AppTest.scanner.next();
                    or.setState(name);
                    System.out.println("original name:" + or.getState());
                    cr.setMemento(or.createMemento()); //保存状态
                }
                else if(Objects.equals(cmd,"#change")){
                    System.out.println("please input your new name：");
                    String name = AppTest.scanner.next();
                    or.setState(name);
                    System.out.println("current name:" + or.getState());
                }
                else if(Objects.equals(cmd,"#rollback")){
                    or.restoreMemento(cr.getMemento()); //恢复状态
                    System.out.println("current name:" + or.getState());
                }
                else if(Objects.equals(cmd,"#exit")){
                    break;
                }
                else{
                    System.out.println("please enter a valid input.");
                }
            }
        }
        else{
            System.out.println("please input your name：LiMing");
            or.setState("LiMing");
            System.out.println("original name:" + or.getState());
            cr.setMemento(or.createMemento()); //保存状态
            System.out.println("please input your new name：Yan");
            or.setState("Yan");
            System.out.println("current name:" + or.getState());
            System.out.println("You rolled back your input.");
            or.restoreMemento(cr.getMemento()); //恢复状态
            System.out.println("current name:" + or.getState());
        }
        System.out.println("--------------------- [End]  ----------------------");

        System.out.println("--------------- [Test] saleDifferentTicket ---------------");
        if(AppTest.input){
            while(true){
                System.out.println("Choose to purchase adult tickets：#1");
                System.out.println("Choose to purchase trial operation ticket：#2");
                System.out.println("Choose to purchase internal test ticket：#3");
                System.out.println("Choose to purchase children tickets：#4");
                System.out.println("Choose to purchase group tickets：#5");
                System.out.println("exit：#exit");
                System.out.println("Please choose tickets to buy:");
                //接受输入的指令
                String cmd= AppTest.scanner.next();
                if(Objects.equals(cmd, "#exit")){
                    break;
                }
                else if (Objects.equals(cmd,"#1")){
                    getFlyweight("Adult tickets");
                }
                else if (Objects.equals(cmd,"#2")){
                    getFlyweight("Trial operation ticket");
                }
                else if (Objects.equals(cmd,"#3")){
                    getFlyweight("Internal test ticket");
                }
                else if (Objects.equals(cmd,"#4")){
                    getFlyweight("Children tickets");

                }
                else if (Objects.equals(cmd,"#5")){
                    getFlyweight("Group tickets");
                }
                else{
                    System.out.println("please input right command.");
                }
            }
        }
        else{
            getFlyweight("Adult tickets");
            System.out.println("\n");
            getFlyweight("Trial operation ticket");
            System.out.println("\n");
            getFlyweight("Internal test ticket");
            System.out.println("\n");
            getFlyweight("Children tickets");
            System.out.println("\n");
            getFlyweight("Group tickets");
            System.out.println("\n");
            getFlyweight("Adult tickets");
            System.out.println("\n");
        }
        System.out.println("--------------------- [End]  ----------------------");

        System.out.println("--------------- [Test] CheckCOVID19 ---------------");
        Context condition = new Context();
        if(AppTest.input){
            while(true){
                System.out.println("Universal Studios in Beijing：#1");
                System.out.println("Universal Studios in Los Angeles：#2");
                System.out.println("Universal Studios in Florida：#3");
                System.out.println("Universal Studios in Osaka：#4");
                System.out.println("Universal Studios in Singapore：#5");
                System.out.println("exit：#exit");
                System.out.println("please choose the Universal Studio to buy tickets:");
                //接受输入的指令
                String cmd= AppTest.scanner.next();
                if(Objects.equals(cmd, "#exit")){
                    break;
                }
                else if (Objects.equals(cmd,"#1")){
                    condition.freeRide("Universal Studios in Beijing");
                }
                else if (Objects.equals(cmd,"#2")){
                    condition.freeRide("Universal Studios in Los Angeles");
                }
                else if (Objects.equals(cmd,"#3")){
                    condition.freeRide("Universal Studios in Florida");
                }
                else if (Objects.equals(cmd,"#4")){
                    condition.freeRide("Universal Studios in Osaka");

                }
                else if (Objects.equals(cmd,"#5")){
                    condition.freeRide("Universal Studios in Singapore");
                }
                else{
                    System.out.println("please input right command.");
                }
            }
        }
        else{
            condition.freeRide("Universal Studios in Beijing");
            condition.freeRide("Universal Studios in Los Angeles");
            condition.freeRide("Universal Studios in Florida");
            condition.freeRide("Universal Studios in Osaka");
            condition.freeRide("Universal Studios in Singapore");
        }
        System.out.println("--------------------- [End]  ----------------------");
    }
}