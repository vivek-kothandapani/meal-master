----------------------------------------------------
--- SECURE PROFILE -------------------------------------------
----------------------------------------------------

DROP SCHEMA IF EXISTS secure_profile;
CREATE SCHEMA secure_profile;

USE  secure_profile;

DROP TABLE IF EXISTS user;
CREATE TABLE user
(
 id int UNSIGNED NOT NULL AUTO_INCREMENT,
 preference_id int UNSIGNED,
 username varchar(50) NOT NULL,
 firstname varchar(100),
 lastname varchar(100),
 email varchar(255),
 phone varchar(20),
 PRIMARY KEY (id)
);

DROP TABLE IF EXISTS preference;
CREATE TABLE preference
(
 id int UNSIGNED NOT NULL AUTO_INCREMENT,
 user_id int UNSIGNED NOT NULL,
 country int,
 PRIMARY KEY (id)
);

----------------------------------------------------
--- FOOD -------------------------------------------
----------------------------------------------------
DROP SCHEMA IF EXISTS food;
CREATE SCHEMA food;

USE food;

DROP TABLE IF EXISTS recipe;
CREATE TABLE recipe(
 id int UNSIGNED NOT NULL AUTO_INCREMENT,
 name varchar(50) NOT NULL,
 type int,
 category int,
 country int,
 PRIMARY KEY (id)
);

DROP TABLE IF EXISTS ingredient;
CREATE TABLE ingredient(
 id int UNSIGNED NOT NULL AUTO_INCREMENT,
 name varchar(50) NOT NULL,
 type int,
 category int,
 country int,
 PRIMARY KEY (id)
);

DROP TABLE IF EXISTS recipe_ingredient;
CREATE TABLE recipe_ingredient(
 recipe_id int UNSIGNED NOT NULL,
 ingredient_id int UNSIGNED,
 quantity int
);

DROP TABLE IF EXISTS nutrient;
CREATE TABLE nutrient(
 id int UNSIGNED NOT NULL AUTO_INCREMENT,
 name varchar(50) NOT NULL,
 type int,
 category int,
 PRIMARY KEY (id)
);

CREATE TABLE ingredient_nutrient(
 ingredient_id int UNSIGNED NOT NULL,
 nutrient_id int UNSIGNED,
 quantity int
);


