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
    /**
     * @Description 集合，存储不重复对象
     **/
    private final Set<String> set = new HashSet<String>();

    /**
     * @class Context
     * @method freeRide
     * @description 调用定义的规则解释输入的字符串info,返回的是一个布尔值，根据布尔值进行不同的提示
     * @param [info]
     * @return void
     * */
    public TerminalExpression(String[] data) {
        Collections.addAll(set, data);
    }

    /**
     * @class Context
     * @method freeRide
     * @description 判断是否在集合里
     * @param [info]
     * @return void
     * */
    public boolean interpret(String info) {
        return set.contains(info);
    }
}
