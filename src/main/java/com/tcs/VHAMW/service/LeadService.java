package com.tcs.VHAMW.service;

import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import java.io.Closeable;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.tcs.VHAMW.database.Database;
import com.tcs.VHAMW.model.Lead;

public class LeadService implements Closeable {
	private static Logger log = Logger.getLogger(LeadService.class);
	// Creating Lead

	public LeadService() {

		// sDatabase.lhmap.put("1",new Lead(0, null, 0, null, null, 0, null,
		// null, null, null, 0, null, null, null, null, null, null, null, null,
		// null, null, null, null, null, null, null));
	}

	public Lead createLead(Lead lead) {
		Lead createdLead = null;
		log.debug("Entering create Lead of service with input parameter lead " + lead);
		if (lead != null) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmssSSS");
			String timeStamp = dateFormat.format(new Date());
			lead.setLeadId("L" + timeStamp);
			lead.setCreationDate(new Date());
			Database.lhmap.put("L" + timeStamp, lead);
			createdLead = lead;
		} else {
			log.error("Lead value is null");
		}
		log.debug("returning lead value from service " + createdLead);
		return createdLead;
	}

	// Reading Lead

	public Lead readLead(String leadId) {
		Lead lead = null;
		log.debug("Entering read Lead of service with input parameter lead id " + leadId);
		if (leadId != null) {
			lead = Database.lhmap.get(leadId);
		} else {
			log.error("Lead id value is null");
		}
		log.debug("returning lead value from service " + lead);
		return lead;

	}

	// Updating Lead

	public Lead updateLead(Lead lead) {
		Lead tmplead = null;
		log.debug("Entering update Lead of service with input parameter lead " + lead);
		if (lead != null) {

			if (Database.lhmap.containsKey(lead.getLeadId())) {
				lead.setModificationDate(new Date());
				Database.lhmap.put(lead.getLeadId(), lead);
				tmplead = lead;
			} else
				return null;
		} else {
			log.error("Lead value is null");
		}
		log.debug("returning lead value from service " + tmplead);
		return tmplead;
	}

	// Deleting Lead

	public boolean deleteLead(String leadId) {
		log.debug("Entering delete Lead of service with input parameter lead id " + leadId);
		boolean flag = false;
		System.out.println("inside delete ");
		if (leadId != null) {
			if (Database.lhmap.containsKey(leadId)) {
				Database.lhmap.remove(leadId);
				flag = true;
			}
		} else {
			log.error("Lead id value is null");
		}

		log.debug("returning flag value as boolean from service " + flag);
		System.out.println("retrun true" + flag);
		return flag;
	}

	// Showing All Leads

	public ArrayList<Lead> getAllLead() {
		log.debug("Entering get all Lead of service");
		ArrayList<Lead> allList = new ArrayList<Lead>();
		HashMap<String, Lead> hm = Database.lhmap;
		for (Entry<String, Lead> entry : hm.entrySet()) {
			allList.add(entry.getValue());
		}
		log.debug("returning all leads from service " + allList);
		return allList;
	}

	public void close() throws IOException {
		// TODO Auto-generated method stub

	}
}
