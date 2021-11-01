package tj.sse.ticketsystem.memento;

/**
 * @Classname Caretaker
 * @Description 管理者类
 * @Author shenxingyu
 * @Date 2021-10-10 13:00
 * @Version 1.0
 **/
public class Caretaker {

    private Memento memento;

    /**
     * @Description 存入备忘录
     **/
    public void setMemento(Memento m) {
        memento = m;
    }

    /**
     * @Description 读取备忘录
     **/
    public Memento getMemento() {
        return memento;
    }
}
