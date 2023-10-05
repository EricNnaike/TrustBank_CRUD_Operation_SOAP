package com.javatechie.spring.soap.api.emdpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.javatechie.spring.soap.api.dto.Acknowledgement;
import com.javatechie.spring.soap.api.dto.CustomerRequest;
import com.javatechie.spring.soap.api.service.CalculatorService;

@Endpoint
public class CalculatorEndpoint {
	private final CalculatorService calculatorService;

	private static final String NAMESPACE = "http://www.uchenna.com/spring/soap/api/calculator";

	public CalculatorEndpoint(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}


	@PayloadRoot(namespace = NAMESPACE, localPart = "CustomerRequest")
	@ResponsePayload
	public Acknowledgement getLoanStatus(@RequestPayload CustomerRequest request) {

		return calculatorService.checkLoanEligibility(request);
	}

}
