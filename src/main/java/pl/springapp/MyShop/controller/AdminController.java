package pl.springapp.MyShop.controller;

import pl.springapp.MyShop.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    private String adminPage() {
        return "adminview/addItem";
    }

    @PostMapping
    private String addItem(Item item){
        HomeController.
    }
}
