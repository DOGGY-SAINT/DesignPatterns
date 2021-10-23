package tj.sse.playItems.resChain;

//具体处理者2：收银员类
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
