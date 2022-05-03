package com.example.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.math.BigDecimal;
import java.util.List;

import static java.util.Arrays.asList;

@Controller
public class CalcController {
    @GetMapping("/")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "calc";
    }

    @GetMapping("/adding")
    public String showForm2(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "adding";
    }

    @PostMapping("/")
    public String submitForm(@ModelAttribute("user") User user) {
        System.out.println(user);
        return "register_success";
    }

    @PostMapping("/adding")
    public String submitForm2(@ModelAttribute("user") User user) {
        System.out.println(user);
        return "register_success";
    }



//    public double a = 10;
//    public double b = 5;
//@GetMapping("/")
//    public String calc(Model model){
//    double c = a + b;
//    model.addAttribute("hello","mamama");
//    model.addAttribute("c", c);
//    model.getAttribute("d");
//    return "calc";
//}
//@GetMapping("/")
//    public String adding(Model model){
//    double c = a + b;
//    model.addAttribute("c", "c");
//    return "calc";
//    }
// TextField textField = new TextField();
// String fdg = textField.getText();
//@RequestMapping("/")
//public String index(
//        @RequestParam(value = "participant", required = false) String participant,
//        @RequestParam(value = "country", required = false) String country,
//        @RequestParam(value = "action", required = false) String action,
//        @RequestParam(value = "id", required = false) Integer id,
//        Model model
//) {
//    model.addAttribute("id", id);
//    List<Integer> userIds = asList(1,2,3,4);
//    model.addAttribute("userIds", userIds);
//    return "calc";
//}
}


