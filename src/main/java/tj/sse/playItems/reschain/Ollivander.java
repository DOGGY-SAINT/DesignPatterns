package tj.sse.playItems.reschain;

//具体处理者1：奥利凡德（魔杖制作师）
class Ollivander extends Staff {
    public void handleRequest(int wandState) {
        System.out.println("【Welcome to the magic house! Ollivander will select the most suitable wand for you】");
        if (wandState == 0) {
            System.out.println("√ Successfully selected the wand, you can go to the cashier to pay\n");
            getNext().handleRequest(++wandState);
        } else if(wandState == 1) {
            System.out.println("× You have already selected the magic wand, you cannot select it again, you need to go to the cashier to pay\n");
            getNext().handleRequest(wandState);
        }else if(wandState == 2){
            System.out.println("× You have selected your magic wand and have paid for it, go find the magic point, try your magic wand\n");
            getNext().getNext().handleRequest(wandState);
        }
    }
}
