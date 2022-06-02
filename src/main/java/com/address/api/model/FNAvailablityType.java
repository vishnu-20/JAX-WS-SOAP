

package com.address.api.model;


import java.util.List;

public class FNAvailablityType {


    public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResulttext() {
		return resulttext;
	}

	public void setResulttext(String resulttext) {
		this.resulttext = resulttext;
	}

	public List<AvilabilityInformationType> getAvailabilityInformation() {
		return availabilityInformation;
	}

	public void setAvailabilityInformation(List<AvilabilityInformationType> availabilityInformation) {
		this.availabilityInformation = availabilityInformation;
	}

	public String getNumberHits() {
		return numberHits;
	}

	public void setNumberHits(String numberHits) {
		this.numberHits = numberHits;
	}

	public List<AdditionalInformationType> getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(List<AdditionalInformationType> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	private String resultCode;

    private String resulttext;

    private List<AvilabilityInformationType> availabilityInformation;

    private String numberHits;

    private List<AdditionalInformationType> additionalInformation;


}
