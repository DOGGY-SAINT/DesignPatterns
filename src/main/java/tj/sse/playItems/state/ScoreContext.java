package tj.sse.playItems.state;

//环境类
public class ScoreContext {
    private AbstractState state;

    //初始为low状态
    ScoreContext() {
        state = new LowState(this);
    }

    //设置状态
    public void setState(AbstractState state) {
        this.state = state;
    }

    public AbstractState getState() {
        return state;
    }
    //当前状态对象和加减分的方法  客户类通过该方法来改变成绩状态
    public void add(int score) {
        state.addScore(score);
    }
}
