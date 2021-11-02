package tj.sse.playItems.reschain;

/** @Author zsy326
 * @Description 奥利凡德，为责任链上的第一个执行者，如果该游客状态为0（即尚未挑选魔杖），则输出挑选魔杖成功，并切换至下一个执行者
 * @Date 12:57 2021/11/2
 **/
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
