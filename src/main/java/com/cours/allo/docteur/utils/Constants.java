/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.allo.docteur.utils;

/**
 *
 * @author ElHadji
 */
public class Constants {

    // Url de connexion en base de donnée
    public static String DATABASE_URL = "jdbc:mysql://localhost:3306/base_quest_allo_docteur?useSSL=false&useUnicode=true&characterResultSets=utf8&characterEncoding=utf8";
    // Utilisateur de la base de données
    public static String DATABASE_USER = "application";
    // Mot de passe de la base de données
    public static String DATABASE_PASSWORD = "passw0rd";

    // Drivers Jdbc
    public static String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    // Cle Url base de donnees
    public static String DATABASE_URL_KEY = "DATABASE_URL_KEY";
    // Cle utilisateur
    public static String DATABASE_USER_KEY = "DATABASE_USER_KEY";
    // Cle mot passe
    public static String DATABASE_PASSWORD_KEY = "DATABASE_PASSWORD_KEY";

    // Drivers Jdbc key
    public static String JDBC_DRIVER_KEY = "JDBC_DRIVER_KEY";

    public static String SQL_JUNIT_PATH_FILE = "base_test_junit_quest_allo_docteur.sql";
    // Unite de persistance
    public static String PERSISTANCE_UNIT = "QuestAlloDocteurPU";
    // Code d'erreur pour un utilisateur déja existant.
    public static int EXCEPTION_CODE_USER_ALREADY_EXIST = -1;
}
