CREATE DATABASE jpa;

USE jpa;

SHOW TABLES;

CREATE TABLE user (
	id INT AUTO_INCREMENT PRIMARY key,
    first_name VARCHAR(32),
    last_name VARCHAR(32),
    email VARCHAR(64),
	age INT
);  
DROP TABLE user;

INSERT INTO user (first_name, last_name, email, age) VALUES
	("Java","Jakarta","java@jarakta.com",26),
	("Php","Laravel","php@laravel.com",8),
	("JS","Express","js@express.com",12),
	("Python","Django","python@django.com",10);

SELECT * FROM user;

-- Product avec relation One To One
CREATE TABLE product (
	id INT AUTO_INCREMENT PRIMARY key,
    name VARCHAR(32),
    price VARCHAR(32),
    id_product_details INT UNIQUE NOT NULL REFERENCES product_details(id)
);  
INSERT INTO product (name, price, id_product_details) VALUES
	("Phone",180,1),
	("Kart",250,2),
	("Stylo",2,3);
	
CREATE TABLE product_details (
	id INT AUTO_INCREMENT PRIMARY key,
    description VARCHAR(255),
    fournisseur VARCHAR(255),
    stock INT
); 
INSERT INTO product_details (description, fournisseur, stock) VALUES
	("REDME note 8","READ ME",18),
	("180cc","MARIO",150),
	("4 couleurs","BIC",4000);
    
SELECT * FROM product;
SELECT * FROM product_details;





CREATE DATABASE CoursJpa;
USE CoursJpa;
SHOW TABLES;

CREATE TABLE users (
	id SERIAL PRIMARY KEY,
    first_name VARCHAR(32),
    last_name VARCHAR(32),
    email VARCHAR(64),
	age INT
); 

INSERT INTO users (first_name, last_name, email, age) VALUES
	("Java","Jakarta","java@jarakta.com",26),
	("Php","Laravel","php@laravel.com",8),
	("JS","Express","js@express.com",12),
	("Python","Django","python@django.com",10); 
    
DROP TABLE users;
SELECT * FROM users;


CREATE TABLE photo (
	id INT AUTO_INCREMENT PRIMARY KEY,
    url VARCHAR(255),
	localisation VARCHAR(255),
	nom VARCHAR(255)
);
SELECT * FROM photo;



-- Product avec relation One To One
CREATE TABLE account (
	id INT AUTO_INCREMENT PRIMARY key,
    first_name VARCHAR(32),
    last_name VARCHAR(32),
    date_create DATE,
    nombre_amis INT,
    nombre_message INT,
    
    id_credential INT UNIQUE NOT NULL REFERENCES credentials(id)
);  

CREATE TABLE credentials (
	id INT AUTO_INCREMENT PRIMARY key,
    login VARCHAR(255),
    password VARCHAR(255)
); 


/****
RELATION MANY TO ONE & ONE TO MANY
*/


-- Attribut inverse
CREATE TABLE commande(
	id 				INT 		AUTO_INCREMENT PRIMARY KEY,
    description 	VARCHAR(255), 
    id_user 		INT			REFERENCES users(id)
);
INSERT INTO commande (description, id_user)  VALUES 
	('Telephone et Tableau', 1),
	('Stylo et Cahier', 1),
	('Toto et Tata', 2),
	('Titi et Tutu', 2),
	('Lala et Lolo', 2),
	('Truc et Bidule', 3);

-- Table association
DROP TABLE message;
CREATE TABLE message(
	id 				INT 		AUTO_INCREMENT PRIMARY KEY,
	destinataire	VARCHAR(255),
	message 	VARCHAR(255) 
);
INSERT INTO message(destinataire, message) VALUES
	("java@jarakta.com", "Saude"),
	("java@jarakta.com", "Nasdrovia"),
	("php@laravel.com", "Sante"),
	("php@laravel.com", "Cheers"),
	("js@express.com", "Yermat");
    
DROP TABLE message_user_association;
CREATE TABLE message_user_association(
	    id_message  int   	NOT NULL UNIQUE REFERENCES message(id),
		id_user    	int   	NOT NULL REFERENCES users(id)
);
INSERT INTO message_user_association(id_message, id_user) VALUES
	(1,1),(2,2),(3,1);

/**
RELATION MANY TO MANY
*/
DROP TABLE skill;
CREATE TABLE skill(
	id 				INT 		AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255)
);
INSERT INTO skill(name) VALUES ('java'),('jee'),('spring'),('lua'),('python');

DROP TABLE skill_user_association;
CREATE TABLE skill_user_association(
		id_user    	int   	NOT NULL REFERENCES users(id),
	    id_skill	int   	NOT NULL REFERENCES skill(id)
); 
INSERT INTO skill_user_association(id_user, id_skill) VALUES (1,1),(1,4),(2,1),(2,2),(2,3),(3,3);

SHOW TABLES;
SELECT * FROM product;
SELECT * FROM product_details;
SELECT * FROM users;
SELECT * FROM commande;
SELECT * FROM message;
SELECT * FROM message_user_association;
SELECT * FROM skill;
SELECT * FROM skill_user_association;