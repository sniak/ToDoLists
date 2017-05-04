package controller;

import controller.service.AddListService;
import controller.service.MainListService;
import dao.Addlist;
import dao.Mainlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by sniak on 04.05.2017.
 */
@Controller
public class AddlistController {

        @Autowired
        private AddListService addListService;


        @RequestMapping(value = "/addlist", method = RequestMethod.GET)
        public String showAddToDo(ModelMap model) {

            //List<Addlist> addlists = addListService.findByMainlistId()//сделать
           // model.addAttribute("AddToDo", addlists);


            return "addlist";
        }



}
