/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.allo.docteur.dao;

import javax.sql.DataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author elhad
 */
public class DataSourceSingleton {

    private static final Log log = LogFactory.getLog(DataSourceSingleton.class);
    public final static String className = DataSourceSingleton.class.getName();
    // Objet DataSource
    private DataSource dataSource = null;

    /**
     * Constructeur privé
     */
    private DataSourceSingleton() {
        log.debug("--> Nouvelle Instance de " + className);
    }

    public DataSource getDataSource() {
        return dataSource;
    }
}
