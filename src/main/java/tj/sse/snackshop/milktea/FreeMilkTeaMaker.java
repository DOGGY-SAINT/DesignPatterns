package tj.sse.snackshop.milktea;

/**
 * @author DOGGY_LEE
 * @date 2021/10/15 19:15
 * @description 可搭配奶茶机，建造者模式
 */
public class FreeMilkTeaMaker implements MilkTeaMaker{
    /**
     * @description 奶茶
     * */
    private MilkTea milkTea;

    @Override
    public void setIce(String Ice) {
        if(Ice.equals("Hot"))
            milkTea=new HotMilkTea();
        else if(Ice.equals("Cold"))
            milkTea=new ColdMilkTea();
    }

    @Override
    public void setSweatness(String sweatness) {
        if(sweatness.equals("HalfSuger"))
            milkTea.setSweetness(new HalfSuger());
        else if(sweatness.equals("LittleSuger"))
            milkTea.setSweetness(new LittleSuger());
    }

    @Override
    public void setItem(String item) {
        if(item.equals("Pearl"))
            milkTea.setItem(new Pearl());
        else if(item.equals("Cocount"))
            milkTea.setItem(new Cocount());
    }

    public MilkTea makeMilkTea(String request){
        String[] requests=request.split(" ");
        setIce(requests[0]);
        setSweatness(requests[1]);
        setItem(requests[2]);
        return milkTea;
    }
}
