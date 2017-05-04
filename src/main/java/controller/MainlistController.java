package controller;

import controller.service.AddListService;
import controller.service.MainListService;
import dao.Addlist;
import dao.Mainlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sun.tools.jar.Main;

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

    @RequestMapping(value = "/jsp/{id}/delete", method = RequestMethod.GET)
    public String deleteMain(@PathVariable("id") long id,ModelMap model){
        mainListService.deleteTheMainList(id);
        return "redirect:/mainlist";
    }


    @RequestMapping(value = "/jsp/{id}/update", method = RequestMethod.GET)
    public String showUpdateUserForm(@PathVariable("id") long id, ModelMap model) {

        Mainlist mainlist = mainListService.findid(id);
        model.addAttribute("task", mainlist);

        return "rewrite";
    }




    @RequestMapping(value = "/mainlist/update", method = RequestMethod.POST)
    public String showUpdateDB(@ModelAttribute("task")  Mainlist mainlist) {
        System.out.println(mainlist.toString());
       // mainListService.update(mainlist);
        //return "/rewrite";
       return  "redirect:/mainlist";
    }
}

