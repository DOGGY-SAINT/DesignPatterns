package tj.sse.playItems.reschain;


/** @Author zsy326
 * @Description 收银员，为责任链上的第二个执行者，如果该游客状态为1（即已挑选魔杖但未购买），则输出购买成功，并切换至下一个执行者
 * @Date 12:57 2021/11/2
 **/
class Cashier extends Staff {
    public void handleRequest(int wandState) {
        System.out.println("【Welcome to the cashier】");
        if (wandState == 1) {
            System.out.println("√ Successful purshase，go ahead and try your magic wand!\n");
            getNext().handleRequest(++wandState);
        } else {
            if (getNext() != null) {
                System.out.println("× You have already purchased a magic wand before, so you can’t buy it again. Go ahead and try your magic wand.\n");
                getNext().handleRequest(wandState);
            } else {
                System.out.println("warning！");
            }
        }
    }
}
