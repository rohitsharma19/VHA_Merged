package com.tcs.VHAMW.resource;

import java.util.List;

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

import com.tcs.VHAMW.model.Lead;
import com.tcs.VHAMW.service.LeadService;

@Path("/Lead")
public class LeadResource {
	private static Logger log = Logger.getLogger(LeadResource.class);

	LeadService leadservice = new LeadService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Lead> getAllLead() {
		log.debug("Entering get all Lead of resource");
		log.debug("returning lead value from resource " + leadservice.getAllLead());
		return leadservice.getAllLead();
	}

	@GET
	@Path("/{leadId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Lead readLead(@PathParam("leadId") String leadId) {
		log.debug("Entering read Lead of resource with input parameter lead id " + leadId);
		if (leadId == "" || leadId == null) {
			log.error("lead id is null");
		}
		Lead readLead=leadservice.readLead(leadId);
		log.debug("returning lead value from resource " + readLead);
		return readLead;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Lead createLead(Lead lead) {
		log.debug("Entering create Lead of resource with input parameter lead " + lead);
		if (lead == null) {
			log.error("lead is null");
		}
		Lead createdLead=leadservice.createLead(lead);
		log.debug("returning lead value from resource " +createdLead );
		return createdLead;
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Lead updateLead(Lead lead) {
		log.debug("Entering update Lead of resource with input parameter lead " + lead);
		if (lead == null) {
			log.error("lead is null");
		}
		Lead updatedLead=leadservice.updateLead(lead);
		log.debug("returning lead value from resource " +updatedLead );
		return updatedLead;
	}

	@DELETE
	@Path("/{leadId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean deleteLead(@PathParam("leadId") String leadId) {
		log.debug("Entering delete Lead of resource with input parameter lead id " + leadId);
		if (leadId == "" || leadId == null) {
			log.error("lead id is null");
		}
		boolean deleteStatus=leadservice.deleteLead(leadId);
		log.debug("returning flag value as boolean from resource " + deleteStatus);
		return deleteStatus;
	}

}
