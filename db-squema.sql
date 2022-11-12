CREATE DATABASE school_management;
use school_management;

CREATE TABLE user_type (
	id INT (11) NOT NULL auto_increment,
    description VARCHAR (50) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE users (
	id INT (11) NOT NULL auto_increment,
    name VARCHAR (100) NOT NULL,
    username VARCHAR (100) NOT NULL,
    email VARCHAR (250) NOT NULL,
    password VARCHAR(250) NOT NULL,
    type INT NOT NULL,
    profile_image longblob,
    INDEX (type),
    primary key (id),
    foreign key (type) references user_type (id)
);


INSERT INTO user_type (description) VALUES ('admin'), ('user');

INSERT INTO users 
	(
		name,
        username,
        email,
        password,
        type
    ) 
	VALUES 
	(
		'Danny Sequeira',
        'rdani2005',
        'dricardosc15@gmail.com',
        'Seque1505',
        1
    );
