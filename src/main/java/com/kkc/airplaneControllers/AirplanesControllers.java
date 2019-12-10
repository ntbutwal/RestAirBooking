package com.kkc.airplaneControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kkc.airlinesservice.AirlinesServices;
import com.kkc.airplaneDto.AirplanesDetailsDto;

@RestController
@RequestMapping("/airlines")
public class AirplanesControllers {

	AirlinesServices airlinesservice;

	@GetMapping(value = "")
	public AirplanesDetailsDto savedata(@RequestParam Integer airlinesid) {
		return airlinesservice.senddata(airlinesid);

	}

	public AirlinesServices getAirlinesservice() {
		return airlinesservice;
	}

	public void setAirlinesservice(AirlinesServices airlinesservice) {
		this.airlinesservice = airlinesservice;
	}

}
