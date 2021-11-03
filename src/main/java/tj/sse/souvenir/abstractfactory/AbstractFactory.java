package tj.sse.souvenir.abstractfactory;

//抽象工厂：提供创建产品的接口，它包含创建产品的方法 newXXX()
public interface AbstractFactory {
    public Minions newMinions();
    public KungFuPanda newKungFuPanda();
}
