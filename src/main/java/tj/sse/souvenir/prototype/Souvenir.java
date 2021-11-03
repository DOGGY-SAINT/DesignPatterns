package tj.sse.souvenir.prototype;

public abstract class Souvenir implements Cloneable {
    private static final long serialVersionUID = 5543049531872119328L;
    //提供克隆自身的方法
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
