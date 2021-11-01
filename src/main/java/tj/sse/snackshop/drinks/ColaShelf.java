package tj.sse.snackshop.drinks;

/**
 * @author DOGGY_LEE
 * @date 2021/10/16 18:52
 * @description 可乐货架类，货架子类，工厂方法模式
 */
public class ColaShelf implements Shelf{
    /**
     * @class ColaShelf.java
     * @method getDrinks
     * @description 继承，获取可乐饮料
     * @param []
     * @return tj.sse.snackshop.drinks.Drinks
     * */
    @Override
    public Drinks getDrinks() {
        return new Cola();
    }
}
