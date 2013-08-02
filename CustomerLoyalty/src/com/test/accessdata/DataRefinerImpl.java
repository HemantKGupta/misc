package com.test.accessdata;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.test.Model.Purchase;

/**
 * @author HemantG
 *
 */
public class DataRefinerImpl implements DataRefiner {

	@Override
	public Map<Integer, Purchase> createTrasactionIdPurcahseMap(
			List<Purchase> purchaseList) {
		Map<Integer, Purchase> transactionMap = new HashMap<Integer, Purchase>();
		for (Iterator<Purchase> iterator = purchaseList.iterator(); iterator
				.hasNext();) {
			Purchase purchase = (Purchase) iterator.next();
			transactionMap.put(purchase.getTransactionId(), purchase);
		}
		return transactionMap;
	}

	@Override
	public void sortPurchaseDataByPurchaseDate(List<Purchase> purchaseList) {

		Collections.sort(purchaseList, new Comparator<Purchase>() {

			public int compare(Purchase p1, Purchase p2) {
				return p1.getPurchaseDate().compareTo(p2.getPurchaseDate());
			}
		});

	}
}
