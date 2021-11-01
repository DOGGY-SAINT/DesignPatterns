package tj.sse.ticketsystem.memento;

/**
 * @Classname Originator
 * @Description 发起人类
 * @Author shenxingyu
 * @Date 2021-10-10 13:00
 * @Version 1.0
 **/
public class Originator {
    private String state;

    /**
     * @Description 设置内容
     **/
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @Description 获取内容
     **/
    public String getState() {
        return state;
    }

    /**
     * @Description 新建备忘录实例
     **/
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * @Description 重写备忘录内容
     **/
    public void restoreMemento(Memento m) {
        this.setState(m.getState());
    }
}
