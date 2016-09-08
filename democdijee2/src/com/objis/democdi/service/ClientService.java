package com.objis.democdi.service;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import com.objis.democdi.dao.IClientDao;
/**
 * Couche Service 
 * @author www.objis.com
 */
public class ClientService implements IClientService {

	@Inject
	IClientDao dao;  // Interface au lieu de classe : couplage faible.

	public String crerClient() {
		return "Service : " + dao.insertClient();
	}
	
	@PostConstruct
	public void logApresConstruction(){
		System.out.println("Après création Service");
	}
}