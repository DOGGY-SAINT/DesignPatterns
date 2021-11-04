package tj.sse.playItems.transfer;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:PlayerBO
 * @Description:TODO Author:Mocha
 * Date:2021/11/4 21:46
 **/
public class PlayerBO {
    //列表是当作一个数据库
    List<PlayerVO> players;

    public PlayerBO(){
        players = new ArrayList<PlayerVO>();
        PlayerVO player1 = new PlayerVO("Robert",0);
        PlayerVO player2 = new PlayerVO("John",1);
        PlayerVO player3 = new PlayerVO("John",2);
        players.add(player1);
        players.add(player2);
        players.add(player3);
    }
    public void deletePlayer(PlayerVO player) {
        players.remove(player.getRollNo());
        System.out.println("Player: Roll No "
                + player.getRollNo() +", deleted from play items database");
    }

    //从数据库中检索游客名单
    public List<PlayerVO> getAllPlayers() {
        return players;
    }

    public PlayerVO getPlayer(int rollNo) {
        return players.get(rollNo);
    }

    public void updatePlayer(PlayerVO player) {
        players.get(player.getRollNo()).setName(player.getName());
        System.out.println("Player: Roll No "
                + player.getRollNo() +", updated in the play items database");
    }
}
