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

import com.tcs.VHAMW.model.Opportunity;
import com.tcs.VHAMW.service.OpportunityService;

@Path("/Opportunity")
public class OpportunityResource {
	private static Logger log = Logger.getLogger(OpportunityResource.class);
	OpportunityService opportunityService = new OpportunityService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Opportunity> getAllOpportunities() {
		log.debug("Entering get all opportunity of resource ");
		log.debug("returning all opportunity list from resource " + opportunityService.getAllOpportunities());

		return opportunityService.getAllOpportunities();
	}

	@GET
	@Path("/{opportunityKey}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Opportunity getOpportunity(@PathParam("opportunityKey") String opportunityId) {
		log.debug("Entering get one opportunity of resource with input parameter opportunity id " + opportunityId);
		if (opportunityId == "" || opportunityId == null) {
			log.error("opportunity id is null");
		}
		Opportunity readOpportunity=opportunityService.getOpportunity(opportunityId);
		log.debug("returning Opportunity value from resource " + readOpportunity);
		return readOpportunity;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Opportunity addOpportunity(Opportunity opportunity) {
		log.debug("Entering add opportunity of resource with input parameter opportunity " + opportunity);
		if (opportunity == null) {
			log.error("opportunity is null");
		}
		Opportunity createdOpportunity=opportunityService.addOpportunity(opportunity);
		log.debug("returning Opportunity value from resource " + createdOpportunity);

		return createdOpportunity;
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Opportunity updateOpportunity(Opportunity opportunity) {
		log.debug("Entering update opportunity of resource with input parameter opportunity " + opportunity);
		if (opportunity == null) {
			log.error("opportunity is null");
		}
		Opportunity updatedOpportunity=opportunityService.updateOpportunity(opportunity);
		log.debug("returning Opportunity value from resource " + updatedOpportunity);
		return updatedOpportunity ;
	}

	@DELETE
	@Path("/{opportunityKey}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean deleteOpportunity(@PathParam("opportunityKey") String opportunityKey) {
		log.debug("Entering delete opportunity of resource with input parameter opportunity id " + opportunityKey);
		if (opportunityKey == "" || opportunityKey == null) {
			log.error("opportunity id is null");
		}
		boolean deletionStatus=opportunityService.deleteOpportunity(opportunityKey);
		log.debug(
				"returning flag value as boolean from service " + deletionStatus);
		return deletionStatus;
	}
}
