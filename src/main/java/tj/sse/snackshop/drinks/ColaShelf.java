package tj.sse.snackshop.drinks;

/**
 * @author DOGGY_LEE
 * @date 2021/10/16 18:52
 * @description 可乐货架类，货架子类，工厂方法模式
 */
public class ColaShelf implements Shelf{
    @Override
    public Drinks getDrinks() {
        return new Cola();
    }
}
