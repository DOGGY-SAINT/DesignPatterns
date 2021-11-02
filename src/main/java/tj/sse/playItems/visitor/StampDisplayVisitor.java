package tj.sse.playItems.visitor;

/**
 * @ClassNameStampDisplayVisitor
 * @Description //创建实现上述类的实体访问者
 * @Author lzr
 * @Date2021/10/1514:30
 * @Version 1.0
 **/

//具体访问者
public class StampDisplayVisitor implements StampVisitor {

    @Override
    public void visit(StampImplementation stampImplementation){
        System.out.print("");
    }

//    打印盖章
    @Override
    public void visit(StampPotion stampPotion){
        System.out.println("Potion class sealed");
    }

    @Override
    public void visit(StampQuidditch stampQuidditch){
        System.out.println("QuidditchGame sealed");
    }

    @Override
    public void visit(StampWand stampWand){
        System.out.println("WandGame sealed");
    }

    @Override
    public void visit(StampDecepticoaster stampDecepticoaster){
        System.out.println("DecepticoasterGame sealed");
    }

    @Override
    public void visit(StampJurassicFlyersCoaster stampJurassicFlyersCoaster){
        System.out.println("JurassicFlyersCoaster sealed");
    }

    @Override
    public void visit(StampRobot stampRobot){
        System.out.println("StampRobot sealed");
    }

}
