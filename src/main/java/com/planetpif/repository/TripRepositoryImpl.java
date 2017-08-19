package com.planetpif.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.planetpif.model.Trip;
import com.planetpif.service.PassengerService;

@Repository("tripRepository")
public class TripRepositoryImpl implements TripRepository {

	@Autowired
	private PassengerService passengerService;
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.platnetpif.repository.TripRepository#getAllTrips()
	 */
	@Override
	public List<Trip> getAllTrips() {

		List<Trip> trips = new ArrayList<Trip>();

		Trip trip = new Trip();
		trip.setFrom("Plovdiv");
		trip.setTo("Sofia");
		trip.setPassengers(passengerService.getAllPassengersForTrip(null));  //TODO delete this and use hibernate
		trips.add(trip);

		return trips;
	}

}
