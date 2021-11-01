package tj.sse.snackshop.drinks;

/**
 * @author DOGGY_LEE
 * @date 2021/10/16 18:46
 * @description 芬达货架，货架子类，工厂方法模式
 */
public class FantaShelf implements Shelf{
    /**
     * @class FantaShelf.java
     * @method getDrinks
     * @description 继承，获取芬达饮料
     * @param []
     * @return tj.sse.snackshop.drinks.Drinks
     * */
    @Override
    public Drinks getDrinks() {
        return new Fanta();
    }
}
