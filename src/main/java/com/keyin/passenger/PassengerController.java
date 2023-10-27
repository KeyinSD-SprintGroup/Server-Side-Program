package com.keyin.passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PassengerController {
    @Autowired
    private PassengerService passengerService;

    @GetMapping("/passenger")
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassenger();
    }

    @PostMapping("/passenger")
    public Passenger createNewPassenger(@RequestBody Passenger passenger) {
        return passengerService.createPassenger(passenger);
    }
}
