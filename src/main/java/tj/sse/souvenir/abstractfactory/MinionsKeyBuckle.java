package tj.sse.souvenir.abstractfactory;

//具体产品：小黄人钥匙扣
public class MinionsKeyBuckle implements Minions {
    @Override
    public void create() {
        System.out.println("create a Minions key buckle!");
    }
}
