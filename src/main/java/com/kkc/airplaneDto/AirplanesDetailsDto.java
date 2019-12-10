package com.kkc.airplaneDto;

public class AirplanesDetailsDto {
	private int bookingno;
	private String cutsomerName;
	private String trip;
	private String from;
	private String to;
	private String airlines;
	private double price;

	public int getBookingno() {
		return bookingno;
	}

	public void setBookingno(int bookingno) {
		this.bookingno = bookingno;
	}

	public String getCutsomerName() {
		return cutsomerName;
	}

	public void setCutsomerName(String cutsomerName) {
		this.cutsomerName = cutsomerName;
	}

	public String getTrip() {
		return trip;
	}

	public void setTrip(String trip) {
		this.trip = trip;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getAirlines() {
		return airlines;
	}

	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
