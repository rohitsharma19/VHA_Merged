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

import com.tcs.VHAMW.model.User;
import com.tcs.VHAMW.service.UserService;

@Path("/User")
public class UserResource {
	private static Logger log = Logger.getLogger(UserResource.class);
	UserService userService = new UserService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUser() {
		log.debug("Entering get all User in resource class");
		log.debug("returning all User value from resource" + userService.getAllUser());
		return userService.getAllUser();
	}

	@GET
	@Path("/{userId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public User readUser(@PathParam("userId") String userId) {
		log.debug("Entering get User with input parameter User id in resource class" + userId);
		if (userId == "" || userId == null) {
			log.error("User id is null");
		}
		User readUser=userService.readUser(userId);
		log.debug("returning User value from resource " +readUser );
		return readUser;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public User createUser(User user) {
		log.debug("Entering create User of resource with input parameter User " + user);
		if (user == null) {
			log.error("User is null");
		}
		User createdUser=userService.createUser(user);
		log.debug("returning User value from resource " +createdUser );
		return createdUser;
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public User updateUser(User user) {
		log.debug("Entering update User of resource with input parameter User " + user);
		if (user == null) {
			log.error("User is null");
		}
		User updatedUser=userService.updateUser(user);
		log.debug("returning User value from resource " + updatedUser);
		return updatedUser;
	}

	@DELETE
	@Path("/{UserId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean deleteLead(@PathParam("UserId") String userId) {
		log.debug("Entering update User of resource with input parameter User id " + userId);
		if (userId == "" || userId == null) {
			log.error("User id is null");
		}
		boolean deletionStatus=userService.deleteUser(userId);
		log.debug("returning flag value as boolean from resource" + deletionStatus);

		return deletionStatus ;
	}
}
