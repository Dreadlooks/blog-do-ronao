package br.com.gabriels.blogdoronao.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(@RequestParam(value = "error", required = false) boolean error,
                        @RequestParam(value = "logout", required = false) boolean logout, Model model) {
        if (error) {
            model.addAttribute("loginError", error);
        }

        if (logout) {
            model.addAttribute("logout", logout);
        }

        return "/shared/login.html";
    }
}
