package com.tecnotree.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AdditionalInformation {

	private String serviceName;
	private DMNValues dmnValues;
		
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public DMNValues getDmnValues() {
		return dmnValues;
	}
	public void setDmnValues(DMNValues dmnValues) {
		this.dmnValues = dmnValues;
	}
	
	
	
}
