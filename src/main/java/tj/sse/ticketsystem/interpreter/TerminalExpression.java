package tj.sse.ticketsystem.interpreter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @Classname TerminalExpression
 * @Description 终结符表达式类
 * @Author shenxingyu
 * @Date 2021-10-10 13:00
 * @Version 1.0
 **/
class TerminalExpression implements Expression {
    private final Set<String> set = new HashSet<String>();

    /**
     * @Description 终结符
     **/
    public TerminalExpression(String[] data) {
        Collections.addAll(set, data);
    }

    /**
     * @Description 判断是否在集合里
     **/
    public boolean interpret(String info) {
        return set.contains(info);
    }
}
