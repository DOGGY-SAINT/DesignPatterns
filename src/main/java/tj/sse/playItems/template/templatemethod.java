package tj.sse.playItems.template;


import tj.sse.playItems.visitor.StampDisplayVisitor;
import tj.sse.playItems.visitor.StampJurassicFlyersCoaster;
import tj.sse.playItems.visitor.StampDecepticoaster;
//模板方法类
public class templatemethod {

    public void DecepticoasterBook(){//预定霸天虎过山车
        System.out.println("———————————————————————————————————Book Decepticoaster successfully!——————————————————————————————————\n");
    }
    public void JurassicFlyersCoasterBook(){//预定飞跃侏罗纪过山车

        System.out.println("—————————————————————————————Book playJurassicFlyersCoaster successfully!—————————————————————————————\n");
    }
    public void playDecepticoaster() { //开启霸天虎过山车之旅
        {
            templateMethodAbstractClass tm = new Decepticoaster();
            tm.TemplateMethod();
            this.DecepticoasterEnd();
        }
    }
    public void playJurassicFlyersCoaster()//开启飞跃侏罗纪过山车之旅
    {
            templateMethodAbstractClass tm = new JurassicFlyersCoaster();
            tm.TemplateMethod();
            this.JurassicFlyersCoasterEnd();
    }
        private void DecepticoasterEnd(){//霸天虎过山车打卡
            StampDecepticoaster sd = new StampDecepticoaster();
            StampDisplayVisitor sdv=new StampDisplayVisitor();
            sdv.visit(sd);
        }
        private void JurassicFlyersCoasterEnd(){//飞跃侏罗纪过山车打卡
            StampJurassicFlyersCoaster sj = new StampJurassicFlyersCoaster();
            StampDisplayVisitor sdv=new StampDisplayVisitor();
            sdv.visit(sj);
        }
    }


