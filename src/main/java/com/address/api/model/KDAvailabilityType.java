
package com.address.api.model;

import java.util.List;

public class KDAvailabilityType {

	private List<ServiceCategoryUInfoType> serviceCategoryInfo;

	private List<ObjectTagType> objectTags;

	private BuildingInfoType buildingifo;

	public List<ServiceCategoryUInfoType> getServiceCategoryInfo() {
		return serviceCategoryInfo;
	}

	public void setServiceCategoryInfo(List<ServiceCategoryUInfoType> serviceCategoryInfo) {
		this.serviceCategoryInfo = serviceCategoryInfo;
	}

	public List<ObjectTagType> getObjectTags() {
		return objectTags;
	}

	public void setObjectTags(List<ObjectTagType> objectTags) {
		this.objectTags = objectTags;
	}

	public BuildingInfoType getBuildingifo() {
		return buildingifo;
	}

	public void setBuildingifo(BuildingInfoType buildingifo) {
		this.buildingifo = buildingifo;
	}

	
}
