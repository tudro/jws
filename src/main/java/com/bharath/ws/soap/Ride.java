package com.bharath.ws.soap;

import com.bharath.ws.soap.dto.RideRequest;
import com.bharath.ws.soap.dto.RideResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface Ride {

	@WebMethod
	public @WebResult(name = "response") RideResponse processRide(
			@WebParam(name = "rideRequest") RideRequest rideRequest);
}
