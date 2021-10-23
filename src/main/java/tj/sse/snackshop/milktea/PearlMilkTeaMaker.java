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

    @Override
    public void setIce(String Ice) {
        milkTea=new HotMilkTea();
    }

    @Override
    public void setSweatness(String sweatness) {
        milkTea.setSweetness(new HalfSuger());
    }

    @Override
    public void setItem(String item) {
        milkTea.setItem(new Pearl());
    }

    @Override
    public MilkTea makeMilkTea(String request) {
        setIce("");
        setSweatness("");
        setItem("");
        return milkTea;
    }
}
