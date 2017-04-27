package dal;

import dao.Addlist;

import java.util.List;

public interface AddlistDao {
    void save(Addlist entity);
    public void deleteTheAddList(int idCase);
    public void update(Addlist entity);
     public List<Addlist> findByMainlistId(Long mainlistId);
}