package tj.sse.ticketSystem.proxy;

//代理：美团代理
class MeiTuan implements Ticket{
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
        System.out.println("美团--环球影城门票购票开始。");
    }
    public void postRequest() {
        System.out.println("美团--环球影城门票购票结束。");
    }
}
//代理：同程代理
class Tongcheng implements Ticket{
    private UniversalStudiosTickets realSubject = new UniversalStudiosTickets();
    //接收保存目标对象
    public Tongcheng(UniversalStudiosTickets target){
        this.realSubject=target;
    }
    public void display() {
        preRequest();
        realSubject.display();
        postRequest();
    }
    public void preRequest() {
        System.out.println("同程--环球影城门票购票开始。");
    }
    public void postRequest() {
        System.out.println("同程--环球影城门票购票结束。");
    }
}
//代理：去哪儿代理
class QuNaEr implements Ticket{
    private UniversalStudiosTickets realSubject = new UniversalStudiosTickets();
    //接收保存目标对象
    public QuNaEr(UniversalStudiosTickets target){
        this.realSubject=target;
    }
    public void display() {
        preRequest();
        realSubject.display();
        postRequest();
    }
    public void preRequest() {
        System.out.println("去哪儿网--环球影城门票购票开始。");
    }
    public void postRequest() {
        System.out.println("去哪儿网--环球影城门票购票结束。");
    }
}