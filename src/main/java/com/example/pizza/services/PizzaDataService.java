package com.example.pizza.services;


import com.example.pizza.entity.Pizza;
import com.example.pizza.repository.PizzaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class PizzaDataService {

    @Autowired
    private PizzaInterface pizzaInterface;

    private List<Pizza> allStats = new ArrayList<>();

    public List<Pizza> getAllStats() {
        return allStats;
    }



    @PostConstruct
    @Scheduled(cron = "* * 1 * * *")
    public void fetchVirusData() throws IOException, InterruptedException {

        List<Pizza> newStats = new ArrayList<>();

       List<Pizza> records = new ArrayList<>();
       records =
               pizzaInterface.findAll();

        for(Pizza record: records){
            Pizza locationStats = new Pizza();
            locationStats.setName(record.getName());
            locationStats.setPrice(record.getPrice());

            System.out.println(locationStats);
            newStats.add(locationStats);
        }
        this.allStats = newStats;

    }
    }








