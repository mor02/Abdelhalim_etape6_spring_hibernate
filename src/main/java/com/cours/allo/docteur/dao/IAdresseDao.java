/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.allo.docteur.dao;

import com.cours.allo.docteur.dao.entities.Adresse;
import java.util.List;

/**
 *
 * @author ElHadji
 */
public interface IAdresseDao {

    public List<Adresse> findAllAdresses();

    public Adresse findAdresseById(int idAdresse);

    public List<Adresse> findAdressesByVille(String ville);

    public List<Adresse> findAdressesByCodePostal(String codePostal);

    public Adresse createAdresse(Adresse adresse);

    public Adresse updateAdresse(Adresse adresse);

    public boolean deleteAdresse(Adresse adresse);

}
