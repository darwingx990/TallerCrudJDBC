package database;

import java.util.List;

public interface CRUD {

    public Object add (Object obj);
    public boolean update (Object obj);

    public List<Object> findAll();

    public boolean delete(Object obj);
}
