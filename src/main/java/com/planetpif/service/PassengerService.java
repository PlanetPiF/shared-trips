package com.planetpif.service;

import java.util.List;

import com.planetpif.model.Passenger;

public interface PassengerService {

	List<Passenger> getAllPassengersForTrip(Integer tripId);

}