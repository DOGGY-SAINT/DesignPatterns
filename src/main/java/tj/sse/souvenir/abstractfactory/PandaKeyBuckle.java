package tj.sse.souvenir.abstractfactory;

public class PandaKeyBuckle implements KungFuPanda {
    @Override
    public void create() {
        System.out.println("create a Kung Fu panda key buckle!");
    }
}
