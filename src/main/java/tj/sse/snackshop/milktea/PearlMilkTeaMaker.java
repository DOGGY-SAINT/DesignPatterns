package tj.sse.snackshop.milktea;

/**
 * @author DOGGY_LEE
 * @date 2021/10/15 16:31
 * @description 经典珍珠奶茶机，建造者模式
 */
public class PearlMilkTeaMaker implements MilkTeaMaker{
    /**
     * @description 奶茶,热,半糖,珍珠
     * */
    private MilkTea milkTea;

    /**
     * @class PearlMilkTeaMaker.java
     * @method setIce
     * @description 继承，设置冰度
     * @param [Ice]
     * @return void
     * */
    @Override
    public void setIce(String Ice) {
        milkTea=new HotMilkTea();
    }

    /**
     * @class PearlMilkTeaMaker.java
     * @method setSweatness
     * @description 继承，设置甜度
     * @param [sweatness]
     * @return void
     * */
    @Override
    public void setSweatness(String sweatness) {
        milkTea.setSweetness(new HalfSuger());
    }

    /**
     * @class PearlMilkTeaMaker.java
     * @method setItem
     * @description 继承，设置小料
     * @param [item]
     * @return void
     * */
    @Override
    public void setItem(String item) {
        milkTea.setItem(new Pearl());
    }

    /**
     * @class PearlMilkTeaMaker.java
     * @method makeMilkTea
     * @description 继承，制作珍珠奶茶
     * @param [request]
     * @return tj.sse.snackshop.milktea.MilkTea
     * */
    @Override
    public MilkTea makeMilkTea(String request) {
        setIce("");
        setSweatness("");
        setItem("");
        return milkTea;
    }
}
