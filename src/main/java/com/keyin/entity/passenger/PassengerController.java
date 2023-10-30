package com.keyin.entity.passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @GetMapping("/passenger_search")
    public List<Passenger> getCityByParameters(
            @RequestParam(required = false) Long id,
            @RequestParam(name="firstname", required = false) String firstName,
            @RequestParam(name="lastName", required = false) String lastName,
            @RequestParam(name="phonenumber", required = false) String phoneNumber) {
        PassengerSearchParameters passengerSearchParameters = new PassengerSearchParameters();
        try {
            if (id != null) {
                System.out.println(id);
                passengerSearchParameters.setId(id);
            }
            if (firstName != null) {
                System.out.println(firstName);
                passengerSearchParameters.setFirstName(firstName);
            }
            if (lastName != null) {
                System.out.println(lastName);
                passengerSearchParameters.setLastName(lastName);
            }
            if (phoneNumber != null) {
                System.out.println(lastName);
                passengerSearchParameters.setPhoneNumber(phoneNumber);
            }
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
            return new ArrayList<>();
        }
        System.out.println(passengerSearchParameters);
        return passengerService.findPassengerByParameters(passengerSearchParameters);
    }

    @PostMapping("/passenger")
    public Passenger createNewPassenger(@RequestBody Passenger passenger) {
        return passengerService.createPassenger(passenger);
    }
}
