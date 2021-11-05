package tj.sse.souvenir.dataaccessobjectpattern;
import tj.sse.souvenir.prototype.*;
import java.util.List;

//创建数据访问对象接口
public interface SouvenirDao {
    public List<PrototypeSouvenir> getAllSouvenir();
    public PrototypeSouvenir getSouvenir(int rollNo);
    public void updateSouvenir(PrototypeSouvenir souvenir);
    public void deleteSouvenir(PrototypeSouvenir souvenir);
}
