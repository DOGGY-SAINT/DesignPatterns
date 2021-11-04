package tj.sse.souvenir.abstractfactory;

//具体产品：功夫熊猫玩偶
public class PandaDoll implements KungFuPanda {
    @Override
    public void create() {
        System.out.println("create a Kung Fu panda doll!");
    }
}
