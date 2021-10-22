package tj.sse.restaurant.menucomponent;

public class MenuItem extends MenuComponent {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void choose() {
        this.choose();
    }

    @Override
    public void notChoose() {
        this.notChoose();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print(int level) {
        System.out.println(getName() + "\t" + getPrice());
    }
}
