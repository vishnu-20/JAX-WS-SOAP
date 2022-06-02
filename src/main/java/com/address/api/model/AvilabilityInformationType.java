package com.address.api.model;

import java.util.List;

public class AvilabilityInformationType {

	private AvailabilityDetailsType availabilityDetails;

	private String voipAvailability;

	private String areaCode;

	public AvailabilityDetailsType getAvailabilityDetails() {
		return availabilityDetails;
	}

	public void setAvailabilityDetails(AvailabilityDetailsType availabilityDetails) {
		this.availabilityDetails = availabilityDetails;
	}

	public String getVoipAvailability() {
		return voipAvailability;
	}

	public void setVoipAvailability(String voipAvailability) {
		this.voipAvailability = voipAvailability;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAsb() {
		return asb;
	}

	public void setAsb(String asb) {
		this.asb = asb;
	}

	public HvtInformationType getHvtInformation() {
		return hvtInformation;
	}

	public void setHvtInformation(HvtInformationType hvtInformation) {
		this.hvtInformation = hvtInformation;
	}

	public AddressRangeType getAddressRange() {
		return addressRange;
	}

	public void setAddressRange(AddressRangeType addressRange) {
		this.addressRange = addressRange;
	}

	public KvzInformationType getKvzInformation() {
		return kvzInformation;
	}

	public void setKvzInformation(KvzInformationType kvzInformation) {
		this.kvzInformation = kvzInformation;
	}

	public MfgInformationType getMfgInformation() {
		return mfgInformation;
	}

	public void setMfgInformation(MfgInformationType mfgInformation) {
		this.mfgInformation = mfgInformation;
	}

	public List<AdditionalInformationType> getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(List<AdditionalInformationType> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	private String asb;

	private HvtInformationType hvtInformation;

	private AddressRangeType addressRange;

	private KvzInformationType kvzInformation;

	private MfgInformationType mfgInformation;

	private List<AdditionalInformationType> additionalInformation;

}
