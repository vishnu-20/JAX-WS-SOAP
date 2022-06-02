
package com.address.api.model;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;



public class AvailabilityDetailType {


    private String product;

    public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public boolean isResale() {
		return resale;
	}

	public void setResale(boolean resale) {
		this.resale = resale;
	}

	public BigInteger getUpstream() {
		return upstream;
	}

	public void setUpstream(BigInteger upstream) {
		this.upstream = upstream;
	}

	public BigInteger getDownStream() {
		return downStream;
	}

	public void setDownStream(BigInteger downStream) {
		this.downStream = downStream;
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

	public Date getRfoDate() {
		return rfoDate;
	}

	public void setRfoDate(Date rfoDate) {
		this.rfoDate = rfoDate;
	}

	public Date getBandwidthEnhancementDate() {
		return bandwidthEnhancementDate;
	}

	public void setBandwidthEnhancementDate(Date bandwidthEnhancementDate) {
		this.bandwidthEnhancementDate = bandwidthEnhancementDate;
	}

	public Date getPortingEnhancementDate() {
		return portingEnhancementDate;
	}

	public void setPortingEnhancementDate(Date portingEnhancementDate) {
		this.portingEnhancementDate = portingEnhancementDate;
	}

	public boolean isCriticalAbsorbability() {
		return criticalAbsorbability;
	}

	public void setCriticalAbsorbability(boolean criticalAbsorbability) {
		this.criticalAbsorbability = criticalAbsorbability;
	}

	public String getBandwidthDeterminationType() {
		return bandwidthDeterminationType;
	}

	public void setBandwidthDeterminationType(String bandwidthDeterminationType) {
		this.bandwidthDeterminationType = bandwidthDeterminationType;
	}

	public String getCustomertype() {
		return customertype;
	}

	public void setCustomertype(String customertype) {
		this.customertype = customertype;
	}

	public BigInteger getPriority() {
		return priority;
	}

	public void setPriority(BigInteger priority) {
		this.priority = priority;
	}

	public boolean isCurrentOffer() {
		return currentOffer;
	}

	public void setCurrentOffer(boolean currentOffer) {
		this.currentOffer = currentOffer;
	}

	public List<AviailabilityOptionType> getAvailabilityOption() {
		return availabilityOption;
	}

	public void setAvailabilityOption(List<AviailabilityOptionType> availabilityOption) {
		this.availabilityOption = availabilityOption;
	}

	private boolean resale;

    private BigInteger upstream;

    private BigInteger downStream;

    private String availabilityIndicator;
 
    private String availabilityReason;


    private Date rfoDate;
  
    private Date bandwidthEnhancementDate;

    private Date portingEnhancementDate;
   
    private boolean criticalAbsorbability;
  
    private String bandwidthDeterminationType;
 
    private String customertype;

    private BigInteger priority;
  
    private boolean currentOffer;
  
    private List<AviailabilityOptionType> availabilityOption;

}