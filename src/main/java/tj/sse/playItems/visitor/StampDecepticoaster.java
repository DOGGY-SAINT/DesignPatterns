package tj.sse.playItems.visitor;

/**
 * @ClassNameStampDecepticoaster
 * @Description TODO
 * @Author86182
 * @Date2021/10/1819:40
 * @Version 1.0
 **/
//具体元素StampDecepticoaster
public class StampDecepticoaster implements Stamp{

    @Override
    public void accept(StampVisitor stampVisitor){
        stampVisitor.visit(this);
    }

}
