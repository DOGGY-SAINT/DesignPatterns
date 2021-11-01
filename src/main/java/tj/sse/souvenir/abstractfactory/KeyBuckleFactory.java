package tj.sse.souvenir.abstractfactory;

class KeyBuckleFactory implements AbstractFactory{
    @Override
    public Minions newMinions(){
        return new MinionsKeyBuckle();
    }
    public KungFuPanda newKungFuPanda(){
        return new PandaKeyBuckle();
    }
}
