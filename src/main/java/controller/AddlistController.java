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
import sun.applet.Main;

import java.util.List;

/**
 * Created by sniak on 04.05.2017.
 */
@Controller
public class AddlistController {

        @Autowired
        private AddListService addListService;

        @Autowired
        private MainListService mainListService;


        @RequestMapping(value = "/jsp/{id}", method = RequestMethod.GET)
        public String shoaddlistInfo(@PathVariable("id") long id, ModelMap model) {

                Mainlist mainlist = mainListService.findid(id);
                model.addAttribute("mainlist", mainlist);

                List<Addlist> addlists = addListService.findByMainlistId(mainlist.getMainId());
                model.addAttribute("AddToDo", addlists);

                return "addlist";
        }



}
