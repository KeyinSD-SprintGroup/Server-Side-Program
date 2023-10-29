package com.keyin.entity.passenger;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class PassengerService {
    private final ArrayList<Passenger> passengerList = new ArrayList<Passenger>();

    public List<Passenger> getAllPassenger() {
        return passengerList;
    }

    public Passenger createPassenger(Passenger passenger) {
        passengerList.add(passenger);
        return passenger;
    }

    public List<Passenger> findPassengerByParameters(PassengerSearchParameters passengerSearchParameters) {
        List<Passenger> searchResults = new ArrayList<>();

        for (Passenger passenger : passengerList) {
            if (passengerSearchParameters.getId() != null &&
                    !Objects.equals(passenger.getId(), passengerSearchParameters.getId())) {
                continue;
            }
            if (passengerSearchParameters.getFirstName() != null &&
                    !passenger.getFirstName().equalsIgnoreCase(passengerSearchParameters.getFirstName())) {
                continue;
            }
            if (passengerSearchParameters.getLastName() != null &&
                    !passenger.getLastName().equalsIgnoreCase(passengerSearchParameters.getLastName())) {
                continue;
            }
            if (passengerSearchParameters.getPhoneNumber() != null &&
                    !passenger.getPhoneNumber().equals(passengerSearchParameters.getPhoneNumber())) {
                continue;
            }
            searchResults.add(passenger);
        }
        return searchResults;
    }
}
