package tj.sse.souvenir.abstractfactory;

public class MinionsDoll implements Minions {
    @Override
    public void create() {
        System.out.println("create a Minions doll!");
    }
}