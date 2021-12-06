package com.example.pizza.controller;

import com.example.pizza.entity.Pizza;
import com.example.pizza.entity.Purchases;
import com.example.pizza.repository.OrderInterface;
import com.example.pizza.services.PizzaDataService;
import com.example.pizza.services.PurchaseDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/managment")
public class Managment {

    @Autowired
    private PurchaseDataService purchaseDataService;

    @Autowired
    private OrderInterface orderInterface;


    @GetMapping("/order")
    public String goToOrderList(Model model){


        List<Purchases> allStats = purchaseDataService.getAllStats();


        model.addAttribute("GetOrder", allStats);



        return "OrderManagment";
    }

}
