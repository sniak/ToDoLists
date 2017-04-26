package dal;

import dao.Addlist;

public interface AddlistDao {
    void save(Addlist entity);
    public void deleteTheAddList(int idCase);
}