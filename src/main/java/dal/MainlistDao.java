package dal;

import dao.Mainlist;
import java.util.List;

public interface MainlistDao {
     void save(Mainlist entity);
   // List<Mainlist> findAll();
    public void deleteTheMainList(int idCase);
    public void update(Mainlist entity);
}