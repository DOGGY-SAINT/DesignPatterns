package tj.sse.ticketsystem.proxy;

//代理：去哪儿代理
public class QuNaEr implements Ticket {
    private UniversalStudiosTickets realSubject = new UniversalStudiosTickets();

    //接收保存目标对象
    public QuNaEr(UniversalStudiosTickets target) {
        this.realSubject = target;
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
        System.out.println("【QuNaEr】--UniversalStudio ticketSystem start...");
    }

    public void postRequest() {
        System.out.println("【QuNaEr】--UniversalStudio ticketSystem start...");
    }
}
