package tj.sse.ticketsystem.frontcontroller;

/**
 * @Classname FrontEndController
 * @Description 前端控制器
 * @Author shenxingyu
 * @Date 2021-11-5 15:20
 * @Version 1.0
 **/
public class FrontEndController {
    /**
     * @Description 调度器
     **/
    private Dispatcher dispatcher;

    /**
     * @class FrontController
     * @method FrontController
     * @description 构造函数，生成调度器实例
     * @param []
     * @return void
     * */
    public void FrontController(){
        dispatcher = new Dispatcher();
    }

    /**
     * @class FrontController
     * @method isAuthenticUser
     * @description 判断用户是否拥有权限
     * @param []
     * @return boolean
     * */
    private boolean isAuthenticUser(){
        System.out.println("User is authenticated successfully.");
        return true;
    }

    /**
     * @class FrontController
     * @method trackRequest
     * @description 跟踪请求信息，进行输出
     * @param [request]
     * @return void
     * */
    private void trackRequest(String request){
        System.out.println("Page requested: " + request);
    }

    /**
     * @class FrontController
     * @method dispatchRequest
     * @description 记录每一个请求，对用户进行身份验证，返回对应的内容
     * @param [request]
     * @return void
     * */
    public void dispatchRequest(String request){
        trackRequest(request);
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}
