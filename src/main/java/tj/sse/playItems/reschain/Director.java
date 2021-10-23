package tj.sse.playItems.reschain;

//具体处理者3：指导者
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
