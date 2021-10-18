package tj.sse.playItems.visitor;

/**
 * @ClassNameStampImplementation
 * @Description 具体实现
 * @Author86182
 * @Date2021/10/1514:37
 * @Version 1.0
 **/
public class StampImplementation implements Stamp{
    Stamp[] parts;
/*
 * @Description //访问元素初始化 包括魁地奇 魔杖 魔药课
 * @Date 15:10 2021/10/15
 * @Param
 * @return
 **/
    public StampImplementation(){
        parts=new Stamp[]{new StampPotion(),new StampWand(),new StampQuidditch(),new StampJurassicFlyersCoaster(),
                new StampDecepticoaster(),new StampRobot()};
    }

    /*
     * @Param stampVisitor 访问工具
     * @Description //accept方法具体实现
     **/
    @Override
    public void accept(StampVisitor stampVisitor){
        for(int i=0;i<parts.length;++i){
            parts[i].accept(stampVisitor);
        }
        stampVisitor.visit(this);
    }
}
