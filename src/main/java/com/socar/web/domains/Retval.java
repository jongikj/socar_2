package com.socar.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Component
public class Retval {
	@Getter @Setter private String message;
	@Getter @Setter private String flag;
}
