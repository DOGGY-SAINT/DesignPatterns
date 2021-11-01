package tj.sse.snackshop.milktea;

/**
 * @author DOGGY_LEE
 * @date 2021/10/15 18:38
 * @description 经典椰果奶茶机，建造者模式
 */
public class CocountMilkTeaMaker implements MilkTeaMaker{
    /**
     * @description 奶茶,冰,少糖,椰果
     * */
    private MilkTea milkTea;

    /**
     * @class CocountMilkTeaMaker.java
     * @method setIce
     * @description 继承，设置冰度
     * @param [Ice]
     * @return void
     * */
    @Override
    public void setIce(String Ice) {
        milkTea=new ColdMilkTea();
    }

    /**
     * @class CocountMilkTeaMaker.java
     * @method setSweatness
     * @description 继承，设置甜度
     * @param [sweatness]
     * @return void
     * */
    @Override
    public void setSweatness(String sweatness) {
        milkTea.setSweetness(new LittleSuger());
    }

    /**
     * @class CocountMilkTeaMaker.java
     * @method setItem
     * @description 继承，设置小料
     * @param [item]
     * @return void
     * */
    @Override
    public void setItem(String item) {
        milkTea.setItem(new Cocount());
    }

    /**
     * @class CocountMilkTeaMaker.java
     * @method makeMilkTea
     * @description 继承，制作椰果奶茶
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
