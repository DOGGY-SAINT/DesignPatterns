package tj.sse.ticketsystem.interpreter;

//环境类
public class Context {
    private String[] addresses = {"UniversalStudio"};
    private String[] names = {"LosAngeles","Florida","Osaka","Singapore"};
    private Expression addressName;

    public Context() {
        Expression address = new TerminalExpression(addresses);
        Expression name = new TerminalExpression(names);
        addressName = new AndExpression(address, name);
    }

    public void freeRide(String info) {
        boolean ok = addressName.interpret(info);
        if (!ok) System.out.println(info + " is low risk area，you can buy tickets");
        else System.out.println(info + " isn't low risk area,you cannot buy tickets");
    }
}
