package tj.sse.souvenir.prototype;

//Souvenir类的扩展
public class PrototypeSouvenir extends Souvenir{
    public static int classFlag = 1;
//    克隆自身方法
    public Object clone() throws CloneNotSupportedException {
        return (PrototypeSouvenir) super.clone();
    }
    //创建数值对象
    private String name;
    private int rollNo;

    public PrototypeSouvenir(){}
    public PrototypeSouvenir(String name, int rollNo){
        this.name = name;
        this.rollNo=rollNo;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

}
