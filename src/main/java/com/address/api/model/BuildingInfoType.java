

package com.address.api.model;


public class BuildingInfoType {


    private String objectCategory;

    private String objectCategoryPresentationTxt;

    private Integer maxUnits;
  
    public String getObjectCategory() {
		return objectCategory;
	}

	public void setObjectCategory(String objectCategory) {
		this.objectCategory = objectCategory;
	}

	public String getObjectCategoryPresentationTxt() {
		return objectCategoryPresentationTxt;
	}

	public void setObjectCategoryPresentationTxt(String objectCategoryPresentationTxt) {
		this.objectCategoryPresentationTxt = objectCategoryPresentationTxt;
	}

	public Integer getMaxUnits() {
		return maxUnits;
	}

	public void setMaxUnits(Integer maxUnits) {
		this.maxUnits = maxUnits;
	}

	public Integer getSoldUnits() {
		return soldUnits;
	}

	public void setSoldUnits(Integer soldUnits) {
		this.soldUnits = soldUnits;
	}

	public Integer getFreeUnits() {
		return freeUnits;
	}

	public void setFreeUnits(Integer freeUnits) {
		this.freeUnits = freeUnits;
	}

	public String getNdpState() {
		return ndpState;
	}

	public void setNdpState(String ndpState) {
		this.ndpState = ndpState;
	}

	public String getNdpStatePresentationText() {
		return ndpStatePresentationText;
	}

	public void setNdpStatePresentationText(String ndpStatePresentationText) {
		this.ndpStatePresentationText = ndpStatePresentationText;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getNvType() {
		return nvType;
	}

	public void setNvType(String nvType) {
		this.nvType = nvType;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public FlagType getFlags() {
		return flags;
	}

	public void setFlags(FlagType flags) {
		this.flags = flags;
	}

	private Integer soldUnits;
   
    private Integer freeUnits;

    private String ndpState;
   
    private String ndpStatePresentationText;
   
    private String objectType;
   
    private String nvType;

    private String contractType;
 
    private FlagType flags;

}