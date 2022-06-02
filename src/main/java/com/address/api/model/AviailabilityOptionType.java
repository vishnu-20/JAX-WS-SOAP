


package com.address.api.model;

import java.util.Date;
import java.util.List;


public class AviailabilityOptionType {


    public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public String getAvailabilityIndicator() {
		return availabilityIndicator;
	}

	public void setAvailabilityIndicator(String availabilityIndicator) {
		this.availabilityIndicator = availabilityIndicator;
	}

	public String getAvailabilityReason() {
		return availabilityReason;
	}

	public void setAvailabilityReason(String availabilityReason) {
		this.availabilityReason = availabilityReason;
	}

	public Date getRfoDaten() {
		return rfoDaten;
	}

	public void setRfoDaten(Date rfoDaten) {
		this.rfoDaten = rfoDaten;
	}

	public Date getPortextentionDate() {
		return portextentionDate;
	}

	public void setPortextentionDate(Date portextentionDate) {
		this.portextentionDate = portextentionDate;
	}

	public List<AdditionalInformationType> getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(List<AdditionalInformationType> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	private String optionName;

    private String availabilityIndicator;

    private String availabilityReason;
  
    private Date rfoDaten;

 
    private Date portextentionDate;

    private List<AdditionalInformationType> additionalInformation;

}