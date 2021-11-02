package tj.sse.souvenir.abstractfactory;

class DollFactory implements AbstractFactory{
    @Override
    public Minions newMinions(){
        return new MinionsDoll();
    }
    public KungFuPanda newKungFuPanda(){
        return new PandaDoll();
    }
}
