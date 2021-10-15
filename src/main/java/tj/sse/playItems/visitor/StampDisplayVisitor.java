package tj.sse.playItems.visitor;

/**
 * @ClassNameStampDisplayVisitor
 * @Description //创建实现上述类的实体访问者
 * @Author lzr
 * @Date2021/10/1514:30
 * @Version 1.0
 **/
public class StampDisplayVisitor implements StampVisitor {

    @Override
    public void visit(StampImplementation stampImplementation){
        System.out.print("");
    }

    @Override
    public void visit(StampPotion stampPotion){
        System.out.println("魔药课盖章成功");
    }

    @Override
    public void visit(StampQuidditch stampQuidditch){
        System.out.println("魁地奇盖章成功");
    }

    @Override
    public void visit(StampWand stampWand){
        System.out.println("魔杖体验盖章成功");
    }

}
