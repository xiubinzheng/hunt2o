package com.freedom.h2o.bean;

import java.io.Serializable;
import java.util.Date;

public class Fountain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1706014614581900479L;

	private Integer fountainId;

	private Integer waterRating;

	private String Description;

	private byte[] fountainPicture;

	private Date createdDate;

	private Integer addressId;

	private String fountainName;

	public Fountain(Integer waterRating, String fountainName,
			String Description, Date createdDate) {

		 this.waterRating = waterRating; 
		 this.fountainName = fountainName;
		 this.Description = Description;
		 this.createdDate = createdDate;
	}
	
	public String getFountainName()
	{
		return fountainName;
	}

	public void setFountainName(String fountainName)
	{
		fountainName = this.fountainName;
	}
	
	public Integer getFountainId() {
		return fountainId;
	}

	public void setFountainId(Integer fountainId) {
		this.fountainId = fountainId;
	}

	public Integer getWaterRating() {
		return waterRating;
	}

	public void setWaterRating(Integer waterRating) {
		this.waterRating = waterRating;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public byte[] getFountainPicture() {
		return fountainPicture;
	}

	public void setFountainPicture(byte[] fountainPicture) {
		this.fountainPicture = fountainPicture;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the addressId
	 */
	public Integer getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId
	 *            the addressId to set
	 */
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

}
