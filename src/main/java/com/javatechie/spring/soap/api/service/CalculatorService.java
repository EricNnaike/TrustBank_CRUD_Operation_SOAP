package com.javatechie.spring.soap.api.service;

import org.springframework.stereotype.Service;

import com.javatechie.spring.soap.api.dto.Acknowledgement;
import com.javatechie.spring.soap.api.dto.CustomerRequest;

@Service
public class CalculatorService {
	public Acknowledgement checkLoanEligibility(CustomerRequest request) {

		int result = request.getNumber1() + request.getNumber2();

		return new Acknowledgement(result);
	}

}
