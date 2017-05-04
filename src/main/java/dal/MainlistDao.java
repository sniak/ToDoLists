package dal;

import dao.Mainlist;
import java.util.List;

public interface MainlistDao {
     void save(Mainlist entity);
    public List<Mainlist> findAll();
    public void deleteTheMainList(long  idCase);
    public void update(Mainlist entity);
    public List<Mainlist> findImportance();
    public Mainlist findid(long id);


}