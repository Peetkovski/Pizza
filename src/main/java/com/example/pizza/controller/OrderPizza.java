package com.example.pizza.controller;

import com.example.pizza.entity.Purchases;
import com.example.pizza.repository.OrderInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Controller

public class OrderPizza {


    @Autowired
    private OrderInterface orderInterface;




    @PostMapping("/order")
    public String OrderPizza(@ModelAttribute("purchases")Purchases purchases){


        orderInterface.save(purchases);


        System.out.println(purchases);


        return "OrderFinished";
    }


    @GetMapping("/order")
    public String goToOrder(Model model){

        Purchases purchases = new Purchases();

        model.addAttribute(purchases);

        return "OrderPizza";
    }


    @GetMapping("/finished")
    public String getFinised(Model model){

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

        model.addAttribute("date",formattedDate);

        return "OrderFinished";
    }

}
