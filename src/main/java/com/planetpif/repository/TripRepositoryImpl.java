package com.planetpif.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.planetpif.model.Trip;

@Repository("tripRepository")
public class TripRepositoryImpl implements TripRepository {

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
		trips.add(trip);

		return trips;
	}

}
