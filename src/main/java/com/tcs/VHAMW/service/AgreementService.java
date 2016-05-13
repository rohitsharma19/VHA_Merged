package com.tcs.VHAMW.service;

import java.io.Closeable;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import com.tcs.VHAMW.database.Database;
import com.tcs.VHAMW.model.Agreement;

public class AgreementService implements Closeable {
	private static Logger log = Logger.getLogger(AgreementService.class);

	// Creating Agreement

	
	 public AgreementService() {
	 
	 //Database.aghmap.put("1", new Agreement(null, null, null, null, null, 0, null, null, null, 0, 0, 0, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
	 
	 }
	
	public Agreement createAgreement(Agreement agreement) {
		Agreement ag = null;
		
		log.debug("Entering create Agreement of service with input parameter agreement "+agreement);
		if (agreement != null) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmssSSsS");
			String timeStamp = dateFormat.format(new Date());
			agreement.setCreationDate(new Date());
			agreement.setAgreementId("A" + timeStamp);
			Database.aghmap.put("A" + timeStamp, agreement);
			ag = agreement;
		}
		else
		{
			log.error("Agreement value is null");
		}
		log.debug("returning agreement value from service "+ag);
		return ag;
	}

	// Reading Agreement

	public Agreement readAgreement(String agreementId) {
		Agreement agreement = null;
		log.debug("Entering read Agreement of service with input parameter agreement id "+agreementId);
		if (agreementId != null) {
			agreement = Database.aghmap.get(agreementId);
		}
		else
		{
			log.error("Agreement id value is null");
		}
		log.debug("returning agreement value from service "+agreement);
		return agreement;

	}

	// Updating Agreement

	public Agreement updateAgreement(Agreement agreement) {
		Agreement tmpagreement = null;
		log.debug("Entering update Agreement of service with input parameter agreement "+agreement);
		if (agreement != null) {
			if(Database.aghmap.containsKey(agreement.getAgreementId())){
				agreement.setModificationDate(new Date());
				Database.aghmap.put(agreement.getAgreementId(), agreement);
				tmpagreement = agreement;
			}else return null;
		}
		else
		{
			log.error("Agreement value is null");
		}
		log.debug("returning agreement value from service "+tmpagreement);
		return tmpagreement;
	}

	// Deleting Agreement

	public boolean deleteAgreement(String agreementId) {
		boolean flag = false;
		log.debug("Entering update Agreement of service with input parameter agreement id "+agreementId);
		if (agreementId != null) {
			if(Database.aghmap.containsKey(agreementId)){
				Database.aghmap.remove(agreementId);
				flag = true;
			}	
		}
		else
		{
			log.error("Agreement Id value is null");
		}
		log.debug("returning flag value as boolean from service "+flag);
		return flag;
	}

	// Showing All Agreement

	public ArrayList<Agreement> getAllAgreement() {
		log.debug("Entering get all Agreement of service");

		ArrayList<Agreement> allList = new ArrayList<Agreement>();
		HashMap<String, Agreement> hm = Database.aghmap;
		for (Entry<String, Agreement> entry : hm.entrySet()) {
			allList.add(entry.getValue());
		}
		log.debug("returning all Agreement value from service "+allList);
		return allList;
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}
}
