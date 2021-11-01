package tj.sse.ticketsystem.interpreter;

/**
 * @Classname AndExpression
 * @Description 非终结符表达式类
 * @Author shenxingyu
 * @Date 2021-10-10 13:00
 * @Version 1.0
 **/
class AndExpression implements Expression {
    /**
     * @Description 地址
     **/
    private Expression address = null;
    /**
     * @Description 名称
     **/
    private Expression name = null;
    /**
     * @class AndExpression
     * @method AndExpression
     * @description 构造函数
     * @param [address,name]
     * @return void
     * */
    public AndExpression(Expression address, Expression name) {
        this.address = address;
        this.name = name;
    }

    /**
     * @class AndExpression
     * @method interpret
     * @description 根据定义的规则切割字符串，对地址和地名分别解释
     * @param [info]
     * @return void
     * */
    public boolean interpret(String info) {
        String[] s = info.split(" in ");
        return address.interpret(s[0]) && name.interpret(s[1]);
    }
}
