package com.api.pakingcontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public record ParkingSpotDto(
		@NotBlank
		String parkingSpotNumber,
		@NotBlank
		@Size(max = 7)
		String licensePlateCar,
		@NotBlank
		String brandCar,
		@NotBlank
		String modelCar,
		@NotBlank
		String colorCar,
		@NotBlank
		String responsibleName,
		@NotBlank
		String apartment,
		@NotBlank
		String block) {

}
