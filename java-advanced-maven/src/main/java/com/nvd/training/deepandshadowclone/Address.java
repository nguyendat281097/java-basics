package com.nvd.training.deepandshadowclone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	private String street;
	private String city;
	private String country;

	public Address(Address that) {
		this(that.getStreet(), that.getCity(), that.getCountry());
	}
}
