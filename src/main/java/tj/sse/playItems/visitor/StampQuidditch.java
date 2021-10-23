package tj.sse.playItems.visitor;

/**
 * @ClassNameStampQuidditch
 * @Description TODO
 * @Author86182
 * @Date2021/10/1514:34
 * @Version 1.0
 **/
public class StampQuidditch implements Stamp{
    /*
     * @Param stampVisitor 访问工具
     **/
    @Override
    public void accept(StampVisitor stampVisitor){
        stampVisitor.visit(this);
    }
}
