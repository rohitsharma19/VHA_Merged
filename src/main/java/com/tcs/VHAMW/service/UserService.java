package com.tcs.VHAMW.service;

import java.io.Closeable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import com.tcs.VHAMW.database.Database;
import com.tcs.VHAMW.model.User;

public class UserService implements Closeable {
	private static Logger log = Logger.getLogger(UserService.class);
	public UserService()
	{
	//Database.uhmap.put("111",new User("111","","",""));
	}
	//creating user
	public User createUser(User user) {
		User u = null;
		log.debug("Entering create User of service with input parameter User "+user);
		if (user != null) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmssSSS");
			String timeStamp = dateFormat.format(new Date());
			user.setUserId("U" + timeStamp);
			Database.uhmap.put("U" + timeStamp, user);
			u=user;
		}
		else
		{
			log.error("User value is null");
		}
		log.debug("returning User value from service "+u);
		return u;
	}
	// Reading User

		public User readUser(String userId) {
			User user = null;
			log.debug("Entering read User of service with input parameter User id "+userId);
			if (userId != null) {
				user = Database.uhmap.get(userId);
			}
			else
			{
				log.error("User id value is null");
			}
			log.debug("returning User value from service "+user);
			return user;

		}
		// Updating user

		public User updateUser(User user) {
			
			User tmpUser = null;
			log.debug("Entering update user of service with input parameter user "+user);
			if (user != null) {
				if(Database.uhmap.containsKey(user.getUserId())){
					Database.uhmap.put(user.getUserId(), user);
					tmpUser = user;
				}else return null;
			}	
			else
			{
				log.error("user value is null");
			}
			log.debug("returning user value from service "+tmpUser);
			return tmpUser;
		}
		// Deleting user

		public boolean deleteUser(String userId) {
			boolean flag = false;
			log.debug("Entering update user of service with input parameter user id "+userId);
			if (userId != null) {
				
				if(Database.uhmap.containsKey(userId)){
					Database.uhmap.remove(userId);
					flag = true;
				}
				
			}
			else
			{
				log.error("user Id value is null");
			}
			log.debug("returning flag value as boolean from service "+flag);
			return flag;
		}

		// Showing All user

		public ArrayList<User> getAllUser() {
			log.debug("Entering get all user of service");

			ArrayList<User> allList = new ArrayList<User>();
			HashMap<String, User> hm = Database.uhmap;
			for (Entry<String, User> entry : hm.entrySet()) {
				allList.add(entry.getValue());
			}
			log.debug("returning all user value from service "+allList);
			return allList;
		}
		public void close() {
			// TODO Auto-generated method stub
			
		}
}
