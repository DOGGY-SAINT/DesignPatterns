package tj.sse.playItems.State;

//具体状态类：没有赢得比赛
public class LowState extends AbstractState {
    public LowState(ScoreContext h) {
        en = h;
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
        if (score >= 51) {
            en.setState(new HighState(this));
        } else if (score >= 30) {
            en.setState(new MiddleState(this));
        }
    }
}
