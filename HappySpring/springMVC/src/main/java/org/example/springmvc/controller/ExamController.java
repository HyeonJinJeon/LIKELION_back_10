package org.example.springmvc.controller;

import org.example.springmvc.domain.Item;
import org.example.springmvc.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ExamController {
    @GetMapping("/welcome")
    public String welcome(Model model){
        model.addAttribute("welcomeMsg", "환영합니다^^ spring MVC 실습입니다");

        List<Item> items = Arrays.asList(
                new Item("pen" , 3000),
                new Item("notebook" , 800000),
                new Item("cup" , 1500)
        );

        model.addAttribute("items", items);
        return "welcome";
    }


    @GetMapping("/products")
    public String products(Model model){
        model.addAttribute("welcomeMsg", "환영합니다^^ spring MVC 실습입니다");

        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product(1, "Apple", 1.20),
                new Product(2, "Banana", 0.75),
                new Product(3, "Cherry", 2.05)
        ));

        model.addAttribute("products", products);
        return "products";
    }

    //url = /products 요청하면 응답하도록 메서드를 정의하세요.
    //products 를 이용해서 상품목록이 출력되도록 템플릿을 작성해 주세요.
}
