package com.api.pakingcontrol.models;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "PARKING-SPOT")
@Table(name = "TB_PARKING_SPOT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ParkingSpotModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	@Column(nullable = false, unique = true, length = 10)
	private String parkingSpotNumber;
	@Column(nullable = false, unique = true, length = 7)
	private String licensePlateCar;
	@Column(nullable = false, length = 70)
	private String brandCar;
	@Column(nullable = false, length = 70)
	private String modelCar;
	@Column(nullable = false, length = 70)
	private String colorCar;
	@Column(nullable = false)
	private LocalDateTime registrationDate;
	@Column(nullable = false, length = 130)
	private String responsibleName;
	@Column(nullable = false, length = 30)
	private String apartment;
	@Column(nullable = false, length = 30)
	private String block;

}