package tj.sse.playItems.State;

import tj.sse.playItems.visitor.StampDisplayVisitor;
import tj.sse.playItems.visitor.StampImplementation;
import tj.sse.playItems.visitor.StampWand;
import tj.sse.playItems.visitor.StampQuidditch;

public class QuidditchGame {
    public void book(){
        System.out.println("——————————————恭喜你预约成功“魁地奇”游乐项目——————————————\n");
    };

    public void play(){
        ScoreContext account = new ScoreContext();
        System.out.println("魁地奇成绩状态：");
        account.add(10);
        account.add(10);
        account.add(10);
        account.add(10);
        account.add(150);
        this.end();
    }
    private void end(){
        StampQuidditch sq = new StampQuidditch();
        StampDisplayVisitor sdv=new StampDisplayVisitor();
        sdv.visit(sq);
    }
}

//环境类
class ScoreContext {
    private AbstractState state;

    ScoreContext() {
        state = new LowState(this);
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public AbstractState getState() {
        return state;
    }

    public void add(int score) {
        state.addScore(score);
    }
}

//抽象状态类
abstract class AbstractState {
    protected ScoreContext en;  //环境
    protected String stateName; //状态名
    protected String gift; //奖品
    protected int score; //分数

    public abstract void checkState(); //检查当前状态

    public void addScore(int x) {
        score += x;
        System.out.print("加上：" + x + "分，\t当前分数：" + score);
        checkState();
        System.out.println("分，\t当前状态：" + en.getState().stateName);
        System.out.println("您的奖品情况是：" + en.getState().gift);
    }
}

//具体状态类：没有赢得比赛
class LowState extends AbstractState {
    public LowState(ScoreContext h) {
        en = h;
        stateName = "没咋进球";
        gift = "很遗憾，没有奖品...";
        score = 0;
    }

    public LowState(AbstractState state) {
        en = state.en;
        stateName = "没咋进球";
        gift = "很遗憾，没有奖品...";
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

//具体状态类：表现不错
class MiddleState extends AbstractState {
    public MiddleState(AbstractState state) {
        en = state.en;
        stateName = "表现不错";
        gift = "恭喜获得一次和您喜欢的哈利波特演员合影的机会！";
        score = state.score;
    }

    public void checkState() {
        if (score < 30) {
            en.setState(new LowState(this));
        } else if (score >= 51) {
            en.setState(new HighState(this));
        }
    }
}

//具体状态类：优秀
class HighState extends AbstractState {
    public HighState(AbstractState state) {
        en = state.en;
        stateName = "优秀";
        gift = "恭喜您抓住金色飞贼！获得霍格沃茨入学机会！";
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
