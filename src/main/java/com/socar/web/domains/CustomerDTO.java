package com.socar.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component
@Data
public class CustomerDTO {
	@Getter @Setter private int customerSeq;
	@Getter @Setter private String category, title, content, answer, fileName, role, regDate, id;
}
