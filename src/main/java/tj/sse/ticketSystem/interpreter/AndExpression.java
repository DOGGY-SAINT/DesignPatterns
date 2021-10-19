package tj.sse.ticketSystem.interpreter;

//非终结符表达式类
class AndExpression implements Expression {
    private Expression address = null;
    private Expression name = null;

    public AndExpression(Expression address, Expression name) {
        this.address = address;
        this.name = name;
    }

    public boolean interpret(String info) {
        String[] s = info.split("in");
        return address.interpret(s[0]) && name.interpret(s[1]);
    }
}
