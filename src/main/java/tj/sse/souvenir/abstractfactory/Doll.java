package tj.sse.souvenir.abstractfactory;

class Doll implements ISouvenir {
    @Override
    public void draw() {
        System.out.println("doll.");
    }
}
