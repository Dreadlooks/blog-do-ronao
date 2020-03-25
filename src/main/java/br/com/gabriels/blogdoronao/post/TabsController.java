package br.com.gabriels.blogdoronao.post;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TabsController {

    @RequestMapping("/home")
    public String home() {
        return "/tabs/home";
    }

    @RequestMapping("/about")
    public String about() {
        return "/tabs/about";
    }

    @RequestMapping("/signup")
    public String signUp() {
        return "/tabs/signup";
    }
}
