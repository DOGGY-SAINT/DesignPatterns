package tj.sse.Souvenir.prototype;

public abstract class Souvenir implements Cloneable {
    private static final long serialVersionUID = 5543049531872119328L;
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
