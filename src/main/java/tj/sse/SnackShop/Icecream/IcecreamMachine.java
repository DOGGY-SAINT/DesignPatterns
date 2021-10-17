package tj.sse.SnackShop.Icecream;

/**
 * @Classname IcecreamMachine
 * @Description 制作冰淇淋的机器
 * @Author asus
 * @Date 2021-10-16 0:51
 * @Version 1.0
 **/
public class IcecreamMachine {
    public IcecreamAdapter icecreamMaker=new IcecreamAdapter();
    /**
     *@Author tianxi
     *@Description /获得冰淇淋
     *@Date 0:55 2021-10-16
     *@Param [flavour]
     *@return
     **/

    public String getIcecream(String flavour){
        return icecreamMaker.addFlavour(flavour);
    }
}
