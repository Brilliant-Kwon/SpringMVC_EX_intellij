package spring4Tutorial.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
    @RequestMapping("/")
//    public ModelAndView home(@RequestParam("name") String name) {
    //반드시 파라미터가 전달되어야한다. (기본값이 없어서 오류)
    public ModelAndView home(@RequestParam(value = "name", required = false, defaultValue = "Anonymous") String name) {
        //꼭 필요하진 않고 이름은 네임이고, 기본값은 어나니머스
        ModelAndView mav = new ModelAndView();
        mav.addObject("message", "Hello, " + name);
        mav.setViewName("index");
        return mav;
    }

    //Path Variable
    //URL Path
    @RequestMapping("/pathparam/{name}/{no}")
    public ModelAndView pathparam(
            @PathVariable("name") String name,
            @PathVariable("no") Long no) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("message", "Name:" + name + "No:" + no);
        mav.setViewName("hello");
        return mav;
    }

    //String을 리턴타입으로 잡으면 ViewName 반환
    @RequestMapping("/withmodel")
    public String withmodel(ModelMap map) {
        map.addAttribute("message", "모델 맵을 사용");
        return "hello";
    }
}
