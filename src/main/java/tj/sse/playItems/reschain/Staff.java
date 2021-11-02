package tj.sse.playItems.reschain;

/** @Author zsy326
 * @Description 责任链各负责人的抽象父类
 * @Date 12:52 2021/11/2
 **/
 abstract class Staff {
     /** @Author zsy326
      * @Description 存放下一个命令执行者
      * @Date 12:54 2021/11/2
      **/
    private Staff next;

    /** @Author zsy326
     * @Description 属性next的set函数
     * @Date 12:55 2021/11/2
     * @Param [next]
     * @return void
     **/
    public void setNext(Staff next) {
        this.next = next;
    }
    /** @Author zsy326
     * @Description 属性next的get函数
     * @Date 12:55 2021/11/2
     * @Param []
     * @return tj.sse.playItems.reschain.Staff
     **/
    public Staff getNext() {
            return next;
    }

      /** @Author zsy326
       * @Description 处理请求的类，wandState为魔杖状态，=0为没有进行过魔杖挑选，=1为进行过魔杖挑选但未购买，=2为已经购买魔杖
       * @Date 12:57 2021/11/2
       * @Param [wandState]
       * @return void
       **/
        public abstract void handleRequest(int wandState);
    }

