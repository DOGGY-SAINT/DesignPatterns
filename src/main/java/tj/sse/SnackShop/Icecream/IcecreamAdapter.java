package tj.sse.SnackShop.Icecream;

import tj.sse.SnackShop.Icecream.Flavour;
import tj.sse.SnackShop.Icecream.Icecream;

/**
 * @Classname Adapter
 * @Description 制作风味冰淇淋
 * @Author asus
 * @Date 2021-10-16 0:38
 * @Version 1.0
 **/
public class IcecreamAdapter extends Icecream implements Flavour {
    /**
     *@Author tianxi
     *@Description /制作风味冰淇淋
     *@Date 0:39 2021-10-16
     *@Param [string f]
     *@return java.lang.String
     **/

    @Override
    public String addFlavour(String f) {
        return makeIcecream()+"+"+f;
    }
}
