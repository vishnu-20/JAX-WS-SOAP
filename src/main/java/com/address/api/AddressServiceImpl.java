package com.address.api;

import javax.jws.WebService;

@WebService(endpointInterface = "com.address.api.AddressService")
public class AddressServiceImpl  implements AddressService{

	@Override
	public String getQuote() {
		
		return null;
	}

}
