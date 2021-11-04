package tj.sse.universalresort.mvc;

import java.util.Date;

/**
 * @author DOGGY_LEE
 * @date 2021/11/4 19:02
 * @description 控制器
 */
public class BoardController {
    //模型
    private Announcement model;
    //视图
    private Board view;

    /**
     * @class BoardController.java
     * @method BoardController
     * @description 构造
     * @param [model, view]
     * @return
     * */
    public BoardController(Announcement model, Board view) {
        this.model = model;
        this.view = view;
    }

    /**
     * @class BoardController.java
     * @method announce
     * @description 发布公告
     * @param [ancer, msg]
     * @return void
     * */
    public void announce(String ancer,String msg){
        model=new Announcement(ancer,msg,new Date());
    }

    /**
     * @class BoardController.java
     * @method showAnnouncement
     * @description 展示公告
     * @param []
     * @return void
     * */
    public void showAnnouncement(){
        view.show("("+model.getDate()+") "+model.getAnnouncer()+":"+model.getMessage());
    }
}
