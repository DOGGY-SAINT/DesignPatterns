package tj.sse.ticketSystem.memento;
import java.util.Objects;
import java.util.Scanner;
import tj.sse.ticketSystem.interpreter.CheckCOVID19;

public class InfoRecovery {
    public static void main(String[] args) {
        System.out.println("--------------");
        System.out.println("input information：#input");
        System.out.println("change information：#change");
        System.out.println("roll back information：#rollback");
        System.out.println("exit this pard：#exit");
        System.out.println("please input command：");

        Originator or = new Originator();
        Caretaker cr = new Caretaker();
        while(true){
            //接受输入的指令
            String cmd = new Scanner(System.in).next();
            if(Objects.equals(cmd,"#input")){
                System.out.println("please input your name：");
                String name = new Scanner(System.in).next();
                or.setState(name);
                System.out.println("original name:" + or.getState());
                cr.setMemento(or.createMemento()); //保存状态
            }
            else if(Objects.equals(cmd,"#change")){
                System.out.println("please input your new name：");
                String name = new Scanner(System.in).next();
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
                System.out.println("please enter a valid");
            }
        }
        CheckCOVID19.infoRecovery();
    }
}
