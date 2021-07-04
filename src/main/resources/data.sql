DROP  TABLE IF EXISTS patient;
CREATE TABLE patient (
  ID INT AUTO_INCREMENT  PRIMARY KEY,
  FIRST_NAME VARCHAR(250) NOT NULL,
  LAST_NAME VARCHAR(250) NOT NULL,
  PESEL  VARCHAR(250) NOT NULL,
  NR_UBEZPIECZENIA INT NOT NULL
);
INSERT INTO patient (FIRST_NAME, LAST_NAME, PESEL, NR_UBEZPIECZENIA) VALUES
  ('Ala', 'Makota', '68070776317', 12341),
  ('Jakub', 'Makota', '84061146758', 12342),
  ('Ola', 'Dom', '91070476338', 12343),
  ('Jan', 'Kowalski', '86111175888', 12344);


DROP  TABLE IF EXISTS lek;
CREATE TABLE lek (
   ID INT AUTO_INCREMENT  PRIMARY KEY,
   nazwa VARCHAR(250) NOT NULL,
   recept BIT,
   producent  VARCHAR(250) NOT NULL
 );
 INSERT INTO lek (nazwa, recept, producent) VALUES
   ('szczepionka', 0, 'Astra'),
   ('Paracetamol', 0, 'Polfa');

DROP  TABLE IF EXISTS operacja;
CREATE TABLE operacja (
   id_operacji INT AUTO_INCREMENT  PRIMARY KEY,
   nazwa_Oper VARCHAR(250) NOT NULL,
   typ_Operacji VARCHAR(250) NOT NULL,
   liekarz  VARCHAR(250) NOT NULL,
   koszt_operacji DOUBLE
 );
 INSERT INTO operacja (nazwa_Oper, typ_Operacji, liekarz,koszt_operacji) VALUES
   ('Op1','Chirurgia_ręki' ,'Piotr', 4566.55),
   ('Op2','Chirurgia_plastyczna_i_rekonstrukcyjna' ,'Jan', 1666.2);

