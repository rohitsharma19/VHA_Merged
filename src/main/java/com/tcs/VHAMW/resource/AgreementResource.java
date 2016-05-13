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

import com.tcs.VHAMW.model.Agreement;
import com.tcs.VHAMW.service.AgreementService;

@Path("/Agreement")
public class AgreementResource {
	private static Logger log = Logger.getLogger(AgreementResource.class);
	AgreementService agreementservice = new AgreementService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Agreement> getAllAgreement() {
		log.debug("Entering get all Agreement in resource class");
		log.debug("returning all Agreement value from resource" + agreementservice.getAllAgreement());
		return agreementservice.getAllAgreement();
	}

	@GET
	@Path("/{agreementId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Agreement readAgreement(@PathParam("agreementId") String agreementId) {
		log.debug("Entering get Agreement with input parameter agreement id in resource class" + agreementId);
		if (agreementId == "" || agreementId == null) {
			log.error("agreement id is null");
		}
		Agreement readAgreement=agreementservice.readAgreement(agreementId);
		log.debug("returning agreement value from resource " + readAgreement);
		return readAgreement;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Agreement createAgreement(Agreement agreement) {
		log.debug("Entering create Agreement of resource with input parameter agreement " + agreement);
		if (agreement == null) {
			log.error("agreement is null");
		}
		Agreement createdAgreement=agreementservice.createAgreement(agreement);
		log.debug("returning agreement value from resource " + createdAgreement);
		return createdAgreement;
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Agreement updateAgreement(Agreement agreement) {
		log.debug("Entering update Agreement of resource with input parameter agreement " + agreement);
		if (agreement == null) {
			log.error("agreement is null");
		}
		Agreement updatedAgreement=agreementservice.updateAgreement(agreement);
		log.debug("returning agreement value from resource " + updatedAgreement);
		return updatedAgreement;
	}

	@DELETE
	@Path("/{agreementId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean deleteLead(@PathParam("agreementId") String agreementId) {
		log.debug("Entering update Agreement of resource with input parameter agreement id " + agreementId);
		if (agreementId == "" || agreementId == null) {
			log.error("agreement id is null");
		}
		boolean deletionStatus=agreementservice.deleteAgreement(agreementId);
		log.debug("returning flag value as boolean from resource" + deletionStatus);

		return deletionStatus;
	}

}