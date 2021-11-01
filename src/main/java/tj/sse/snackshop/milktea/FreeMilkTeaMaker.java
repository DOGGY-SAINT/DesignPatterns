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

    /**
     * @class FreeMilkTeaMaker.java
     * @method setIce
     * @description 继承，设置冰度
     * @param [Ice]
     * @return void
     * */
    @Override
    public void setIce(String Ice) {
        if(Ice.equals("Hot"))
            milkTea=new HotMilkTea();
        else if(Ice.equals("Cold"))
            milkTea=new ColdMilkTea();
        else
            milkTea=null;
    }

    /**
     * @class FreeMilkTeaMaker.java
     * @method setSweatness
     * @description 继承，设置甜度
     * @param [sweatness]
     * @return void
     * */
    @Override
    public void setSweatness(String sweatness) {
        if(sweatness.equals("HalfSuger"))
            milkTea.setSweetness(new HalfSuger());
        else if(sweatness.equals("LittleSuger"))
            milkTea.setSweetness(new LittleSuger());
    }

    /**
     * @class FreeMilkTeaMaker.java
     * @method setItem
     * @description 继承，设置小料
     * @param [item]
     * @return void
     * */
    @Override
    public void setItem(String item) {
        if(item.equals("Pearl"))
            milkTea.setItem(new Pearl());
        else if(item.equals("Cocount"))
            milkTea.setItem(new Cocount());
    }

    /**
     * @class FreeMilkTeaMaker.java
     * @method makeMilkTea
     * @description 继承，制作任意奶茶，分号分割
     * @param [request]
     * @return tj.sse.snackshop.milktea.MilkTea
     * */
    public MilkTea makeMilkTea(String request){
        String[] requests=request.split(";");
        if (requests.length==3){
            setIce(requests[0]);
            setSweatness(requests[1]);
            setItem(requests[2]);
            return milkTea;
        }
        return null;
    }
}
