package com.nvd.training.deepandshadowclone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private String firstName;
	private String lastName;
	private Address address;

	public User(User that) {
		this(that.getFirstName(), that.getLastName(), new Address(that.getAddress()));
	}
}
