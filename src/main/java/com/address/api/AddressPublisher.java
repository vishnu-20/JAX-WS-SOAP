package com.address.api;
import javax.xml.ws.Endpoint

public class AddressPublisher {
	public static void main(String[] args) {
       

        Endpoint.publish("http://localhost:8080/addressService", 
          new AddressServiceImpl());
    }
}
