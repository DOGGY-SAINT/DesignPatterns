package tj.sse.ticketSystem.memento;
import java.util.Objects;
import java.util.Scanner;


public class InfoRecovery {
    public static void infoRecovery() {
        System.out.println("--------------- [Test] InfoRecovery ---------------");
        Originator or = new Originator();
        Caretaker cr = new Caretaker();
        System.out.println("input information：#input");
        System.out.println("change information：#change");
        System.out.println("roll back information：#rollback");
        System.out.println("exit this module：#exit");
        while(true){
            System.out.println("please input command：");
            //接受输入的指令
            String cmd= new Scanner(System.in).nextLine();
            if(Objects.equals(cmd,"#input")){
                System.out.println("please input your name：");
                String name= new Scanner(System.in).nextLine();
                or.setState(name);
                System.out.println("original name:" + or.getState());
                cr.setMemento(or.createMemento()); //保存状态
            }
            else if(Objects.equals(cmd,"#change")){
                System.out.println("please input your new name：");
                String name= new Scanner(System.in).nextLine();
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
        System.out.println("--------------------- [End]  ----------------------");
    }
}
