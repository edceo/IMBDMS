CREATE TABLE users
(
    user_id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    genre VARCHAR(2) NOT NULL,
    age INT(11) NOT NULL,
    occupation VARCHAR(16) NOT NULL,
    zip_code VARCHAR(16) NOT NULL,
    password VARCHAR(8) NOT NULL
);