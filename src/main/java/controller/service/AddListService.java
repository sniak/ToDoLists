package controller.service;

import dal.AddlistDao;
import dao.Addlist;
import dao.Mainlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sniak on 27.04.2017.
 */
@Service
public class AddListService {
    @Autowired
    AddlistDao addlistDao;
    public List<Addlist> findByMainlistId(Long mainlistId) {
        List<Addlist> list = addlistDao.findByMainlistId(mainlistId);
        return list;
    }





}
