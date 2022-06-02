package com.address.api.model;


public class GetProductAvailabilityOutputDataType {


    private KDAvailabilityType kdAvailabilityType;

    private int kdCallStatus;

    private FNAvailablityType fnAvailablity;

    private String fnCallStatus;

    private String subCity;

	private String district;

    private String street;

    private String houseNumber;
   
    private String houseNumberAddition;

    private String areaCode;
 
    private String phoneNumber;

    private String existingCustomerTASI;

    private String existingCustomerTN;
    
    public KDAvailabilityType getKdAvailabilityType() {
  		return kdAvailabilityType;
  	}

  	public void setKdAvailabilityType(KDAvailabilityType kdAvailabilityType) {
  		this.kdAvailabilityType = kdAvailabilityType;
  	}

  	public int getKdCallStatus() {
  		return kdCallStatus;
  	}

  	public void setKdCallStatus(int kdCallStatus) {
  		this.kdCallStatus = kdCallStatus;
  	}

  	public FNAvailablityType getFnAvailablity() {
  		return fnAvailablity;
  	}

  	public void setFnAvailablity(FNAvailablityType fnAvailablity) {
  		this.fnAvailablity = fnAvailablity;
  	}

  	public String getFnCallStatus() {
  		return fnCallStatus;
  	}

  	public void setFnCallStatus(String fnCallStatus) {
  		this.fnCallStatus = fnCallStatus;
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
