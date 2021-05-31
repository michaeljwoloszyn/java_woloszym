package sheridan.woloszym.exercise1v1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sheridan.woloszym.exercise1v1.domain.User;

@Controller
public class InputController {
    @GetMapping("/Input")
    public String input(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "Input";
    }

}
