package controller;

import controller.service.AddListService;
import controller.service.MainListService;
import dao.Addlist;
import dao.Mainlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by sniak on 27.04.2017.
 */
@Controller
public class MainlistController {

    @Autowired
    private MainListService mainListService;
    @Autowired
    private AddListService addListServicee;

    @RequestMapping("/")
    public ModelAndView index() {
        String message = "ДОБРО ПОЖАЛОВАТЬ";
        return new ModelAndView("index", "message", message);
    }


     @RequestMapping(value = "/mainlist", method = RequestMethod.GET)
     public String showAllToDo(ModelMap model) {

         List<Mainlist> mainlist = mainListService.findAll();//сделать
         model.addAttribute("MainToDo", mainlist);


         return "mainlist";
     }



}

