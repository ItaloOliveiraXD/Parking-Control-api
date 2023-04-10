package com.api.pakingcontrol.dtos;

public record ParkingSpotDto(String parkingSpotNumber, String licensePlateCar, String brandCar, String modelCar,
		String colorCar, String responsibleName, String apartment, String block) {

}
