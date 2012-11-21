package com.freedom.h2o.bean;

import java.io.Serializable;

import com.freedom.h2o.util.StringUtility;

public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1706014614581900479L;

	private Integer addressId;

	private String addressLine1;

	private String addressLine2;

	private String addressLine3;

	private String addressLine4;

	private String addressLine5;

	private String addressLine6;

	private String addressLine7;

	private String cityTown;

	private String sublocCode;

	private String iso2Code;
	
	private String postalCode;

	
	
	/**
	 * /* Method getter
	 * 
	 * @return addressId as Integer
	 */
	public Integer getAddressId() {
		return this.addressId;
	}

	/**
	 * /* Method Setter
	 * 
	 * @param newAddressId
	 *            as Integer
	 */
	public void setAddressId(Integer newAddressId) {
		this.addressId = newAddressId;
	}

	/**
	 * /* Method getter
	 * 
	 * @return addressLine1 as String
	 */
	public String getAddressLine1() {
		return this.addressLine1;
	}

	/**
	 * /* Method Setter
	 * 
	 * @param newAddressLine1
	 *            as String
	 */
	public void setAddressLine1(String newAddressLine1) {
		this.addressLine1 = newAddressLine1;
	}

	/**
	 * /* Method getter
	 * 
	 * @return addressLine2 as String
	 */
	public String getAddressLine2() {
		return this.addressLine2;
	}

	/**
	 * /* Method Setter
	 * 
	 * @param newAddressLine2
	 *            as String
	 */
	public void setAddressLine2(String newAddressLine2) {
		this.addressLine2 = newAddressLine2;
	}

	/**
	 * /* Method getter
	 * 
	 * @return addressLine3 as String
	 */
	public String getAddressLine3() {
		return this.addressLine3;
	}

	/**
	 * /* Method Setter
	 * 
	 * @param newAddressLine3
	 *            as String
	 */
	public void setAddressLine3(String newAddressLine3) {
		this.addressLine3 = newAddressLine3;
	}

	/**
	 * /* Method getter
	 * 
	 * @return addressLine4 as String
	 */
	public String getAddressLine4() {
		return this.addressLine4;
	}

	/**
	 * /* Method Setter
	 * 
	 * @param newAddressLine4
	 *            as String
	 */
	public void setAddressLine4(String newAddressLine4) {
		this.addressLine4 = newAddressLine4;
	}

	/**
	 * /* Method getter
	 * 
	 * @return addressLine5 as String
	 */
	public String getAddressLine5() {
		return this.addressLine5;
	}

	/**
	 * /* Method Setter
	 * 
	 * @param newAddressLine5
	 *            as String
	 */
	public void setAddressLine5(String newAddressLine5) {
		this.addressLine5 = newAddressLine5;
	}

	/**
	 * /* Method getter
	 * 
	 * @return addressLine6 as String
	 */
	public String getAddressLine6() {
		return this.addressLine6;
	}

	/**
	 * /* Method Setter
	 * 
	 * @param newAddressLine6
	 *            as String
	 */
	public void setAddressLine6(String newAddressLine6) {
		this.addressLine6 = newAddressLine6;
	}

	/**
	 * /* Method getter
	 * 
	 * @return addressLine7 as String
	 */
	public String getAddressLine7() {
		return this.addressLine7;
	}

	/**
	 * /* Method Setter
	 * 
	 * @param newAddressLine7
	 *            as String
	 */
	public void setAddressLine7(String newAddressLine7) {
		this.addressLine7 = newAddressLine7;
	}

	/**
	 * /* Method getter
	 * 
	 * @return cityTown as String
	 */
	public String getCityTown() {
		return this.cityTown;
	}

	/**
	 * /* Method Setter
	 * 
	 * @param newCityTown
	 *            as String
	 */
	public void setCityTown(String newCityTown) {
		this.cityTown = newCityTown;
	}

	/**
	 * /* Method getter
	 * 
	 * @return sublocCode as String
	 */
	public String getSublocCode() {
		return this.sublocCode;
	}

	/**
	 * /* Method Setter
	 * 
	 * @param newSublocCode
	 *            as String
	 */
	public void setSublocCode(String newSublocCode) {
		this.sublocCode = newSublocCode;
	}

	/**
	 * /* Method getter
	 * 
	 * @return iso2Code as String
	 */
	public String getIso2Code() {
		return this.iso2Code;
	}

	/**
	 * /* Method Setter
	 * 
	 * @param newIso2Code
	 *            as String
	 */
	public void setIso2Code(String newIso2Code) {
		this.iso2Code = newIso2Code;
	}

	/**
	 * /* Method getter
	 * 
	 * @return postalCode as String
	 */
	public String getPostalCode() {
		return this.postalCode;
	}

	/**
	 * /* Method Setter
	 * 
	 * @param newPostalCode
	 *            as String
	 */
	public void setPostalCode(String newPostalCode) {
		this.postalCode = newPostalCode;
	}

	public boolean equals(Address other) {
		if (!StringUtility.compareTo(addressLine1, other.addressLine1)) {
			return false;
		}

		if (!StringUtility.compareTo(addressLine2, other.addressLine2)) {
			return false;
		}

		if (!StringUtility.compareTo(addressLine3, other.addressLine3)) {
			return false;
		}

		if (!StringUtility.compareTo(addressLine4, other.addressLine4)) {
			return false;
		}

		if (!StringUtility.compareTo(addressLine5, other.addressLine5)) {
			return false;
		}

		if (!StringUtility.compareTo(cityTown, other.cityTown)) {
			return false;
		}

		if (!StringUtility.compareTo(sublocCode, other.sublocCode)) {
			return false;
		}

		if (!StringUtility.compareTo(iso2Code, other.iso2Code)) {
			return false;
		}

		if (!StringUtility.compareTo(postalCode, other.postalCode)) {
			return false;
		}

		return true;
	}

}
