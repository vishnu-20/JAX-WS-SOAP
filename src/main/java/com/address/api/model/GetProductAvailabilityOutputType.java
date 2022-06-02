
package com.address.api.model;

public class GetProductAvailabilityOutputType {

	private String event;

	private GetProductAvailabilityOutputDataType data;

	private String statue;

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public GetProductAvailabilityOutputDataType getData() {
		return data;
	}

	public void setData(GetProductAvailabilityOutputDataType data) {
		this.data = data;
	}

	public String getStatue() {
		return statue;
	}

	public void setStatue(String statue) {
		this.statue = statue;
	}

}
