package tj.sse.snackshop.icecream;

/**
 * @Classname Adapter
 * @Description 制作风味冰淇淋，适配器模式
 * @Author tianxi
 * @Date 2021-10-16 0:38
 * @Version 1.0
 **/
public class IcecreamAdapter extends Icecream implements Flavour {
    /**
     *@Author tianxi
     *@Description /制作风味冰淇淋，适配器模式
     *@Date 0:39 2021-10-16
     *@Param [string f]
     *@return java.lang.String
     **/

    @Override
    public String addFlavour(String f) {
        return "You get an "+makeIcecream()+"+"+f;
    }
}
