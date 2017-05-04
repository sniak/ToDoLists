package controller.service;

import dal.MainlistDao;
import dao.Mainlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sniak on 27.04.2017.
 */
@Service
public class MainListService {
    @Autowired
    private MainlistDao mainlistDao;
    public List<Mainlist> findAll() {
        List<Mainlist> list = mainlistDao.findAll();
        return list;
    }



}
