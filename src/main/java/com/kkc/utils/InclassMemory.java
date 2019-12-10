package com.kkc.utils;

import java.util.HashMap;
import java.util.Map;

import com.kkc.airplaneDto.AirplanesDetailsDto;

public class InclassMemory {

	public static Map<Integer, AirplanesDetailsDto> airlinesserv;

	static {
		airlinesserv = new HashMap<Integer, AirplanesDetailsDto>();
		AirplanesDetailsDto add = new AirplanesDetailsDto();
		add.setBookingno(1234);
		add.setCutsomerName("Kishor Kunwar");
		add.setFrom("Washington DC");
		add.setTo("Los Angeles");
		add.setAirlines("United Airlines");
		add.setPrice(350.00);
		airlinesserv.put(1234, add);

		AirplanesDetailsDto add1 = new AirplanesDetailsDto();
		add1.setBookingno(4321);
		add1.setCutsomerName("Jay Joshi");
		add1.setFrom("New York");
		add1.setTo("Bostan");
		add1.setAirlines("Spirit Airlines");
		add1.setPrice(280.99);
		airlinesserv.put(4321, add1);

		AirplanesDetailsDto add2 = new AirplanesDetailsDto();
		add2.setBookingno(5678);
		add2.setCutsomerName("Roshan Bhai");
		add2.setFrom("Richmond");
		add2.setTo("New York");
		add2.setAirlines("American Airlines");
		add2.setPrice(300.89);
		airlinesserv.put(5678, add2);

	}

}
