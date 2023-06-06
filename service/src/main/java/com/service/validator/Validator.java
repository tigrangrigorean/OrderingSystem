package com.service.validator;

import com.domain.exception.EntityNotFoundException;
import com.domain.exception.InvalidPriceException;

public class Validator {
	
	public static boolean checkId(long id) {
		if(id <= 0) {
			throw new IllegalArgumentException("Id is wrong");
		}
		return true;
	}
	
	public static boolean checkEntity(Object o) {
		if(o == null) {
			throw new EntityNotFoundException("Entity not found");
		}
		return true;
	}
	
	public static boolean checkPrice(double price) {
		if(price < 0) {
			throw new InvalidPriceException("Entered price is invalid");
		}
		return true;
	}
	

}
