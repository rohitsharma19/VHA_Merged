package com.tcs.VHAMW.service;

import java.io.Closeable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;

import com.tcs.VHAMW.database.Database;
import com.tcs.VHAMW.model.Quote;
import org.apache.log4j.Logger;
public class QuoteService implements Closeable {
	private static Logger log = Logger.getLogger(QuoteService.class);
	public QuoteService(){
		
		//Database.qhmap.put("1", new Quote(new Date(), "",new Date(), "", 0, "", "", "", "", "", "", "", "", 0, "", "", 0, 0, 0, 0, "", "", "", "", ""));
	
	}
	public boolean deleteQuote(String quoteId) {
		boolean flag=false;
		log.debug("Entering delete Quote of service with input parameter quoten id "+quoteId);

		if (quoteId != null) {
			if(Database.qhmap.containsKey(quoteId)){
				Database.qhmap.remove(quoteId.trim());
				flag=true;
			}
			
		}
		else{
			log.error("Quote id value is null");
		}
		log.debug("returning flag value as boolean from service "+flag);
		return flag;
		
	}

	public Quote updateQuote(Quote quote) {
		Quote tmpQuote = null;
		log.debug("Entering update Quote of service with input parameter quote "+quote);
		if (quote != null) {
			
			if(Database.qhmap.containsKey(quote.getQuoteId())){
				quote.setModificationDate(new Date());
				Database.qhmap.put(quote.getQuoteId(), quote);
				tmpQuote = quote;
			}else return null;
		}
		else{
			log.error("Quote value is null");
		}
		log.debug("returning Quote value from service "+tmpQuote);
		return tmpQuote;
		
	}

	public Quote addQuote(Quote quote) {
		Quote tempQuot = null;
		log.debug("Entering add Quote of service with input parameter quote "+quote);
		if (quote != null) {	
			SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmssSSS");
			String timeStamp = dateFormat.format(new Date());
			quote.setQuoteId(("Q"+timeStamp));
			quote.setCreationDate(new Date());
			Database.qhmap.put("Q"+timeStamp, quote);
			tempQuot = quote;
		}
		else{
			log.error("Quote value is null");
		}
		log.debug("returning Quote value from service "+tempQuot);
		return tempQuot;
		
	}

	public ArrayList<Quote> getAllQuote() {
		log.debug("Entering get all Quote of service");
		ArrayList<Quote> allQuote = new ArrayList<Quote>();
		HashMap<String, Quote> hm = Database.qhmap;
		for (Entry<String, Quote> entry : hm.entrySet()) {
			allQuote.add(entry.getValue());
		}
		log.debug("returning all Quote from service "+allQuote);
		return allQuote;
	
	}

	public Quote getQuote(String quoteId) {
		log.debug("Entering get one Quote of service with input parameter quote id "+quoteId);
		Quote quote = null;
		if (quoteId != null) {
			quote = Database.qhmap.get(quoteId);
		}
		log.debug("returning Quote value from service "+quote);
		return quote;

		
	}
	public void close() {
		// TODO Auto-generated method stub
		
	}

	
}
