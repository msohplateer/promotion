package com.plateer.promotion.data;

public enum PromotionType {
	PRC_ADJ("AP"),
	PRD_CUP("PC"),
	DUP_CUP("DC"),
	BSK_CUP("BC");
	
	String prmType;
	
	PromotionType(String prmType){
		this.prmType = prmType;
	}
}
