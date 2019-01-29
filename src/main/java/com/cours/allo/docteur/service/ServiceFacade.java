/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.allo.docteur.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cours.allo.docteur.dao.IAdresseDao;
import com.cours.allo.docteur.dao.IUtilisateurDao;

/**
 *
 * @author ElHadji
 */
public class ServiceFacade implements IServiceFacade {

    private static final Log log = LogFactory.getLog(ServiceFacade.class);
    // On liste toutes les DAO : un DAO pour chaque entité (Utilisateur,Adresse ect ....)
    @Autowired
    @Qualifier("utilisateurDao")
    private IUtilisateurDao utilisateurDao;

    private IAdresseDao adresseDao = null;

    @Override
    public IUtilisateurDao getUtilisateurDao() {
        return utilisateurDao;
    }

    @Override
    public IAdresseDao getAdresseDao() {
        return adresseDao;
    }

	public ServiceFacade(IUtilisateurDao utilisateurDao, IAdresseDao adresseDao) {
		super();
		this.utilisateurDao = utilisateurDao;
		this.adresseDao = adresseDao;
	}
	public ServiceFacade() {
		super();
	}
    
    
}
