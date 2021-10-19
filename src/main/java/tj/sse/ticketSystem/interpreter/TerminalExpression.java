package tj.sse.ticketSystem.interpreter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

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
