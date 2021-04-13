SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS cursan;
DROP TABLE IF EXISTS hacen;
DROP TABLE IF EXISTS realizan;
DROP TABLE IF EXISTS alumnos;
DROP TABLE IF EXISTS imparten;
DROP TABLE IF EXISTS asignaturas;
DROP TABLE IF EXISTS elaboran;
DROP TABLE IF EXISTS examenes;
DROP TABLE IF EXISTS practicas;
DROP TABLE IF EXISTS profesores;




/* Create Tables */

CREATE TABLE alumnos
(
	Num_Alumn  int NOT NULL,
	Nombre  varchar(20) NOT NULL,
	Grupo varchar(20) NOT NULL,
	PRIMARY KEY (Num_Alumn )
);


CREATE TABLE asignaturas
(
	Num_Asig int NOT NULL,
	Nombre varchar(20),
	PRIMARY KEY (Num_Asig)
);


CREATE TABLE cursan
(
	Trimestre int NOT NULL,
	Num_Alum int NOT NULL,
	Num_Asig int NOT NULL,
	Num_Asig int NOT NULL,
	Num_Alumn  int NOT NULL
);


CREATE TABLE elaboran
(
	Fecha date,
	Cod_Pract int NOT NULL,
	Num_Prof int NOT NULL,
	Num_Prof int NOT NULL,
	Cod_Pract int NOT NULL
);


CREATE TABLE examenes
(
	Num_Exam int NOT NULL,
	N_Preguntas int,
	Fecha date,
	PRIMARY KEY (Num_Exam)
);


CREATE TABLE hacen
(
	Nota int,
	Num_Alumn  int NOT NULL,
	Num_Exam int NOT NULL
);


CREATE TABLE imparten
(
	Num_Asig int NOT NULL,
	Num_Prof int NOT NULL,
	Num_Asig int NOT NULL,
	Num_Prof int NOT NULL
);


CREATE TABLE practicas
(
	Cod_Pract int NOT NULL,
	Titulo varchar(20),
	Nivel varchar(20),
	PRIMARY KEY (Cod_Pract)
);


CREATE TABLE profesores
(
	Num_Prof int NOT NULL,
	Nombre varchar(20),
	PRIMARY KEY (Num_Prof)
);


CREATE TABLE realizan
(
	Nota int,
	Fecha date,
	Num_Alumn  int NOT NULL,
	Cod_Pract int NOT NULL
);



/* Create Foreign Keys */

ALTER TABLE cursan
	ADD FOREIGN KEY (Num_Alumn )
	REFERENCES alumnos (Num_Alumn )
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE hacen
	ADD FOREIGN KEY (Num_Alumn )
	REFERENCES alumnos (Num_Alumn )
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE realizan
	ADD FOREIGN KEY (Num_Alumn )
	REFERENCES alumnos (Num_Alumn )
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE cursan
	ADD FOREIGN KEY (Num_Asig)
	REFERENCES asignaturas (Num_Asig)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE imparten
	ADD FOREIGN KEY (Num_Asig)
	REFERENCES asignaturas (Num_Asig)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE hacen
	ADD FOREIGN KEY (Num_Exam)
	REFERENCES examenes (Num_Exam)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE elaboran
	ADD FOREIGN KEY (Cod_Pract)
	REFERENCES practicas (Cod_Pract)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE realizan
	ADD FOREIGN KEY (Cod_Pract)
	REFERENCES practicas (Cod_Pract)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE elaboran
	ADD FOREIGN KEY (Num_Prof)
	REFERENCES profesores (Num_Prof)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE imparten
	ADD FOREIGN KEY (Num_Prof)
	REFERENCES profesores (Num_Prof)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



