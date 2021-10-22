package tj.sse.snackshop.drinks;

import tj.sse.utils.MyLogger;

/**
 * @author DOGGY_LEE
 * @date 2021/10/16 18:50
 * @description 饮料贩卖机，工厂方法模式
 */
public class DrinksSeller {
    /**
     * @description 货架
     * */
    private Shelf[] shelves={new ColaShelf(),new FantaShelf()};

    /**
     * @class DrinksSeller
     * @method getDrinks
     * @description 输入饮料名获取饮料
     * @param [name]
     * @return tj.sse.snackshop.drinks.Drinks
     * */
    public Drinks getDrinks(String name){
        MyLogger.logger.info("get");
        if(name.equals("Cola"))
            return shelves[0].getDrinks();
        else if(name.equals("Fanta"))
            return shelves[1].getDrinks();
        return null;
    }
}
