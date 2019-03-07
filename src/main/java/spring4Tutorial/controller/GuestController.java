package spring4Tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/guestbook/*")
public class GuestController {
    @ResponseBody
    @RequestMapping("list")
    public String list() {
        return "<h1>Guestbook: list</h1>";
    }

    @ResponseBody
    @RequestMapping("add")
    public String add() {
        return "<h1>Guestbook: add</h1>";
    }

    @ResponseBody
    @RequestMapping("delete")
    public String delete() {
        return "<h1>Guestbook: delete</h1>";
    }
}
