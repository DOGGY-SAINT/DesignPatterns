package tj.sse.ticketsystem.proxy;

import tj.sse.ticketsystem.interpreter.Context;
import tj.sse.ticketsystem.memento.Caretaker;
import tj.sse.ticketsystem.memento.Originator;

import java.util.Objects;

import static tj.sse.ticketsystem.flyweight.FlyweightFactory.getFlyweight;

//真实主题：环球影城门票
//public class UniversalStudiosTickets implements Ticket {
//    public void display() {
//        InfoRecovery.infoRecovery();
//        ChooseTicket.main();
//        CheckCOVID19.checkCOVID19();
//    }
//}

public class UniversalStudiosTickets implements Ticket{
    public int type=-1;
    private Originator or = new Originator();
    private Caretaker cr = new Caretaker();
    Context condition = new Context();
    public int display(String req) {
        request(type,req);
        return type;
    }

    public void infoInput(String cmd){
        if(Objects.equals(cmd,"#input")){
            type=1;
        }
        else if(Objects.equals(cmd,"#change")){
            type=2;
        }
        else if(Objects.equals(cmd,"#rollback")){
            rollName();
        }
        else if(Objects.equals(cmd,"#continue")){
            type=3;
        }
        else if(Objects.equals(cmd,"#exit")){
            type=-2;
        }
        else{
            System.out.println("please enter a valid input.");
        }
    }

    public void setName(String str){
        or.setState(str);
        System.out.println("original name:" + or.getState());
        cr.setMemento(or.createMemento());
        type=0;
    }

    public void setNewName(String str){
        or.setState(str);
        System.out.println("current name:" + or.getState());
        type=0;
    }

    public void rollName(){
        or.restoreMemento(cr.getMemento()); //恢复状态
        System.out.println("current name:" + or.getState());
        type=0;
    }

    public void chooseTicket(String cmd){
        if (Objects.equals(cmd,"#1")){
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
        else if(Objects.equals(cmd,"#exit")){
            type=-2;
            return;
        }
        else{
            System.out.println("please input right command.");
            return;
        }
        type++;
    }

    public void checkVOCUD19(String cmd){
        if (Objects.equals(cmd,"#1")){
            condition.freeRide("UniversalStudio in Beijing");
        }
        else if (Objects.equals(cmd,"#2")){
            condition.freeRide("UniversalStudio in LosAngeles");
        }
        else if (Objects.equals(cmd,"#3")){
            condition.freeRide("UniversalStudio in Florida");
        }
        else if (Objects.equals(cmd,"#4")){
            condition.freeRide("UniversalStudio in Osaka");

        }
        else if (Objects.equals(cmd,"#5")){
            condition.freeRide("UniversalStudio in Singapore");
        }
        else if(Objects.equals(cmd,"#exit")){
            type=-2;
            return;
        }
        else{
            System.out.println("please input right command.");
            return;
        }
        type=-2;
    }

    public void request(int type,String req){
        if(type==0||type==-1)
            infoInput(req);
        else if(type==1)
            setName(req);
        else if(type==2)
            setNewName(req);
        else if(type==3)
            chooseTicket(req);
        else if(type==4)
            checkVOCUD19(req);
    }

    public void ask(){
        if(type==0||type==-1){
            System.out.println("input information：#input");
            System.out.println("change information：#change");
            System.out.println("roll back information：#rollback");
            System.out.println("exit this module：#continue");
            System.out.println("exit this module：#exit");
        }
        else if(type==1){
            System.out.println("please input your name：");
        }
        else if(type==2){
            System.out.println("please input your new name：");
        }
        else if(type==3){
            System.out.println("Choose to purchase adult tickets：#1");
            System.out.println("Choose to purchase trial operation ticket：#2");
            System.out.println("Choose to purchase internal test ticket：#3");
            System.out.println("Choose to purchase children tickets：#4");
            System.out.println("Choose to purchase group tickets：#5");
            System.out.println("exit this module：#exit");
        }
        else if(type==4){
            System.out.println("UniversalStudio in Beijing：#1");
            System.out.println("UniversalStudio in LosAngeles：#2");
            System.out.println("UniversalStudio in Florida：#3");
            System.out.println("UniversalStudio in Osaka：#4");
            System.out.println("UniversalStudio in Singapore：#5");
            System.out.println("exit this module：#exit");
            System.out.println("please choose the UniversalStudio to buy tickets:");
        }
    }
}