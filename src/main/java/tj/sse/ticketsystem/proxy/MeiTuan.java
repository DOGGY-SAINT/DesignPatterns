package tj.sse.ticketsystem.proxy;

//代理：美团代理
public class MeiTuan implements Ticket{
    private UniversalStudiosTickets realSubject = new UniversalStudiosTickets();
    //接收保存目标对象
    public MeiTuan(UniversalStudiosTickets target){
        this.realSubject=target;
    }

    //询问用户请求
    @Override
    public void ask() {
        if(realSubject.type==-1)
            preRequest();
        realSubject.ask();
    }

    //代理购票
    public int display(String req) {
        realSubject.display(req);
        if(realSubject.type==-2)
            postRequest();
        return realSubject.type;
    }
    public void preRequest() {
        System.out.println("【MeiTuan】--UniversalStudio ticketSystem start...");
    }
    public void postRequest() {
        System.out.println("【MeiTuan】--UniversalStudio ticketSystem end...");
    }
}
