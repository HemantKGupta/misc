package com.test.business;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.test.Model.Customer;
import com.test.Model.Purchase;
import com.test.util.LoyaltyClass;

/**
 * @author HemantG
 * 
 */
public class BusinessManagerImpl implements BusinessManager {

	@Override
	public Map<Integer, Customer> processInput(List<Purchase> purchaseList) {

		Map<Integer, Customer> customerMap = new HashMap<Integer, Customer>();

		for (Iterator<Purchase> iterator = purchaseList.iterator(); iterator
				.hasNext();) {
			Purchase purchase = (Purchase) iterator.next();

			if (purchase.getLoyalityCardNo() != 0) {

				// For new Enrollment
				if (!customerMap.containsKey(purchase.getLoyalityCardNo())) {
					Customer newCustomer = new Customer();
					newCustomer.setName(purchase.getName());
					newCustomer.setEmail(purchase.getEmail());
					newCustomer.setLoyalityCardNo(purchase.getLoyalityCardNo());
					newCustomer.setCurrentYearLoyalityPoints(100);
					newCustomer.setLoyalityClass(LoyaltyClass.NORMAL);
					int pointsToAdd = 0;
					if (purchase.getPurchaseDate().getYear() == Calendar
							.getInstance().getTime().getYear()) {
						pointsToAdd = purchase.getPurchaseAmount() / 100;
						newCustomer.addPointsAndUpdateClass(pointsToAdd);
					}

					newCustomer.getTransactionToPointsMap().put(
							purchase.getTransactionId(), pointsToAdd);

					customerMap.put(purchase.getLoyalityCardNo(), newCustomer);

				} else if (customerMap
						.containsKey(purchase.getLoyalityCardNo())) {
					Customer oldCustomer = customerMap.get(purchase
							.getLoyalityCardNo());
					int pointsToAdd = 0;
					if (purchase.getPurchaseDate().getYear() == Calendar
							.getInstance().getTime().getYear()) {
						LoyaltyClass loyalityClass = oldCustomer
								.getLoyalityClass();
						if (loyalityClass.equals(LoyaltyClass.NORMAL)) {
							pointsToAdd = purchase.getPurchaseAmount() / 100;

						} else if (loyalityClass.equals(LoyaltyClass.SILVER)) {
							pointsToAdd = purchase.getPurchaseAmount() / 50;

						} else if (loyalityClass.equals(LoyaltyClass.GOLD)) {
							pointsToAdd = purchase.getPurchaseAmount() / 20;
						}
						oldCustomer.addPointsAndUpdateClass(pointsToAdd);
					}
					oldCustomer.getTransactionToPointsMap().put(
							purchase.getTransactionId(), pointsToAdd);
					String newName = purchase.getName();
					if (newName != null
							&& !oldCustomer.getName().equals(newName)) {
						oldCustomer.setName(newName);
					}
					String newEmail = purchase.getEmail();
					if (newEmail != null
							&& !oldCustomer.getEmail().equals(newEmail)) {
						oldCustomer.setEmail(newEmail);
					}
					customerMap.put(purchase.getLoyalityCardNo(), oldCustomer);
				}
			}

		}
		return customerMap;
	}

}
