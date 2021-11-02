package tj.sse.playItems.reschain;

/** @Author zsy326
 * @Description 指导者，为责任链上的第三个执行者，如果该游客状态为2（即已挑选魔杖且购买成功），则可以在此处进行魔杖互动，责任链结束
 * @Date 12:57 2021/11/2
 **/
    class Director extends Staff {
        public void handleRequest(int wandState) {
            System.out.println("【Welcome to the magic point! The guide will guide you to use the magic wand】");
            if (wandState == 2) {
                System.out.println("√ Wow! Your magic wand really has magic!");
            } else {
                    System.out.println("异常！");
                }
            }
    }
