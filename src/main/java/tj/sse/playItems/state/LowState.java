package tj.sse.playItems.state;

//具体状态类：没有赢得比赛
public class LowState extends AbstractState {
    public LowState(ScoreContext h) {
        en = h;
        //设定状态名称和奖品
        stateName = "Barely hit";
        gift = "Unfortunately, there are no prizes...";
        score = 0;
    }

    public LowState(AbstractState state) {
        en = state.en;
        stateName = "Barely hit";
        gift = "Unfortunately, there are no prizes...";
        score = state.score;
    }

    public void checkState() {
        //根据分数检查状态变化
        if (score >= 51) {
            en.setState(new HighState(this));
        } else if (score >= 30) {
            en.setState(new MiddleState(this));
        }
    }
}
