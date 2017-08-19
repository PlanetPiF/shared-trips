package com.planetpif.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planetpif.model.Trip;
import com.planetpif.repository.TripRepository;

@Service("tripService")
public class TripServiceImpl implements TripService {

	@Autowired
	private TripRepository tripRepository;
	
	/* (non-Javadoc)
	 * @see com.platnetpif.service.TripService#getFirstTrip()
	 */
	@Override
	public Trip getFirstTrip() {
		return tripRepository.getAllTrips().get(0);
	}
	
}
