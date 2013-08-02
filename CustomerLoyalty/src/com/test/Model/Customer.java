package com.test.Model;

import java.util.HashMap;
import java.util.Map;

import com.test.util.LoyaltyClass;

/**
 * @author HemantG
 *
 */
public class Customer {
	public Customer() {
		super();
		this.transactionToPointsMap = new HashMap<Integer, Integer>();
	}
	
	public Map<Integer, Integer> getTransactionToPointsMap() {
		return transactionToPointsMap;
	}

	private int loyalityCardNo;
	@Override
	public String toString() {
		return "Customer [loyalityCardNo=" + loyalityCardNo + ", name=" + name
				+ ", email=" + email + ", loyalityClass=" + loyalityClass
				+ ", currentYearLoyalityPoints=" + currentYearLoyalityPoints
				+ ", totalLoyalityPoints=" + totalLoyalityPoints
				+ ", transactionToPointsMap=" + transactionToPointsMap + "]";
	}
	private String name;
	private String email;
	private LoyaltyClass loyalityClass;
	private int currentYearLoyalityPoints;
	private int totalLoyalityPoints;
	private Map<Integer, Integer> transactionToPointsMap;
	
	public void addPointsAndUpdateClass(int toAdd){
		this.currentYearLoyalityPoints += toAdd;
		if (this.currentYearLoyalityPoints >= 500){
			this.loyalityClass = LoyaltyClass.GOLD;			
		}else if (this.currentYearLoyalityPoints >= 250){
			this.loyalityClass = LoyaltyClass.SILVER;	
		}else {
			this.loyalityClass = LoyaltyClass.NORMAL;	
		}
	}
	
	public void  addToCurrentYearLoyalityPoints(int toAdd){
		this.currentYearLoyalityPoints += toAdd;
	}
	
	public void addTransactionIdAndPoints(int transactionId, int points){
		this.transactionToPointsMap.put(transactionId, points);
	}
	
	public int getCurrentYearLoyalityPoints() {
		return currentYearLoyalityPoints;
	}
	public void setCurrentYearLoyalityPoints(int currentYearLoyalityPoints) {
		this.currentYearLoyalityPoints = currentYearLoyalityPoints;
	}
	public int getTotalLoyalityPoints() {
		return totalLoyalityPoints;
	}
	public void setTotalLoyalityPoints(int totalLoyalityPoints) {
		this.totalLoyalityPoints = totalLoyalityPoints;
	}
	public LoyaltyClass getLoyalityClass() {
		return loyalityClass;
	}
	public void setLoyalityClass(LoyaltyClass loyalityClass) {
		this.loyalityClass = loyalityClass;
	}
	public int getLoyalityCardNo() {
		return loyalityCardNo;
	}
	public void setLoyalityCardNo(int loyalityCardNo) {
		this.loyalityCardNo = loyalityCardNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + loyalityCardNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (loyalityCardNo != other.loyalityCardNo)
			return false;
		return true;
	}
	
	

}
