package com.tcs.VHAMW.resource;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.tcs.VHAMW.model.Quote;
import com.tcs.VHAMW.service.QuoteService;

@Path("/Quote")
public class QuoteResource {
	QuoteService quoteService = new QuoteService();
	private static Logger log = Logger.getLogger(QuoteResource.class);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Quote> getAllQuote() {
		log.debug("Entering get all Quote of resource");
		log.debug("returning all Quote from resource " + quoteService.getAllQuote());
		return quoteService.getAllQuote();
	}

	@GET
	@Path("/{quoteId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Quote getQuote(@PathParam("quoteId") String quoteId) {
		log.debug("Entering get one Quote of resource with input parameter quote id " + quoteId);
		if (quoteId == "" || quoteId == null) {
			log.error("quote id is null");
		}
		Quote readQuote=quoteService.getQuote(quoteId);
		log.debug("returning Quote value from resource " + readQuote);

		return readQuote;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Quote addQuote(Quote quote) {
		log.debug("Entering add Quote of resource with input parameter quote " + quote);
		if (quote == null) {
			log.error("quote is null");
		}
		Quote createdQuote=quoteService.addQuote(quote);
		
		log.debug("returning Quote value from resource " + createdQuote);

		return createdQuote;
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Quote updateQuote(Quote quote) {
		log.debug("Entering update Quote of resource with input parameter quote " + quote);
		if (quote == null) {
			log.error("quote is null");
		}
		Quote updatedQuote=quoteService.updateQuote(quote);
		log.debug("returning Quote value from resource " + updatedQuote);

		return updatedQuote;
	}

	@DELETE
	@Path("/{quoteId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean deleteQuote(@PathParam("quoteId") String quoteId) {
		log.debug("Entering delete Quote of resource with input parameter quoten id " + quoteId);
		if (quoteId == "" || quoteId == null) {
			log.error("quote id is null");
		}
		boolean deletionStatus =quoteService.deleteQuote(quoteId);
		log.debug("returning flag value as boolean from resource " +deletionStatus );

		return deletionStatus;
	}

}
