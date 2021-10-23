package tj.sse.playItems.reschain;

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

