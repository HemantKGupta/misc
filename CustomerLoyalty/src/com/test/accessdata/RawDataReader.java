package com.test.accessdata;

import java.util.List;

import com.test.Model.Purchase;

/**
 * @author HemantG
 *
 */
public interface RawDataReader {
	public List<Purchase> getPurchaseData();
}
