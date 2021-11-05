package tj.sse.souvenir.dataaccessobjectpattern;
import tj.sse.souvenir.prototype.PrototypeSouvenir;

import java.util.ArrayList;
import java.util.List;

//创建实现了上述接口的实体类
public class SouvenirDaoImpl implements SouvenirDao {
    //列表是当作一个数据库
    List<PrototypeSouvenir> souvenirs;

    public SouvenirDaoImpl(){
        souvenirs = new ArrayList<PrototypeSouvenir>();
        PrototypeSouvenir s1 = new PrototypeSouvenir("kung fu panda Doll",0);
        PrototypeSouvenir s2 = new PrototypeSouvenir("Kung fu panda Key buckle",1);
        PrototypeSouvenir s3 = new PrototypeSouvenir("Minions Doll",2);
        PrototypeSouvenir s4 = new PrototypeSouvenir("Minions Key buckle",3);
        souvenirs.add(s1);
        souvenirs.add(s2);
        souvenirs.add(s3);
        souvenirs.add(s4);
    }
    @Override
    public void deleteSouvenir(PrototypeSouvenir souvenir) {
        souvenirs.remove(souvenir.getRollNo());
        System.out.println("Souvenir: Roll No " + souvenir.getRollNo()
                +", deleted from database");
    }

    //从数据库中检索学生名单
    @Override
    public List<PrototypeSouvenir> getAllSouvenir() {
        return souvenirs;
    }

    @Override
    public PrototypeSouvenir getSouvenir(int rollNo) {
        return souvenirs.get(rollNo);
    }

    @Override
    public void updateSouvenir(PrototypeSouvenir souvenir) {
        souvenirs.get(souvenir.getRollNo()).setName(souvenir.getName());
        System.out.println("Student: Roll No " + souvenir.getRollNo()
                +", updated in the database");
    }
}
