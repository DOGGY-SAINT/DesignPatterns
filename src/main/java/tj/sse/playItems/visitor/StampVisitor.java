package tj.sse.playItems.visitor;
/*
 * @Author lzr
 * @Description //定义一个表示访问者的接口
 * @Date 15:06 2021/10/15
 * @Param
 * @return
 **/
public interface StampVisitor {
    public void visit(StampImplementation stampImplementation);

    public void visit(StampPotion stampPotion);

    public void visit(StampQuidditch stampQuidditch);

    public void visit(StampWand stampWand);
}
