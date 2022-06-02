
package com.address.api.model;

import java.util.List;

public class HvtInformationType {

	private String cableType;

	private String hvtTnb;

	private String hvtRegion;

	private String hvtPostCode;
	

	private String hvtCity;

	private String hvtStreet;

	private List<AdditionalInformationType> additionalInformation;


	public String getCableType() {
		return cableType;
	}

	public void setCableType(String cableType) {
		this.cableType = cableType;
	}

	public String getHvtTnb() {
		return hvtTnb;
	}

	public void setHvtTnb(String hvtTnb) {
		this.hvtTnb = hvtTnb;
	}

	public String getHvtRegion() {
		return hvtRegion;
	}

	public void setHvtRegion(String hvtRegion) {
		this.hvtRegion = hvtRegion;
	}

	public String getHvtPostCode() {
		return hvtPostCode;
	}

	public void setHvtPostCode(String hvtPostCode) {
		this.hvtPostCode = hvtPostCode;
	}

	public String getHvtCity() {
		return hvtCity;
	}

	public void setHvtCity(String hvtCity) {
		this.hvtCity = hvtCity;
	}

	public String getHvtStreet() {
		return hvtStreet;
	}

	public void setHvtStreet(String hvtStreet) {
		this.hvtStreet = hvtStreet;
	}

	public List<AdditionalInformationType> getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(List<AdditionalInformationType> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

}
