package tj.sse.playItems.state;

//具体状态类：优秀
public class  HighState extends AbstractState {
    public HighState(AbstractState state) {
        en = state.en;
        //设定状态名称和奖品
        stateName = "Excellent";
        gift = "Congratulations on catching the Snitch! Get a place at Hogwarts！";
        score = state.score;
    }

    public void checkState() {
        //根据分数检查状态变化
        if (score < 30) {
            en.setState(new LowState(this));
        } else if (score < 50) {
            en.setState(new MiddleState(this));
        }
    }
}