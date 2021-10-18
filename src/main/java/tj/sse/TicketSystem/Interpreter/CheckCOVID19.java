package tj.sse.TicketSystem.Interpreter;
import java.util.*;

public class CheckCOVID19 {
    /*文法规则
      <expression> ::= <address>的<name>
      <address> ::= 北京市通州区 | 洛杉矶好莱坞 | 佛罗里达州奥兰多市 | 大阪市此花区 | 新加坡
      <name> ::= 北京环球主题公园 | 好莱坞环球影城 | 奥兰多环球影城 | 日本环球影城 | 新加坡环球影城
    */
    public static void main(String[] args) {
        Context condition = new Context();
        System.out.println("--------------");
        System.out.println("北京市通州区的北京环球主题公园：#1");
        System.out.println("洛杉矶好莱坞的好莱坞环球影城：#2");
        System.out.println("佛罗里达州奥兰多市的奥兰多环球影城：#3");
        System.out.println("大阪市此花区的日本环球影城：#4");
        System.out.println("新加坡的新加坡环球影城：#5");
        System.out.println("退出：#exit");
        System.out.println("请选择购票的环球影城：");

        while(true){
            //接受输入的指令
            String cmd = new Scanner(System.in).next();
            if(Objects.equals(cmd, "#exit")){
                break;
            }
            else if (Objects.equals(cmd,"#1")){
                condition.freeRide("北京市通州区的北京环球主题公园");
            }
            else if (Objects.equals(cmd,"#2")){
                condition.freeRide("洛杉矶好莱坞的好莱坞环球影城");
            }
            else if (Objects.equals(cmd,"#3")){
                condition.freeRide("佛罗里达州奥兰多市的奥兰多环球影城");
            }
            else if (Objects.equals(cmd,"#4")){
                condition.freeRide("大阪市此花区的日本环球影城");

            }
            else if (Objects.equals(cmd,"#5")){
                condition.freeRide("新加坡的新加坡环球影城");
            }
            else{
                System.out.println("请输入正确的指令");
            }
        }
    }
}

//抽象表达式类
interface Expression {
    public boolean interpret(String info);
}
//终结符表达式类
class TerminalExpression implements Expression {
    private final Set<String> set = new HashSet<String>();
    public TerminalExpression(String[] data) {
        Collections.addAll(set, data);
    }
    public boolean interpret(String info) {
        return set.contains(info);
    }
}
//非终结符表达式类
class AndExpression implements Expression {
    private Expression address = null;
    private Expression name = null;
    public AndExpression(Expression address, Expression name) {
        this.address = address;
        this.name = name;
    }
    public boolean interpret(String info) {
        String[] s = info.split("的");
        return address.interpret(s[0]) && name.interpret(s[1]);
    }
}
//环境类
class Context {
    private String[] addresses = {"洛杉矶好莱坞","佛罗里达州奥兰多市","大阪市此花区","新加坡"};
    private String[] names = {"好莱坞环球影城","奥兰多环球影城","日本环球影城","新加坡环球影城"};
    private Expression addressName;
    public Context() {
        Expression address = new TerminalExpression(addresses);
        Expression name = new TerminalExpression(names);
        addressName = new AndExpression(address, name);
    }
    public void freeRide(String info) {
        boolean ok = addressName.interpret(info);
        if (!ok) System.out.println(info + "是低风险区域，可以购票");
        else System.out.println(info + "是中高风险区域，暂不提供购票功能");
    }
}