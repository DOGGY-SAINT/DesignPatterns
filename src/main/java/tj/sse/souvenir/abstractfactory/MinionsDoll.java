package tj.sse.souvenir.abstractfactory;

//具体产品：小黄人玩偶
public class MinionsDoll implements Minions {
    @Override
    public void create() {
        System.out.println("create a Minions doll!");
    }
}
