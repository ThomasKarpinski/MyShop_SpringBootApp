package pl.springapp.MyShop.controller;

import pl.springapp.MyShop.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    List<Item> items = new ArrayList<>();

    static {
        items.add("Ołówek", new BigDecimal("2.10"),"https://iheartcraftythings.com/wp-content/uploads/2021/05/Pencil-DRAWING-%E2%80%93-STEP-10.jpg"));
        items.add("Ołówek", new BigDecimal("1.50"),"https://iheartcraftythings.com/wp-content/uploads/2021/05/Pencil-DRAWING-%E2%80%93-STEP-10.jpg"));
        items.add("Ołówek", new BigDecimal("8.60"),"https://iheartcraftythings.com/wp-content/uploads/2021/05/Pencil-DRAWING-%E2%80%93-STEP-10.jpg"));

    );

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("items", items);
        return "home";
    }
}
