package com.example.pizza.services;

import com.example.pizza.entity.Pizza;
import com.example.pizza.entity.Purchases;
import com.example.pizza.repository.OrderInterface;
import com.example.pizza.repository.PizzaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseDataService {
    @Autowired
    private OrderInterface orderInterface;

    private List<Purchases> allStats = new ArrayList<>();

    public List<Purchases> getAllStats() {
        return allStats;
    }



    @PostConstruct
    @Scheduled(cron = "10 * * * * *")
    public void fetchVirusData() throws IOException, InterruptedException {

        List<Purchases> newStats = new ArrayList<>();

        List<Purchases> records = new ArrayList<>();

        records =
                orderInterface.findAll();

        for(Purchases record: records){
            Purchases locationStats = new Purchases();
            locationStats.setOrderId(record.getOrderId());
            locationStats.setName(record.getName());
            locationStats.setSecondName(record.getSecondName());
            locationStats.setAddress(record.getAddress());
            locationStats.setApartment(record.getApartment());
            locationStats.setCity(record.getCity());
            locationStats.setOrderPrice(record.getOrderPrice());
            locationStats.setPizzaName(record.getPizzaName());
            locationStats.setPhoneNumber(record.getPhoneNumber());
            locationStats.setStatus(record.getStatus());

            System.out.println(locationStats);
            newStats.add(locationStats);
        }
        this.allStats = newStats;

    }
}
