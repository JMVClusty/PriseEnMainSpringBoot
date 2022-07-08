package com.ERP_Maison.Model.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class WrapperListBoolean {
	
	private Boolean isSelected;
	private List<Boolean> isSelectedList;
	
	public Boolean getIsSelected() {
		return isSelected;
	}
	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}
	public List<Boolean> getIsSelectedList() {
		return isSelectedList;
	}
	public void setIsSelectedList(List<Boolean> isSelectedList) {
		this.isSelectedList = isSelectedList;
	}
	public WrapperListBoolean(Boolean isSelected, List<Boolean> isSelectedList) {
		super();
		this.isSelected = isSelected;
		this.isSelectedList = isSelectedList;
	}
	public WrapperListBoolean(Boolean isSelected) {
		super();
		this.isSelected = isSelected;
	}
	public WrapperListBoolean(List<Boolean> isSelectedList) {
		super();
		this.isSelectedList = isSelectedList;
	}
	public WrapperListBoolean() {
		this.setIsSelected(false);
		this.setIsSelectedList(new ArrayList<Boolean>());
		Collections.fill(isSelectedList, false);
	}

	public WrapperListBoolean(int arraySize) {
		this.setIsSelected(false);
		this.setIsSelectedList(new ArrayList<Boolean>(arraySize));
		Collections.fill(isSelectedList, false);
	}
	
	
	
}
