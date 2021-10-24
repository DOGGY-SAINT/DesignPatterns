package tj.sse.souvenir.abstractfactory;

//小黄人
public class Minions implements MovieIP{
    @Override
    public void create() {
        System.out.println("Minions");
    }
}
