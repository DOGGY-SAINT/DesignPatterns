package tj.sse.playItems.state;

//具体状态类：优秀
public class HighState extends AbstractState {
    public HighState(AbstractState state) {
        en = state.en;
        stateName = "Excellent";
        gift = "Congratulations on catching the Snitch! Get a place at Hogwarts！";
        score = state.score;
    }

    public void checkState() {
        if (score < 30) {
            en.setState(new LowState(this));
        } else if (score < 50) {
            en.setState(new MiddleState(this));
        }
    }
}