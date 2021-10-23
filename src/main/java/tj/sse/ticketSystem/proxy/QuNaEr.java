package tj.sse.ticketSystem.proxy;

//代理：去哪儿代理
public class QuNaEr implements Ticket {
    private UniversalStudiosTickets realSubject = new UniversalStudiosTickets();

    //接收保存目标对象
    public QuNaEr(UniversalStudiosTickets target) {
        this.realSubject = target;
    }

    public void display() {
        preRequest();
        realSubject.display();
        postRequest();
    }

    public void preRequest() {
        System.out.println("QuNaEr--UniversalStudio ticketSystem start...");
    }

    public void postRequest() {
        System.out.println("QuNaEr--UniversalStudio ticketSystem start...");
    }
}
