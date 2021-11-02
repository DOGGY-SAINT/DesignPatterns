package tj.sse.playItems.visitor;

/**
 * @ClassNameStampRobot
 * @Description TODO
 * @Author86182
 * @Date2021/10/1819:40
 * @Version 1.0
 **/

//具体元素StampRobot
public class StampRobot implements Stamp {

    @Override
    public void accept(StampVisitor stampVisitor){
        stampVisitor.visit(this);
    }
}
