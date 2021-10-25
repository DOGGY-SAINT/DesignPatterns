package tj.sse.snackshop.milktea;

/**
 * @author DOGGY_LEE
 * @date 2021/10/15 18:59
 * @description 奶茶制作机，建造者模式，桥接模式
 */
public class MilkTeaMachine {
    /**
     * @description 奶茶机
     * */
    public MilkTeaMaker[] milkTeaMakers={new PearlMilkTeaMaker(),new CocountMilkTeaMaker(),new FreeMilkTeaMaker()};

    /**
     * @class MilkTeaMachine
     * @method getMilkTea
     * @description 输入奶茶名获取奶茶
     * @param milkTeaName
     * @return tj.sse.SnackShop.MilkTea.MilkTea
     * */
    public MilkTea getMilkTea(String milkTeaName){
        if(milkTeaName=="PearlMilkTea")
            return getMilkTea(milkTeaMakers[0]);
        else if(milkTeaName=="CocountMilkTea")
            return getMilkTea(milkTeaMakers[1]);
        else
            return milkTeaMakers[2].makeMilkTea(milkTeaName);
    }

    public MilkTea getMilkTea(MilkTeaMaker maker){return maker.makeMilkTea("");}
}
