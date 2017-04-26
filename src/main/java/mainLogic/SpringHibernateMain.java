package mainLogic;


import dal.AddlistDao;
import dal.MainlistDao;
import dal.impl.MainListDaoImpl;
import dao.Addlist;
import dao.Mainlist;
import org.joda.time.LocalDateTime;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static dal.MainlistDao.*;

public class SpringHibernateMain {


	//
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");
		
		MainlistDao mainlistDao =context.getBean(MainlistDao.class);
		AddlistDao addlistDao = context.getBean(AddlistDao.class);



		//Mainlist newMainlist = new Mainlist();
		//Addlist newAddlist = new Addlist();

//пытаюсь удалить 1 элемент но ничего не получается
		mainlistDao.deleteTheMainList(1);


		/*Mainlist newMainlist1 = new Mainlist();
		newMainlist1.setName("Учёба");
		newMainlist1.setDateTime(LocalDateTime.parse("2017-04-10T10:11:30"));
		newMainlist1.setDescription("Учимся С:");
		newMainlist1.setImportance(true);
		newMainlist1.setPeriod(10l);   //дописываем l, потому что тип long
		newMainlist1.setNotification(true);
		MainlistDao.save(newMainlist1);

		Addlist newAddlist1 = new Addlist();
		newAddlist1.setMainlist(newMainlist1);
		newAddlist1.setAddName("Диплом");
		newAddlist1.setAddDescription("Пишем потихоньку");
		AddlistDao.save(newAddlist1);

		Addlist newAddlist2 = new Addlist();
		newAddlist2.setMainlist(newMainlist1);
		newAddlist2.setAddName("Домашка");
		newAddlist2.setAddDescription("Не делаем :С");
		AddlistDao.save(newAddlist2);

		Mainlist newMainlist2 = new Mainlist();
		newMainlist2.setName("Кино");
		newMainlist2.setDateTime(LocalDateTime.parse("2017-04-15T9:00:00"));
		newMainlist2.setDescription("Идём в кино");
		newMainlist2.setImportance(true);
		newMainlist2.setPeriod(10l);   //дописываем l, потому что тип long
		newMainlist2.setNotification(true);
		MainlistDao.save(newMainlist2);

		Addlist newAddlist3 = new Addlist();
		newAddlist3.setMainlist(newMainlist2);
		newAddlist3.setAddName("Купить билеты онлайн");
		newAddlist3.setAddDescription("На хороший ряд");
		AddlistDao.save(newAddlist3);

*/
		

	}

}
