package com.example.pizza.controller;

import com.example.pizza.entity.Pizza;
import com.example.pizza.entity.Purchases;
import com.example.pizza.repository.OrderInterface;
import com.example.pizza.services.PizzaDataService;
import com.example.pizza.services.PurchaseDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

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


        int status = 0;
        model.addAttribute("GetOrder", allStats);
        model.addAttribute("notDelivered", status);



        return "OrderManagment";
    }



    @GetMapping(path = "/order/{getOrderId}")
    public String updateStudent(@PathVariable("getOrderId") Integer getOrderId, Model model){

        Purchases purchases =
                orderInterface.findByOrderId(getOrderId);



        model.addAttribute("Delivered", purchases);
        System.out.println(purchases);
        purchases.setStatus("1");

        orderInterface.save(purchases);

        return "redirect:/managment/order";
    }




}
