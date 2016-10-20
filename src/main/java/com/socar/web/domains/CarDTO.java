package com.socar.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component
@Data
public class CarDTO {
	@Getter @Setter private int rentAmt, driveAmt;
	@Getter @Setter private String carNum, carType, oilType, carOption, socarZone, carImg;
}
