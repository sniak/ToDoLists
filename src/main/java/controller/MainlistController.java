package controller;

import Service.MainListService;
import dao.Mainlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by sniak on 27.04.2017.
 */
@Controller
public class MainlistController {

   // @Autowired
    private MainListService mainListService;

    @RequestMapping("/")
    public ModelAndView index() {
        String message = "Message from public class UserController";
        return new ModelAndView("index", "message", message);
    }


      @RequestMapping(value = "/mainList", method = RequestMethod.GET)
  public String showAllUsers(ModelMap model) {

        List<Mainlist> mainlists = mainListService.findAll();//сделать
        model.addAttribute("MainToDo", mainlists);


      return "mainList/list";
    }

}


/* public class UserController {

        @Autowired
        private UserService userService;


        @RequestMapping("/")
        public ModelAndView index() {
            String message = "Message from public class UserController";
            return new ModelAndView("index", "message", message);
        }
    }*/