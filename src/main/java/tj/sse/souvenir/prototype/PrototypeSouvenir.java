package tj.sse.souvenir.prototype;

//Souvenir类的扩展
public class PrototypeSouvenir extends Souvenir{
    public static int classFlag = 1;
//    克隆自身方法
    public Object clone() throws CloneNotSupportedException {
        return (PrototypeSouvenir) super.clone();
    }

}
