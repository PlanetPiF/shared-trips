package com.planetpif.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planetpif.model.Passenger;
import com.planetpif.repository.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerRepository passengerRepository;

	/* (non-Javadoc)
	 * @see com.planetpif.service.PassengerService#getAllPassengersForTrip(java.lang.Integer)
	 */
	@Override
	public List<Passenger> getAllPassengersForTrip(Integer tripId) {

		return passengerRepository.getAllPassengersForTrip(null);
	}
}
