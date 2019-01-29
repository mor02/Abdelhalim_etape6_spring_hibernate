/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.allo.docteur.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cours.allo.docteur.dao.IUtilisateurDao;
import com.cours.allo.docteur.dao.entities.Utilisateur;

/**
 *
 * @author ElHadji
 */
@Transactional
@Repository
public class UtilisateurDao extends AbstractDao<Utilisateur> implements IUtilisateurDao {

    private static final Log log = LogFactory.getLog(UtilisateurDao.class);

    private final static String className = AdresseDao.class.getSimpleName();

    private UtilisateurDao() {
        super(Utilisateur.class);
        log.debug("--> ************ Initialisation de " + className + " ************");
    }

    @Override
    public List<Utilisateur> findAllUtilisateurs() {
        List<Utilisateur> listeUsers;
        
        listeUsers = em.createNamedQuery("Utilisateur.findAll").getResultList();
        
        return listeUsers;
    }

    @Override
    public Utilisateur findUtilisateurById(int idUtilisateur) {
        return null;
    }

    @Override
    public List<Utilisateur> findUtilisateurByIdentifiant(String identifiant) {
        return null;
    }

    @Override
    public List<Utilisateur> findUtilisateursByPrenom(String prenom) {
        return null;
    }

    @Override
    public List<Utilisateur> findUtilisateursByNom(String nom) {
        return null;
    }

    @Override
    public List<Utilisateur> findUtilisateursByCodePostal(String codePostal) {
        return null;
    }

    @Override
    public Utilisateur createUtilisateur(Utilisateur user) {
        em.persist(user);
    	return user;
    }

    @Override
    public Utilisateur updateUtilisateur(Utilisateur user) {
        return em.merge(user);
    }

    @Override
    public boolean deleteUtilisateur(Utilisateur user) {
    	Integer idUser = user.getIdUtilisateur();
    	Utilisateur userBdd = em.find(Utilisateur.class,idUser);
    	em.remove(userBdd);
    	return true;
    }
}
