package com.planetpif.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.planetpif.model.Passenger;

@Repository
public class PassengerRepositoryImpl implements PassengerRepository {

	 /* (non-Javadoc)
	 * @see com.planetpif.repository.PassengerRepository#getAllPassengersForTrip(java.lang.Integer)
	 */
	@Override
	public List<Passenger> getAllPassengersForTrip(Integer tripId) {
		// TODO actually implement this (with hibernate etc)

		List<Passenger> passengers = new ArrayList<Passenger>();

		Passenger passenger1 = new Passenger("Ivaylo", "Lesev", "0123456789");
		Passenger passenger2 = new Passenger("Tsveti", "Ivanova", "0023456789");
		Passenger passenger3 = new Passenger("Foo", "Bar", "0003456789");

		passengers.add(passenger1);
		passengers.add(passenger2);
		passengers.add(passenger3);

		return passengers;
	}

}
