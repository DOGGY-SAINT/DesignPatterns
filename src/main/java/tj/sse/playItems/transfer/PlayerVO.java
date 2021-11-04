package tj.sse.playItems.transfer;

/**
 * @ClassName:playVO
 * @Description:TODO Author:Mocha
 * Date:2021/11/4 21:45
 **/
public class PlayerVO {
    private String name;
    private int rollNo;

    PlayerVO(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
