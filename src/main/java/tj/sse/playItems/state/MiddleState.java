package tj.sse.playItems.state;

//具体状态类：表现不错
public class MiddleState extends AbstractState {
    public MiddleState(AbstractState state) {
        en = state.en;
        //设定状态名称和奖品
        stateName = "Good";
        gift = "Congratulations on getting a photo opportunity with your favorite Harry Potter cast！";
        score = state.score;
    }

    public void checkState() {
        //根据分数检查状态变化
        if (score < 30) {
            en.setState(new LowState(this));
        } else if (score >= 51) {
            en.setState(new HighState(this));
        }
    }
}
