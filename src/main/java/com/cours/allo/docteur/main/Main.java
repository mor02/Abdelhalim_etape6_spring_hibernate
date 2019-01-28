/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.allo.docteur.main;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cours.allo.docteur.dao.IUtilisateurDao;
import com.cours.allo.docteur.dao.entities.Utilisateur;
import com.cours.allo.docteur.dao.impl.UtilisateurDao;
import com.cours.allo.docteur.service.IServiceFacade;
import com.cours.allo.docteur.service.ServiceFacade;

/**
 *
 * @author elhad
 */
public class Main {

    private static final Log log = LogFactory.getLog(Main.class);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/resources/applicationContext.xml");
        
//        IServiceFacade serviceFacade;//TODO vérifier avec Abelhalim l'implémentatin de la facade de l'étape précedente
        IUtilisateurDao userDAO =  (IUtilisateurDao) ctx.getBean("utilisateurDao");
//        
        Utilisateur newUser = new Utilisateur("Mr", "Mohamed2", "Salah2", "amghar.amine0@gmail.com", "1111", new Date());
        //userDAO.createUtilisateur(newUser);
        //userDAO.deleteUtilisateur(newUser);
        
        List<Utilisateur> listUsers = userDAO.findAllUtilisateurs();
        
        for(Utilisateur u : listUsers) {
        	System.out.println( "idUtilisateur : " + u.getIdUtilisateur() + "nom : " + u.getNom());
        }
        
        Utilisateur userToDelete = listUsers.get(1);
        userDAO.deleteUtilisateur(userToDelete);
       
        
      
        
    }
}
