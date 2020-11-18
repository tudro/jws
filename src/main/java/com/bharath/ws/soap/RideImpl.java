package com.bharath.ws.soap;

import com.bharath.ws.soap.dto.RideRequest;
import com.bharath.ws.soap.dto.RideResponse;

public class RideImpl implements Ride {

	public RideResponse processRide(RideRequest rideRequest) {
		RideResponse rideResponse = new RideResponse();
		// Business Logic or a call to a Business Logic Class Goes Here.
		rideResponse.setResult(true);
		return rideResponse;
	}

}
