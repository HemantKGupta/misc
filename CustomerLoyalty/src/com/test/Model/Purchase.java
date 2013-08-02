package com.test.Model;

import java.util.Date;

/**
 * @author HemantG
 *
 */
public class Purchase {
	private String name;
	private String email;
	private int loyalityCardNo;
	private int purchaseAmount;
	public int getPurchaseAmount() {
		return purchaseAmount;
	}
	public Purchase(int loyalityCardNo, int purchaseAmount, Date purchaseDate,
			int transactionId) {
		super();
		this.loyalityCardNo = loyalityCardNo;
		this.purchaseAmount = purchaseAmount;
		this.purchaseDate = purchaseDate;
		this.transactionId = transactionId;
	}
	public Purchase(int purchaseAmount, Date purchaseDate, int transactionId) {
		super();
		this.purchaseAmount = purchaseAmount;
		this.purchaseDate = purchaseDate;
		this.transactionId = transactionId;
	}
	@Override
	public String toString() {
		return "Purchase [name=" + name + ", email=" + email
				+ ", loyalityCardNo=" + loyalityCardNo + ", purchaseAmount="
				+ purchaseAmount + ", purchaseDate=" + purchaseDate
				+ ", transactionId=" + transactionId + "]";
	}
	public Purchase(String name, String email, int loyalityCardNo,
			int purchaseAmount, Date purchaseDate, int transactionId) {
		super();
		this.name = name;
		this.email = email;
		this.loyalityCardNo = loyalityCardNo;
		this.purchaseAmount = purchaseAmount;
		this.purchaseDate = purchaseDate;
		this.transactionId = transactionId;
	}
	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}
	private Date purchaseDate;
	private int transactionId;
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
	public int getLoyalityCardNo() {
		return loyalityCardNo;
	}
	public void setLoyalityCardNo(int loyalityCardNo) {
		this.loyalityCardNo = loyalityCardNo;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

}
