package com.service.validator;

import com.domain.exception.EntityNotFoundException;

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

}
