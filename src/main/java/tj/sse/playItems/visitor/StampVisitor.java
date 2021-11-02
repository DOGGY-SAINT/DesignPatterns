package tj.sse.playItems.visitor;
/*
 * @Author lzr
 * @Description //定义一个表示访问者的接口
 * @Date 15:06 2021/10/15
 * @Param
 * @return
 **/
//抽象访问者接口
public interface StampVisitor {
    public void visit(StampImplementation stampImplementation);

    public void visit(StampPotion stampPotion);

    public void visit(StampQuidditch stampQuidditch);

    public void visit(StampWand stampWand);

    public void visit(StampRobot stampRobot);

    public void visit(StampDecepticoaster stampDecepticoaster);

    public void visit(StampJurassicFlyersCoaster stampJurassicFlyersCoaster);

}
