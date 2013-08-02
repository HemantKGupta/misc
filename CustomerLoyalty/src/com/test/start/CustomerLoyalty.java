package com.test.start;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.test.Model.Customer;
import com.test.Model.Purchase;
import com.test.accessdata.DataRefiner;
import com.test.accessdata.DataRefinerImpl;
import com.test.accessdata.RawDataReader;
import com.test.accessdata.RawDataReaderImpl;
import com.test.business.BusinessManager;
import com.test.business.BusinessManagerImpl;
import com.test.business.ReportGenerator;
import com.test.business.ReportGeneratorImpl;

/**
 * @author HemantG
 *
 */
public class CustomerLoyalty {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RawDataReader rawDataReader =  new RawDataReaderImpl();
		
		List<Purchase> purchaseList = rawDataReader.getPurchaseData();
		
		DataRefiner dataRefiner =  new DataRefinerImpl();

		dataRefiner.sortPurchaseDataByPurchaseDate(purchaseList);
		
		Map <Integer, Purchase> transactionMap = dataRefiner.createTrasactionIdPurcahseMap(purchaseList);
		
		BusinessManager businessManager = new BusinessManagerImpl();
		
		Map<Integer, Customer> customers = businessManager.processInput(purchaseList);	
		
		ReportGenerator reportGenerator =  new ReportGeneratorImpl();
		
		reportGenerator.printCustomerData(customers, transactionMap);


	}
	

}
