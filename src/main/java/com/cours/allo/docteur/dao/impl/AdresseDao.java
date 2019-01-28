/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.allo.docteur.dao.impl;

import com.cours.allo.docteur.dao.IAdresseDao;
import com.cours.allo.docteur.dao.entities.Adresse;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ElHadji
 */
@Transactional
public class AdresseDao extends AbstractDao<Adresse> implements IAdresseDao {

    private static final Log log = LogFactory.getLog(AdresseDao.class);
    private final static String className = AdresseDao.class.getSimpleName();

    private AdresseDao() {
        super(Adresse.class);
        log.debug("--> ************ Initialisation de " + className + " ************");
    }

      @Override
    public List<Adresse> findAllAdresses() {
    	  return em.createNamedQuery("find.AllAdresses").getResultList();
    	  
    }

    @Override
    public Adresse findAdresseById(int idAdresse) {
        return null;
    }

    @Override
    public List<Adresse> findAdressesByVille(String ville) {
        return null;
    }

    @Override
    public List<Adresse> findAdressesByCodePostal(String codePostal) {
        return null;
    }

    @Override
    public Adresse createAdresse(Adresse adresse) {
        if(adresse !=null) {
        	try {
        		em.persist(adresse);
        	}catch(Exception e) {
        		System.out.println("Impossible de créer cette adresse");
        	}
        }
        
        return adresse;
    }

    @Override
    public Adresse updateAdresse(Adresse adresse) {
        return null;
    }

    @Override
    public boolean deleteAdresse(Adresse adresse) {
        return false;
    }
}
