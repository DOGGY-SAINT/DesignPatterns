package tj.sse.ticketSystem.proxy;

//代理：美团代理
public class MeiTuan implements Ticket{
    private UniversalStudiosTickets realSubject = new UniversalStudiosTickets();
    //接收保存目标对象
    public MeiTuan(UniversalStudiosTickets target){
        this.realSubject=target;
    }
    public void display() {
        preRequest();
        realSubject.display();
        postRequest();
    }
    public void preRequest() {
        System.out.println("【MeiTuan】--UniversalStudio ticketSystem start...");
    }
    public void postRequest() {
        System.out.println("【MeiTuan】--UniversalStudio ticketSystem end...");
    }
}
