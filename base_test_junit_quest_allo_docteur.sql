/* Base de données: base_quest_allo_docteur */

SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS Utilisateur;
DROP TABLE IF EXISTS Adresse;

CREATE TABLE Utilisateur (
	idUtilisateur INTEGER PRIMARY KEY AUTO_INCREMENT,
	civilite VARCHAR(100),
	prenom VARCHAR(100),
	nom VARCHAR(100),
	identifiant VARCHAR(100),
	motPasse VARCHAR(100),
	numeroTelephone VARCHAR(100),
	dateNaissance TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	dateCreation TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	dateModification TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	actif TINYINT(1) DEFAULT 1,
	marquerEffacer  TINYINT(1) DEFAULT 0,
	version INTEGER DEFAULT 1
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
 
 CREATE TABLE Adresse (
	idAdresse INTEGER PRIMARY KEY AUTO_INCREMENT,
	idUtilisateur INTEGER NOT NULL,
	rue VARCHAR(100),
	codePostal VARCHAR(100),
	ville VARCHAR(100),
	pays VARCHAR(100),
	principale TINYINT(1) DEFAULT 0,
	version INTEGER DEFAULT 1,
	CONSTRAINT `FK_Adresse_Utilisateur` FOREIGN KEY (idUtilisateur) referenceS Utilisateur (idUtilisateur) ON DELETE CASCADE
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
 
 
INSERT INTO Utilisateur(civilite,prenom,nom,identifiant,motPasse,numeroTelephone) VALUES ('Mr','Jerome','Cantin','admin@gmail.com','passw0rd','0655554896');
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'5 rue du Paradis', '75000','Paris','France',1);
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'60 rue des faveurs', '44000','Nantes','France',0);
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'66 rue des deportés', '35000','Rennes','France',0);
 

 
INSERT INTO Utilisateur(civilite,prenom,nom,identifiant,motPasse,numeroTelephone) VALUES ('Mr','Nicolas','Petit','nicolas.petit@gmail.com','passw0rd','0666554896');
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'9 rue de la liberté', '75000','Paris','France',1);
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'55 rue de la mer', '87000','Limoges','France',0);
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'44 rue du Paradis ', '76000','Rouen','France',0);
 
 

INSERT INTO Utilisateur(civilite,prenom,nom,identifiant,motPasse,numeroTelephone) VALUES ('Mr','Jerome','Marchand','jerome@gmail.com','passw0rd','0688854896');
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'5 rue de maupassant', '75000','Paris','France',1);
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'33 rue des fauves', '76000','Rouen','France',0);
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'66 rue des Saint', '35000','Rennes','France',0);



INSERT INTO Utilisateur(civilite,prenom,nom,identifiant,motPasse,numeroTelephone) VALUES ('Mr','Jules','Petit','jules.petit@gmail.com','passw0rd','0671234896');
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'15 rue des heureux', '35000','Rennes','France',1);
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'66 rue des ingenieurs', '69000','Lyon','France',0);
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'7 rue des peurs', '35000','Rennes','France',0);



INSERT INTO Utilisateur(civilite,prenom,nom,identifiant,motPasse,numeroTelephone) VALUES ('Mr','Vincent','Ducan','vincent.ducamp@gmail.com','passw0rd','0600554896');
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'6 rue de la pudeur', '44000','Nantes','France',1);
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'77 rue de la paix', '35000','Rennes','France',0);



INSERT INTO Utilisateur(civilite,prenom,nom,identifiant,motPasse,numeroTelephone) VALUES ('Mme','Claire','Dupond','claire.dupond@gmail.com','passw0rd','0665554896');
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'7 rue des peurs', '75000','Paris','France',1);
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'50 rue de Maupassant ', '76000','Rouen','France',0);


INSERT INTO Utilisateur(civilite,prenom,nom,identifiant,motPasse,numeroTelephone) VALUES ('Mr','Jean','Luc','jean.luc@gmail.com','passw0rd','0630554896');
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'6 rue des passeurs', '35000','Rennes','France',1);
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'55 rue de la mer', '87000','Limoges','France',0);



INSERT INTO Utilisateur(civilite,prenom,nom,identifiant,motPasse,numeroTelephone) VALUES ('Mr','Malick','Ba','malick.ba@gmail.com','passw0rd','0684554896');
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'44 rue du passager', '69000','Lyon','France',1);
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'9 rue de la liberté', '44000','Nantes','France',0);
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'10 rue de Saint Sens','72000','Le Mans','France',0);


INSERT INTO Utilisateur(civilite,prenom,nom,identifiant,motPasse,numeroTelephone) VALUES ('Mr','Jerome','Ducan','jerome.ducamp@gmail.com','passw0rd','0677554800');
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'6 rue de la pudeur', '44000','Nantes','France',1);
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'77 rue de la paix', '35000','Rennes','France',0);


INSERT INTO Utilisateur(civilite,prenom,nom,identifiant,motPasse,numeroTelephone) VALUES ('Mr','Christophe','Petit','christophe.petit@gmail.com','passw0rd','0677554896');
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'5 rue des Saints', '44000','Nantes','France',1);
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'55 rue des courageux', '35000','Rennes','France',0);


INSERT INTO Utilisateur(civilite,prenom,nom,identifiant,motPasse,numeroTelephone) VALUES ('Mme','Claire','Cahuzac','claire.cahuzac@gmail.com','passw0rd','0677554896');
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'13 rue des peurs', '76000','Rouen','France',1);
INSERT INTO Adresse(idUtilisateur,rue,codePostal,ville,pays,principale) VALUES ((SELECT MAX(idUtilisateur) FROM Utilisateur),'88 rue de Maupassant ', '76000','Rouen','France',0);
