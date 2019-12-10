package com.kkc.airlinesservice;

import com.kkc.airplaneDto.AirplanesDetailsDto;
import com.kkc.utils.InclassMemory;

public class AirlinesServices {
	
	public AirplanesDetailsDto senddata(Integer bookingno) {
		return InclassMemory.airlinesserv.get(bookingno);
	}

}
