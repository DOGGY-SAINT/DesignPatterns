package tj.sse.playItems.Observer;

//具体观察者类：刚入学的小魔法师事件监听器
public class StuEventListener implements BellEventListener {
    public void heardBell(RingEvent e) {
        if (e.getSound()) {
            System.out.println("The little magicians in the classroom fell silent, terrified.");
        } else {
            System.out.println("The little magicians in the classroom began chattering about what the house would have for dinner.");
        }
    }
}
