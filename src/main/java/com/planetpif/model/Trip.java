package com.planetpif.model;

import java.util.List;

public class Trip {

	private Integer id;
	private String from;
	private String to;
	private Integer seatsMax;
	private Integer seatsTaken;

	private List<Passenger> passengers;

	public String getFrom() {
		return from;
	}

	public Integer getId() {
		return id;
	}

	public Integer getSeatsMax() {
		return seatsMax;
	}

	public void setSeatsMax(Integer seatsMax) {
		this.seatsMax = seatsMax;
	}

	public Integer getSeatsTaken() {
		return seatsTaken;
	}

	public void setSeatsTaken(Integer seatsTaken) {
		this.seatsTaken = seatsTaken;
	}

	public String getTo() {
		return to;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
}
