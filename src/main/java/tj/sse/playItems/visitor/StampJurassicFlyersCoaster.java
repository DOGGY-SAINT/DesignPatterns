package tj.sse.playItems.visitor;

/**
 * @ClassNameStampJurassicFlyersCoaster
 * @Description TODO
 * @Author86182
 * @Date2021/10/1819:40
 * @Version 1.0
 **/
public class StampJurassicFlyersCoaster implements Stamp{

    @Override
    public void accept(StampVisitor stampVisitor){
        stampVisitor.visit(this);
    }
}
