
package com.address.api.model;

public class GetProductAvailabilityInputType {

	private String event;

	private GetProductAvailabilityInputDataType data;
	
	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public GetProductAvailabilityInputDataType getData() {
		return data;
	}

	public void setData(GetProductAvailabilityInputDataType data) {
		this.data = data;
	}

}
