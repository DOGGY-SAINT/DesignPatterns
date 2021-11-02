package tj.sse.playItems.visitor;
/*
 * @Author lzr
 * @Description //定义一个表示元素的接口
 * @Date 15:07 2021/10/15
 * @Param
 * @return
 **/

//抽象元素接口
public interface Stamp {
    /*
     * @Param stampVisitor 访问工具
     **/
    public void accept(StampVisitor stampVisitor);
}
