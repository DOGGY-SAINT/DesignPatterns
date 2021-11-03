package tj.sse.souvenir.abstractfactory;

//钥匙扣生产工厂（具体工厂）：完成两种钥匙扣周边的生产。
class KeyBuckleFactory implements AbstractFactory{
    @Override
    public Minions newMinions(){
        return new MinionsKeyBuckle();
    }
    public KungFuPanda newKungFuPanda(){
        return new PandaKeyBuckle();
    }
}
