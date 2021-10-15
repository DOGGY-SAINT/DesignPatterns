package tj.sse.playItems.ResChain;

import tj.sse.playItems.visitor.StampDisplayVisitor;
import tj.sse.playItems.visitor.StampImplementation;
import tj.sse.playItems.visitor.StampWand;

public class WandGame {

    public void book(){
        System.out.println("——————————————恭喜你预约成功“互动魔杖”游乐项目——————————————\n");
    }

    public void play(){
        //组装责任链
        Staff staff1 = new Ollivander();
        Staff staff2 = new Cashier();
        Staff staff3 = new Director();
        staff1.setNext(staff2);
        staff2.setNext(staff3);
        //提交请求
        staff1.handleRequest(0);
        this.end();
    }
    private void end(){
        StampWand sw = new StampWand();
        StampDisplayVisitor sdv=new StampDisplayVisitor();
        sdv.visit(sw);
    }

}


    //抽象处理者：职员类
    abstract class Staff {
        private Staff next;
        public void setNext(Staff next) {
            this.next = next;
        }
        public Staff getNext() {
            return next;
        }
        //处理请求的方法
        public abstract void handleRequest(int wandState);
        //wandState为魔杖状态，=0为没有进行过魔杖挑选，=1为进行过魔杖挑选但未购买，=2为已经购买魔杖
    }
    //具体处理者1：奥利凡德（魔杖制作师）
    class Ollivander extends Staff {
        public void handleRequest(int wandState) {
            System.out.println("【欢迎来到魔法屋，将由奥利凡德为您挑选最适合您的魔杖】");
            if (wandState == 0) {
                System.out.println("√ 挑选魔杖成功,可以去找收银员付款了\n");
                getNext().handleRequest(++wandState);
            } else if(wandState == 1) {
                System.out.println("× 您已挑选过魔杖,不可以再次挑选，需要去找收银员付款\n");
                getNext().handleRequest(wandState);
            }else if(wandState == 2){
                System.out.println("× 您已挑选过魔杖且已付款，快去寻找魔法点，试试你的魔杖吧\n");
                getNext().getNext().handleRequest(wandState);
            }
        }
    }
    //具体处理者2：收银员类
    class Cashier extends Staff {
        public void handleRequest(int wandState) {
            System.out.println("【欢迎来到收银处，将由收银员为您收取互动魔杖费用】");
            if (wandState == 1) {
                System.out.println("√ 购买成功，快去寻找魔法点，试试你的魔杖吧\n");
                getNext().handleRequest(++wandState);
            } else {
                if (getNext() != null) {
                    System.out.println("× 您已成功购买过魔杖,不可以重复购买，快去试试你的魔法棒吧\n");
                    getNext().handleRequest(wandState);
                } else {
                    System.out.println("其他2！");
                }
            }
        }
    }
    //具体处理者3：指导者
    class Director extends Staff {
        public void handleRequest(int wandState) {
            System.out.println("【欢迎来到魔法点，将由引导员指引您使用魔法棒】");
            if (wandState == 2) {
                System.out.println("√ 哇！你的魔法棒真的有魔法呢！");
            } else {
                    System.out.println("异常！");
                }
            }
    }
