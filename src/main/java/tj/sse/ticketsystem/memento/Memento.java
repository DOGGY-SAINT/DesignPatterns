package tj.sse.ticketsystem.memento;

/**
 * @Classname Memento
 * @Description 备忘录类
 * @Author shenxingyu
 * @Date 2021-10-10 13:00
 * @Version 1.0
 **/

class Memento {
    private String state;

    /**
     * @Description 构造函数
     **/
    public Memento(String state) {
        this.state = state;
    }

    /**
     * @Description 修改内容
     **/
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @Description 读取内容
     **/
    public String getState() {
        return state;
    }
}
