package com.example.pizza.controller;
import com.example.pizza.entity.Customer;
import com.example.pizza.entity.Pizza;
import com.example.pizza.repository.CustomerInterface;
import com.example.pizza.repository.PizzaInterface;
import com.example.pizza.services.PizzaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class Home {



    @Autowired
    private PizzaDataService pizzaDataService;

    @Autowired
    private CustomerInterface customerInterface;

    @Autowired
    private PizzaInterface pizzaInterface;

    @GetMapping("/home")
    public String goToHomePage(Model model){

        List<Customer> customer =
                customerInterface.findAll();

        model.addAttribute("UserInfo", customer);


        return "home";
    }



    @GetMapping("/Menu")
    public String goToMenu(Model model){

        List<String> pizza =
                pizzaInterface.findPizza();


        List<Pizza> allStats = pizzaDataService.getAllStats();

        model.addAttribute("GetPizza", allStats);



        return "Menu";
    }


}
