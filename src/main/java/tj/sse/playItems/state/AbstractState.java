package tj.sse.playItems.state;

//抽象状态类
public abstract class AbstractState {
    protected ScoreContext en;  //环境
    protected String stateName; //状态名
    protected String gift; //奖品
    protected int score; //分数

    public abstract void checkState(); //检查当前状态

    public void addScore(int x) {
        score += x;
        System.out.print("Plus：" + x + "，\tcurrent score：" + score);
        checkState();
        System.out.println("，\tcurrent state：" + en.getState().stateName);
        System.out.println("Your price is：" + en.getState().gift);
    }
}