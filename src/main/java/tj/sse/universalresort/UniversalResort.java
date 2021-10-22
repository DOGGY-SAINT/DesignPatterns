package tj.sse.universalresort;

/**
 * @author DOGGY_LEE
 * @date 2021/10/15 12:52
 * @description 环球影城单例类,单例模式
 */
public class UniversalResort {
    /**
     * @description 影城实例
     * */
    private static UniversalResort instance=new UniversalResort();
    /**
     * @class UniversalResort
     * @method UniversalResort
     * @description 构造函数私有化禁止调用
     * @param []
     * @return
     * */
    private UniversalResort(){
        init();
    }

    /**
     * @class UniversalResort
     * @method init
     * @description 实例初始化函数
     * @param []
     * @return void
     * */
    private void init(){}

    /**
     * @class UniversalResort
     * @method getInstance
     * @description 获取实例
     * @param []
     * @return tj.sse.UniversalResort.UniversalResort
     * */
    public static UniversalResort getInstance(){return instance;}
}
