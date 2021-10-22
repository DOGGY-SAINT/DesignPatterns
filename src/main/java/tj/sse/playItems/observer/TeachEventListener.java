package tj.sse.playItems.observer;

//具体观察者类：魔药课斯内普教授事件监听器
public class TeachEventListener implements BellEventListener {
    public void heardBell(RingEvent e) {
        if (e.getSound()) {
            System.out.println("Professor Snape, the Potions teacher, entered the room with a serious look on his face.");
        } else {
            System.out.println("Professor Snape left the room with a serious look on his face.");
        }
    }
}
