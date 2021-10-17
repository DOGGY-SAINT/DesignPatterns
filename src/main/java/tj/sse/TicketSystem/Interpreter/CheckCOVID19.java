package tj.sse.TicketSystem.Interpreter;
import java.util.*;

public class CheckCOVID19 {
    /*文法规则
      <expression> ::= <province>的<city>
      <province> ::= 黑龙江 |上海
      <city> ::= 南岗区信恒现代城小区馨园A栋|松北区地恒托斯卡纳小区4期 | 同济大学 | 呼兰区腰堡街道
    */
    public static void main(String[] args) {
        Context condition = new Context();
        condition.freeRide("黑龙江的南岗区信恒现代城小区馨园A栋");
        condition.freeRide("黑龙江的呼兰区腰堡街道");
        condition.freeRide("上海的同济大学");
    }
}

//抽象表达式类
interface Expression {
    public boolean interpret(String info);
}
//终结符表达式类
class TerminalExpression implements Expression {
    private Set<String> set = new HashSet<String>();
    public TerminalExpression(String[] data) {
        for (int i = 0; i < data.length; i++) set.add(data[i]);
    }
    public boolean interpret(String info) {
        if (set.contains(info)) {
            return true;
        }
        return false;
    }
}
//非终结符表达式类
class AndExpression implements Expression {
    private Expression province = null;
    private Expression city = null;
    public AndExpression(Expression province, Expression city) {
        this.province = province;
        this.city = city;
    }
    public boolean interpret(String info) {
        String s[] = info.split("的");
        return province.interpret(s[0]) && city.interpret(s[1]);
    }
}
//环境类
class Context {
    private String[] provinces = {"黑龙江"};
    private String[] citys = {"南岗区信恒现代城小区馨园A栋","松北区地恒托斯卡纳小区4期","巴彦县巴彦镇水韵新城小区","巴彦县巴彦镇金源嘉园小区"};
    private Expression provinceCity;
    public Context() {
        Expression province = new TerminalExpression(provinces);
        Expression city = new TerminalExpression(citys);
        provinceCity = new AndExpression(province, city);
    }
    public void freeRide(String info) {
        boolean ok = provinceCity.interpret(info);
        if (!ok) System.out.println("您来自" + info + "，是低风险区域，健康码/行程码为绿色");
        else System.out.println("您来自"+info + "，是中高风险区域，健康码/行程码为红色");
    }
}