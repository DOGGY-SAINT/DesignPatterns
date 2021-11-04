package tj.sse.universalresort.mvc;

import java.util.Date;

/**
 * @author DOGGY_LEE
 * @date 2021/11/4 18:52
 * @description 公告
 */
public class Announcement {
    //发布者
    private String announcer;
    //信息
    private String message;
    //发布时间
    private Date date;

    /**
     * @class Announcement.java
     * @method Announcement
     * @description 默认构造
     * @param []
     * @return
     * */
    public Announcement() {
    }

    /**
     * @class Announcement.java
     * @method Announcement
     * @description 参数构造
     * @param [announcer, message, date]
     * @return
     * */
    public Announcement(String announcer, String message, Date date) {
        this.announcer = announcer;
        this.message = message;
        this.date = date;
    }

    //getter
    public String getAnnouncer() {
        return announcer;
    }
    //getter
    public String getMessage() {
        return message;
    }
    //getter
    public Date getDate() {
        return date;
    }

    //setter
    public void setAnnouncer(String announcer) {
        this.announcer = announcer;
    }
    //setter
    public void setMessage(String message) {
        this.message = message;
    }
    //setter
    public void setDate(Date date) {
        this.date = date;
    }
}
