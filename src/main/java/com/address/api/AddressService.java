package com.address.api;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface AddressService {

	 @WebMethod
	    public String getQuote();
}
