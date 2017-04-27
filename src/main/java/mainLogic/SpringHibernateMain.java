package mainLogic;


import dal.AddlistDao;
import dal.MainlistDao;
import dal.impl.MainListDaoImpl;
import dao.Addlist;
import dao.Mainlist;
import org.joda.time.LocalDateTime;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static dal.MainlistDao.*;

public class SpringHibernateMain {


	//
	public static void main(String[] args) {

		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");
		
		//MainlistDao mainlistDao =context.getBean(MainlistDao.class);
		//AddlistDao addlistDao = context.getBean(AddlistDao.class);



		//Mainlist newMainlist = new Mainlist();
		//Addlist newAddlist = new Addlist();

//пытаюсь удалить 1 элемент но ничего не получается
		//mainlistDao.deleteTheMainList(1);
      /*  Long temp = new Long(2);
        List<Addlist> addlists = addlistDao.findByMainlistId(temp);
        System.out.println(addlists.get(0).getAddName());*/





	}

}
