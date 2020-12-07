package com.home.ludo.ngcsgenerator.services;

import java.util.ArrayList;
import java.util.List;

import com.home.ludo.ngcs.ngcsmodel.NgcsAggregation;
import com.home.ludo.ngcs.ngcsmodel.NgcsData;
import com.home.ludo.ngcs.ngcsmodel.NgcsModule;
import com.home.ludo.ngcs.ngcsmodel.NgcsProperty;
import com.home.ludo.ngcs.ngcsmodel.NgcsReference;


public class NgcsServices {
	private void findDependencies(NgcsModule module, NgcsData data, List<NgcsData> result) {
		for(int i = 0; i < data.getNgcsproperty().size(); i++) {
			NgcsProperty property = data.getNgcsproperty().get(i); 
			if(property instanceof NgcsAggregation) {
				if(!result.contains(((NgcsAggregation) property).getRefTo())) {
					result.add(((NgcsAggregation) property).getRefTo());
					this.findDependencies(module, ((NgcsAggregation) property).getRefTo(), result);
				}
			} else if(property instanceof NgcsReference) {
				if(!result.contains(((NgcsReference) property).getRefTo())) {
					result.add(((NgcsReference) property).getRefTo());
					this.findDependencies(module, ((NgcsReference) property).getRefTo(), result);
				}				
			}
		}
	}
	 
	public List<NgcsData> getDependencies(NgcsData data) {
		NgcsModule module = (NgcsModule)data.eContainer();
		List<NgcsData> result = new ArrayList<NgcsData>();
		this.findDependencies(module, data, result);
		result.remove(data);
		return result;
	}
	
	public String getFieldName(NgcsData data, NgcsAggregation aggregation) {
		if(data.getName().equals(aggregation.getRefTo().getName())) {
			return aggregation.getName().substring(0, aggregation.getName().length() - 1);
		} else {
			return aggregation.getRefTo().getName();
		}
	}
}
