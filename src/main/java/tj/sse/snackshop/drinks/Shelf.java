package tj.sse.snackshop.drinks;

/**
 * @author DOGGY_LEE
 * @date 2021/10/16 18:37
 * @description 货架，工厂类，工厂方法模式
 */
public interface Shelf {
    /**
     * @class Shelf
     * @method getDrinks
     * @description 弹出饮料
     * @param []
     * @return tj.sse.snackshop.drinks.Drinks
     * */
    Drinks getDrinks();
}
