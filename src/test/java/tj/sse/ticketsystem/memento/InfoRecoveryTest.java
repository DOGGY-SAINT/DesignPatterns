package tj.sse.ticketsystem.memento;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;

import java.util.Objects;

public class InfoRecoveryTest {
    @Test
    public void infoRecoveryTest(){
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
    }
}