package tj.sse.Souvenir.mediator;

//抽象中介者：中介平台
interface Medium {
    void register(Customer member); //客户注册

    void relay(String from, String ad); //转发
}