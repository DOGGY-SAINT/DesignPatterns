package tj.sse.snackshop.milktea;

/**
 * @author DOGGY_LEE
 * @date 2021/10/15 14:23
 * @description 奶茶抽象类，建造者模式，桥接模式
 */
public abstract class MilkTea {
    /**
     * @description 甜度
     * */
    protected Sweetness sweetness;
    /**
     * @description 小料
     * */
    protected Item item;

    /**
     * @class MilkTea
     * @method setSweetness
     * @description 设置甜度
     * @param [sweetness]
     * @return void
     * */
    public void setSweetness(Sweetness sweetness) {
        this.sweetness = sweetness;
    }

    /**
     * @class MilkTea
     * @method setItem
     * @description 设置小料
     * @param [item]
     * @return void
     * */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * @class MilkTea
     * @method getInf
     * @description 获取详细信息
     * @param []
     * @return java.lang.String
     * */
    public abstract String getInf();
}
