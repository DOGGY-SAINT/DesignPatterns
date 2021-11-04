package tj.sse.ticketsystem.frontcontroller;

/**
 * @Classname Dispatcher
 * @Description 调度器
 * @Author shenxingyu
 * @Date 2021-11-5 15:20
 * @Version 1.0
 **/
public class Dispatcher {
    /**
     * @Description 买家视图
     **/
    private BuyerView buyerView;
    /**
     * @Description 卖家视图
     **/
    private SellerView sellerView;

    /**
     * @class Dispatcher
     * @method Dispatcher
     * @description 调度器构造函数，生成买家视图和卖家视图的实例
     * @param []
     * @return void
     * */
    public Dispatcher(){
        buyerView = new BuyerView();
        sellerView = new SellerView();
    }

    /**
     * @class Dispatcher
     * @method dispatch
     * @description 根据输入的指令来访问对应的视图
     * @param [request]
     * @return void
     * */
    public void dispatch(String request){
        if(request.equalsIgnoreCase("BUYER")){
            buyerView.show();
        }else{
            sellerView.show();
        }
    }
}
