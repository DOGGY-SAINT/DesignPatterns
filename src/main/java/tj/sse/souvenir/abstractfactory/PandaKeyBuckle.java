package tj.sse.souvenir.abstractfactory;

//具体产品：功夫熊猫钥匙扣
public class PandaKeyBuckle implements KungFuPanda {
    @Override
    public void create() {
        System.out.println("create a Kung Fu panda key buckle!");
    }
}
