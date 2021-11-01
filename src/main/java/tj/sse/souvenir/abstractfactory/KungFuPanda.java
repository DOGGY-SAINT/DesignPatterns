package tj.sse.souvenir.abstractfactory;

class KungFuPanda implements MovieIP{
    @Override
    public void create() {
        System.out.println("Kung Fu Panda");
    }
}
