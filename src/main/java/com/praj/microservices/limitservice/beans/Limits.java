package com.praj.microservices.limitservice.beans;

public class Limits {

	private Integer minimum;
	
	private Integer mximum;

	public Limits(Integer minimum, Integer mximum) {
		super();
		this.minimum = minimum;
		this.mximum = mximum;
	}

	public Integer getMinimum() {
		return minimum;
	}

	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}

	public Integer getMximum() {
		return mximum;
	}

	public void setMximum(Integer mximum) {
		this.mximum = mximum;
	}
}
