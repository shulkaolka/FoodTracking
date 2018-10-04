DROP TABLE IF EXISTS usersdb.users;
CREATE DATABASE  IF NOT EXISTS usersdb;

use usersdb;

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `role` varchar(45) NOT NULL,
  PRIMARY KEY (`user_id`)
);

INSERT INTO users (username, password, role) values ("admin","admin","admin");
INSERT INTO users (username, password, role) values ("user1","user1", "user");
INSERT INTO users (username, password, role) values ("user2","user2", "user");
INSERT INTO users (username, password, role) values ("user3","user3", "user");