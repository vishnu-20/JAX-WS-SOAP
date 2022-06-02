

package com.address.api.model;





public class GetProductAvailabilityInputDataType {

    
    private String kdAddressId;
  
    private int portal;

    private String postCode;
    
    private String city;

    private String subCity;

	private String district;

    private String street;

    private String houseNumber;

    private String houseNumberAddition;

    private String areaCode;

    private String phoneNumber;
    
    private String existingCustomerTASI;

    private String existingCustomerTN;

    public String getKdAddressId() {
		return kdAddressId;
	}

	public void setKdAddressId(String kdAddressId) {
		this.kdAddressId = kdAddressId;
	}

	public int getPortal() {
		return portal;
	}

	public void setPortal(int portal) {
		this.portal = portal;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSubCity() {
		return subCity;
	}

	public void setSubCity(String subCity) {
		this.subCity = subCity;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getHouseNumberAddition() {
		return houseNumberAddition;
	}

	public void setHouseNumberAddition(String houseNumberAddition) {
		this.houseNumberAddition = houseNumberAddition;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getExistingCustomerTASI() {
		return existingCustomerTASI;
	}

	public void setExistingCustomerTASI(String existingCustomerTASI) {
		this.existingCustomerTASI = existingCustomerTASI;
	}

	public String getExistingCustomerTN() {
		return existingCustomerTN;
	}

	public void setExistingCustomerTN(String existingCustomerTN) {
		this.existingCustomerTN = existingCustomerTN;
	}
    
}
