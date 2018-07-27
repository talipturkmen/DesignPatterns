package com.amadeus.training.patterns.creational.builder.models;

public class Campaign {

	public enum AdsType {
		A, B
	}

	private int brochuresCount;

	private AdsType adsType;

	public int getBrochuresCount() {
		return brochuresCount;
	}

	public void setBrochuresCount(int brochuresCount) {
		this.brochuresCount = brochuresCount;
	}

	public AdsType getAdsType() {
		return adsType;
	}

	public void setAdsType(AdsType adsType) {
		this.adsType = adsType;
	}

}
