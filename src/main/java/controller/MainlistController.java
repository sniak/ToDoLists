package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sniak on 27.04.2017.
 */
@Controller
public class MainlistController {

    @RequestMapping("/")
    public ModelAndView index() {
        String message = "Message from public class UserController";
        return new ModelAndView("index", "message", message);
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