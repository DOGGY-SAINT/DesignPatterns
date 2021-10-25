package tj.sse.ticketsystem.memento;

public class InfoRecovery {
    public static void infoRecovery() {
        Originator or = new Originator();
        Caretaker cr = new Caretaker();
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
}
