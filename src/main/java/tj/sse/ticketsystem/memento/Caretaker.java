package tj.sse.ticketsystem.memento;

/**
 * @Classname Caretaker
 * @Description 管理者类
 * @Author shenxingyu
 * @Date 2021-10-10 13:00
 * @Version 1.0
 **/
public class Caretaker {
    /**
     * @Description 备忘录
     **/
    private Memento memento;

    /**
     * @class Caretaker
     * @method setMemento
     * @description 存入备忘录
     * @param [m]
     * @return void
     * */
    public void setMemento(Memento m) {
        memento = m;
    }

    /**
     * @class Caretaker
     * @method getMemento
     * @description 读取备忘录
     * @param []
     * @return void
     * */
    public Memento getMemento() {
        return memento;
    }
}
