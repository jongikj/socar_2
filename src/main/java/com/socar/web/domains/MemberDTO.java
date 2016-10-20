package com.socar.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Component
public class MemberDTO {
	@Getter @Setter private String id, pw, name, phone, address, licenseType, licenseNum, expireDate, issueDate, birth, gender;
}
