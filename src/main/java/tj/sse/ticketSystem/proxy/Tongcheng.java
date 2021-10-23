package tj.sse.ticketSystem.proxy;

//代理：同程代理
public class Tongcheng implements Ticket {
    private UniversalStudiosTickets realSubject = new UniversalStudiosTickets();

    //接收保存目标对象
    public Tongcheng(UniversalStudiosTickets target) {
        this.realSubject = target;
    }

    public void display() {
        preRequest();
        realSubject.display();
        postRequest();
    }

    public void preRequest() {
        System.out.println("TongCheng--UniversalStudio ticketSystem start...");
    }

    public void postRequest() {
        System.out.println("Tongcheng--UniversalStudio ticketSystem end...");
    }
}
