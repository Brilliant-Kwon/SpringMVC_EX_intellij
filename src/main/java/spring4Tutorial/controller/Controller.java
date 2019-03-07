package spring4Tutorial.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/")
    public String HelloWorld(ModelMap modelMap) {
        modelMap.addAttribute("author", "KEUN");
        return "index";
    }
}
