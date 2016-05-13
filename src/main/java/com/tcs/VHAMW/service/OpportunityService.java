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
import com.tcs.VHAMW.model.Opportunity;

public class OpportunityService implements Closeable{
	private static Logger log = Logger.getLogger(OpportunityService.class);
	public OpportunityService(){
			/*	Database.opHmap.put("111", new Opportunity("","","","","","","",
				new Date(),new Date(),"","","","","",
				"","","","","","","",
				"","","","",9876543210L,new Date(),"",
				"","",new Date(),new Date(),"",""));*/
	}
	
	// add opportunity

	public Opportunity addOpportunity(Opportunity opportunity) {
		Opportunity op = null;
		log.debug("Entering add opportunity of service with input parameter opportunity "+opportunity);
		if (opportunity != null) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmssSSS");
			String string = dateFormat.format(new Date());
			String opportunityId = "O" + string;
			opportunity.setOpportunityId(opportunityId);
			opportunity.setOpportunityCreationDate(new Date());
			;
			Database.opHmap.put(opportunityId, opportunity);
			op = opportunity;
		}
		log.debug("returning Opportunity value from service "+op);
		return op;

	}

	// read opportunity

	public Opportunity getOpportunity(String opportunityId) {
		Opportunity opportunity = null;
		log.debug("Entering get one opportunity of service with input parameter opportunity id "+opportunityId);
		if (opportunityId != null) {
			opportunity = Database.opHmap.get(opportunityId);
		}
		log.debug("returning Opportunity value from service "+opportunity);
		return opportunity;
	}

	// update opportunity

	public Opportunity updateOpportunity(Opportunity opportunity) {
		Opportunity tempOpportunity = null;
		log.debug("Entering update opportunity of service with input parameter opportunity "+opportunity);
		if (opportunity != null) {
			
			if(Database.opHmap.containsKey(opportunity.getOpportunityId())){
				opportunity.setOpportunityLastUpdateDate(new Date());
				Database.opHmap.put(opportunity.getOpportunityId(), opportunity);
				tempOpportunity = opportunity;
			}else return null;
			
			
			
		}
		log.debug("returning Opportunity value from service "+tempOpportunity);
		return tempOpportunity;
	}

	// delete opportunity

	public boolean deleteOpportunity(String opportunityId) {
		boolean flag = false;
		log.debug("Entering delete opportunity of service with input parameter opportunity id "+opportunityId);
		if (opportunityId != null) {
			
			if(Database.opHmap.containsKey(opportunityId)){
				Database.opHmap.remove(opportunityId);
				flag = true;
			}
			
		}
		log.debug("returning flag value as boolean from service "+flag);
		return flag;
	}

	// get all opportunity

	public ArrayList<Opportunity> getAllOpportunities() {
		ArrayList<Opportunity> opList = new ArrayList<Opportunity>();
		log.debug("Entering get all opportunity of service");
		HashMap<String, Opportunity> hm = Database.opHmap;
		for (Entry<String, Opportunity> entry : hm.entrySet()) {
			opList.add(entry.getValue());
		}
		log.debug("returning all opportunity list from service "+opList);
		return opList;
	}

	public  void close()throws IOException {
		// TODO Auto-generated method stub
		
	}

}
