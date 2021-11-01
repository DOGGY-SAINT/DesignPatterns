package tj.sse.ticketsystem.interpreter;

/**
 * @Classname AndExpression
 * @Description 非终结符表达式类
 * @Author shenxingyu
 * @Date 2021-10-10 13:00
 * @Version 1.0
 **/
class AndExpression implements Expression {
    private Expression address = null;
    private Expression name = null;

    /**
     * @Description 构造函数
     **/
    public AndExpression(Expression address, Expression name) {
        this.address = address;
        this.name = name;
    }

    /**
     * @Description 根据定义的规则切割字符串，对地址和地名分别解释
     **/
    public boolean interpret(String info) {
        String[] s = info.split(" in ");
        return address.interpret(s[0]) && name.interpret(s[1]);
    }
}
