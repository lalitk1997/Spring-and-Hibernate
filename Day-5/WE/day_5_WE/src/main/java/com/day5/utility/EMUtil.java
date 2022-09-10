package com.day5.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {	
	private static EntityManagerFactory emf;
	static{
		emf=Persistence.createEntityManagerFactory("accountUnit");
	}
	public static EntityManager provideEntityManager(){	
		EntityManager em= emf.createEntityManager();
		return em;
	}
}
