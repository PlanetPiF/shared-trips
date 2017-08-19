package com.planetpif.repository;

import java.util.List;

import com.planetpif.model.Passenger;

public interface PassengerRepository {

	public List<Passenger> getAllPassengersForTrip(Integer tripId);

}