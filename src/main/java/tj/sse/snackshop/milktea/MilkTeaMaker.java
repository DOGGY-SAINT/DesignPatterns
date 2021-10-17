package tj.sse.snackshop.milktea;

/**
 * @author DOGGY_LEE
 * @date 2021/10/15 16:27
 * @description 奶茶机，建造者模式
 */
public interface MilkTeaMaker {
    /**
     * @class MilkTeaMaker
     * @method setIce
     * @description 设置热还是冰
     * @param []
     * @param Ice
     * @return void
     * */
    void setIce(String Ice);

    /**
     * @class MilkTeaMaker
     * @method setSweatness
     * @description 设置甜度
     * @param []
     * @param sweatness
     * @return void
     * */
    void setSweatness(String sweatness);
    
    /**
     * @class MilkTeaMaker
     * @method setItem
     * @description 设置小料
     * @param []
     * @param item
     * @return void
     * */
    void setItem(String item);
    
    /**
     * @class MilkTeaMaker
     * @method makeMilkTea
     * @description 生产奶茶
     * @param []
     * @param request
     * @return tj.sse.SnackShop.MilkTea.MilkTea
     * */
    MilkTea makeMilkTea(String request);
}
