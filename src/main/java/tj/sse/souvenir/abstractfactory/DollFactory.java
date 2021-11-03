package tj.sse.souvenir.abstractfactory;

//玩偶工厂（具体工厂）：实现抽象工厂中的多个抽象方法，完成两种玩偶的创建。
class DollFactory implements AbstractFactory{
    @Override
    public Minions newMinions(){
        return new MinionsDoll();
    }
    public KungFuPanda newKungFuPanda(){
        return new PandaDoll();
    }
}
