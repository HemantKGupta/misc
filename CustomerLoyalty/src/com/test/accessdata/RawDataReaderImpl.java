package com.test.accessdata;

import java.util.ArrayList;
import java.util.List;

import com.test.Model.Purchase;
import com.test.util.CustomerLoyaltyUtility;

/**
 * @author HemantG
 *
 */
public class RawDataReaderImpl implements RawDataReader {

	@Override
	public List<Purchase> getPurchaseData() {
		Purchase p1 = new Purchase(
				"Abhay",
				"abhay@demo.com",
				11001,
				7402,
				CustomerLoyaltyUtility.convertStringToDate("22-06-2013 11:23"),
				2348723);
		Purchase p2 = new Purchase(
				5000,
				CustomerLoyaltyUtility.convertStringToDate("22-06-2013 13:48"),
				3830283);
		Purchase p3 = new Purchase(
				"Anant",
				"anant@example.com",
				11002,
				3839,
				CustomerLoyaltyUtility.convertStringToDate("22-06-2013 15:39"),
				2939303);
		Purchase p4 = new Purchase(
				"Ashish",
				"ashish@mettl.com",
				11003,
				15890,
				CustomerLoyaltyUtility.convertStringToDate("22-06-2013 17:15"),
				2828939);
		Purchase p5 = new Purchase(
				11001,
				12083,
				CustomerLoyaltyUtility.convertStringToDate("23-06-2013 11:38"),
				3839403);
		Purchase p6 = new Purchase(
				"Abhimanyu",
				"abhi@mettl.com",
				11004,
				33283,
				CustomerLoyaltyUtility.convertStringToDate("23-06-2013 14:18"),
				1384839);
		Purchase p7 = new Purchase(
				5984,
				CustomerLoyaltyUtility.convertStringToDate("23-06-2013 19:56"),
				8383939);
		Purchase p8 = new Purchase(
				11003,
				38103,
				CustomerLoyaltyUtility.convertStringToDate("24-06-2013 15:38"),
				9388383);
		Purchase p9 = new Purchase(
				"Anant",
				"anant@mettl.com",
				11002,
				7281,
				CustomerLoyaltyUtility.convertStringToDate("24-06-2013 19:18"),
				2938381);
		Purchase p10 = new Purchase(
				1038,
				CustomerLoyaltyUtility.convertStringToDate("24-06-2013 20:00"),
				8383383);
		Purchase p11 = new Purchase(
				"Abhijeet",
				"abhi@mettl.com",
				11005,
				17937,
				CustomerLoyaltyUtility.convertStringToDate("25-06-2013 18:83"),
				3833838);
		Purchase p12 = new Purchase(
				"Ashish",
				"ashish@mettl.com",
				11003,
				10890,
				CustomerLoyaltyUtility.convertStringToDate("29-06-2013 17:15"),
				2829939);

		List<Purchase> purchaseList = new ArrayList<Purchase>();
		purchaseList.add(p1);
		purchaseList.add(p2);
		purchaseList.add(p3);
		purchaseList.add(p4);
		purchaseList.add(p5);
		purchaseList.add(p6);
		purchaseList.add(p7);
		purchaseList.add(p8);
		purchaseList.add(p9);
		purchaseList.add(p10);
		purchaseList.add(p11);
		purchaseList.add(p12);

		return purchaseList;

	}

}
