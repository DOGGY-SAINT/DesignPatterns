package tj.sse.playItems.visitor;

/**
 * @ClassNameStampPotion
 * @Description TODO
 * @Author86182
 * @Date2021/10/1514:35
 * @Version 1.0
 **/

//具体元素StampPotion
public class StampPotion implements Stamp{
    /*
     * @Param stampVisitor 访问工具
     **/
    @Override
    public void accept(StampVisitor stampVisitor){
        stampVisitor.visit(this);
    }
}
