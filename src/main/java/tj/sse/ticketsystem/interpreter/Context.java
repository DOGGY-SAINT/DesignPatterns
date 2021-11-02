package tj.sse.ticketsystem.interpreter;

/**
 * @Classname Context
 * @Description 环境类
 * @Author shenxingyu
 * @Date 2021-10-10 13:00
 * @Version 1.0
 **/
public class Context {
    /**
     * @Description 地址
     **/
    private String[] addresses = {"UniversalStudio"};
    /**
     * @Description 名字
     **/
    private String[] names = {"LosAngeles","Florida","Osaka","Singapore"};
    /**
     * @Description 地址名字
     **/
    private Expression addressName;

    /**
     * @class Context
     * @method Context
     * @description 构造函数，new了两个对应的终结符，并且用这两个终结符生成了AndExpression的实例
     * @param []
     * @return void
     * */
    public Context() {
        Expression address = new TerminalExpression(addresses);
        Expression name = new TerminalExpression(names);
        addressName = new AndExpression(address, name);
    }

    /**
     * @class Context
     * @method freeRide
     * @description 调用定义的规则解释输入的字符串info,返回的是一个布尔值，根据布尔值进行不同的提示
     * @param [info]
     * @return void
     * */
    public void freeRide(String info) {
        boolean ok = addressName.interpret(info);
        if (!ok) System.out.println(info + " is low risk area，you can buy tickets");
        else System.out.println(info + " isn't low risk area,you cannot buy tickets");
    }
}
