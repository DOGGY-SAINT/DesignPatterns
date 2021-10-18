package tj.sse.TicketSystem.Memento;
import java.util.Objects;
import java.util.Scanner;

public class InfoRecovery {
    public static void main(String[] args) {
        System.out.println("--------------");
        System.out.println("输入信息：#input");
        System.out.println("修改信息：#change");
        System.out.println("回退至最近一次修改：#rollback");
        System.out.println("退出购票：#exit");
        System.out.println("请输入指令：");

        Originator or = new Originator();
        Caretaker cr = new Caretaker();
        while(true){
            //接受输入的指令
            String cmd = new Scanner(System.in).next();
            if(Objects.equals(cmd,"#input")){
                System.out.println("请输入姓名：");
                String name = new Scanner(System.in).next();
                or.setState(name);
                System.out.println("初始姓名:" + or.getState());
                cr.setMemento(or.createMemento()); //保存状态
            }
            else if(Objects.equals(cmd,"#change")){
                System.out.println("请输入新的姓名：");
                String name = new Scanner(System.in).next();
                or.setState(name);
                System.out.println("新的姓名:" + or.getState());
            }
            else if(Objects.equals(cmd,"#rollback")){
                or.restoreMemento(cr.getMemento()); //恢复状态
                System.out.println("恢复姓名:" + or.getState());
            }
            else if(Objects.equals(cmd,"#exit")){
                break;
            }
            else{
                System.out.println("请输入有效的指令");
            }
        }
    }
}

//备忘录
class Memento {
    private String state;
    public Memento(String state) {
        this.state = state;

    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
}
//发起人
class Originator {
    private String state;
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public Memento createMemento() {
        return new Memento(state);
    }
    public void restoreMemento(Memento m) {
        this.setState(m.getState());
    }
}
//管理者
class Caretaker {
    private Memento memento;
    public void setMemento(Memento m) {
        memento = m;
    }
    public Memento getMemento() {
        return memento;
    }
}