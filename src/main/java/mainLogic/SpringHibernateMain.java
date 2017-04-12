package mainLogic;


import dal.AddlistDao;
import dal.MainlistDao;
import dao.Addlist;
import dao.Mainlist;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static dal.MainlistDao.*;

public class SpringHibernateMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");
		
		MainlistDao MainlistDao = context.getBean(MainlistDao.class);
		AddlistDao AddlistDao = context.getBean(AddlistDao.class);

		Mainlist newMainlist1 = new Mainlist();
		newMainlist1.setName("study");
		newMainlist1.setDateTime(LocalDateTime.parse("2017-04-10T10:11:30"));
		newMainlist1.setDescription("");
		newMainlist1.setImportance(true);
		newMainlist1.setPeriod(10);
		newMainlist1.setNotification(true);
		MainlistDao.save(newMainlist1);

        Addlist newAddlist1 = new Addlist();
        newAddlist1.setMainlist(newMainlist1);
        newAddlist1.setAddName("diploma");
		newAddlist1.setAddDescription("");
		AddlistDao.save(newAddlist1);
/*
		Addlist newAddlist12 = new Addlist();
		newAddlist12.setMainlist(newMainlist1);
		newAddlist12.setadd_name("homework");
		newAddlist12.setadd_description("");
		AddlistDao.save(newAddlist12);

		Mainlist newMainlist4 = new Mainlist();
		newMainlist4.setname("cooking");
		//newMainlist4.setdate("06.04.2017");
		newMainlist4.setdescription("");
		newMainlist4.setimportance(0);
		newMainlist4.setperiod("");
		newMainlist4.setnotificaton("0");
		MainlistDao.save(newMainlist4);

		Addlist newAddlist4 = new Addlist();
		newAddlist4.setadd_name("borsh");
		newAddlist4.setadd_description("");
		AddlistDao.save(newAddlist4);

		Mainlist newMainlist5 = new Mainlist();
		newMainlist5.setname("cinema");
		//
		newMainlist5.setdescription("");
		newMainlist5.setimportance(0);
		newMainlist5.setperiod();
		newMainlist5.setnotificaton("0");
		MainlistDao.save(newMainlist5);

*/

		
		System.out.println("Mainlist::" + newMainlist1.toString());
		
		List<Mainlist> MainlistList = MainlistDao.findAll();
		
		for(Mainlist mainlist : MainlistList){
			System.out.println("Mainlist List::" + mainlist);
		}

		context.close();
		
	}

}
