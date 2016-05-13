package com.tcs.VHAMW.database;

import java.util.HashMap;


import com.tcs.VHAMW.model.Agreement;
import com.tcs.VHAMW.model.Lead;
import com.tcs.VHAMW.model.Opportunity;
import com.tcs.VHAMW.model.Quote;
import com.tcs.VHAMW.model.User;
public class Database {
	public static HashMap<String, Lead> lhmap = new HashMap<String, Lead>();
	public static HashMap<String,Opportunity> opHmap=new HashMap<String,Opportunity>();
	public static HashMap<String, Quote> qhmap = new HashMap<String, Quote>();
	public static HashMap<String, Agreement> aghmap = new HashMap<String, Agreement>();
	public static HashMap<String, User> uhmap = new HashMap<String, User>();
	
}
