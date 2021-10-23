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

    @Override
    public void setIce(String Ice) {
        milkTea=new ColdMilkTea();
    }

    @Override
    public void setSweatness(String sweatness) {
        milkTea.setSweetness(new LittleSuger());
    }

    @Override
    public void setItem(String item) {
        milkTea.setItem(new Cocount());
    }

    @Override
    public MilkTea makeMilkTea(String request) {
        setIce("");
        setSweatness("");
        setItem("");
        return milkTea;
    }
}
