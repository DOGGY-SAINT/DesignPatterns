package tj.sse.restaurant.menucomponent;

abstract class MenuComponent {

    public abstract void notChoose();
    public abstract void choose();

    public void add(MenuComponent menu) {
            throw new UnsupportedOperationException();
        }

        public void remove(MenuComponent menu) {
            throw new UnsupportedOperationException();
        }

        public MenuComponent getChild(int i) {
            throw new UnsupportedOperationException();
        }

        public String getName() {
            throw new UnsupportedOperationException();
        }

        public double getPrice() {
            throw new UnsupportedOperationException();
        }

        public abstract void print(int level);

    }






