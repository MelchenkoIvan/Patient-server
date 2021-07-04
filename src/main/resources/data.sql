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
   ('Paracetamol', 1, 'Polfa'),
   ('ABILIFY', 0, 'Maintena'),
   ('ABRA', 1 ,'PO'),
   ('ACCOFIL', 0, 'Astra'),
   ('ACCUCHEKACTIVE', 0, 'Astra'),
   ('ACCORDEON', 1, 'Astra'),
   ('ABSERON', 0, 'Astrachan'),
   ('ABASRON', 0, 'Puzio'),
   ('KAKULIA', 1, 'Astra'),
   ('PANZERSZREKEN', 1, 'Germany');



DROP  TABLE IF EXISTS operacja;
CREATE TABLE operacja (
   id_operacji INT AUTO_INCREMENT  PRIMARY KEY,
   nazwa_Oper VARCHAR(250) NOT NULL,
   typ_Operacji VARCHAR(250) NOT NULL,
   liekarz  VARCHAR(250) NOT NULL,
   koszt_operacji DOUBLE,
   image  VARCHAR(250) NOT NULL
 );
 INSERT INTO operacja (nazwa_Oper, typ_Operacji, liekarz,koszt_operacji,image) VALUES
   ('Operacja otwarta zespołu cieśni nadgarstka','Chirurgia_ręki' ,'Robert Balawender', 4566.99 , 'https://cdn.vox-cdn.com/thumbor/MHI0NfjdpTcVlV1RFDZQau3SvrA=/0x0:1000x750/1200x800/filters:focal(0x0:1000x750)/cdn.vox-cdn.com/uploads/chorus_image/image/49626011/shutterstock_280947350.0.0.jpg'),
   ('Lifting twarzy','Chirurgia plastyczna i rekonstrukcyjna' ,'Jacek Belowski', 12666, 'https://images.unsplash.com/photo-1551601651-09492b5468b6?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1000&q=80'),
   ('Operacja zmniejszenia biustu','Chirurgia plastyczna i rekonstrukcyjna' ,'Jacek Belowski', 1666.99,'https://previews.123rf.com/images/kravka/kravka1506/kravka150600036/41988294-prosthesis-of-the-knee-hospital-operation.jpg'),
   ('Liposukcja','Chirurgia robotyczna' ,'Maria Brzegowy', 78666,'https://www.wantedinrome.com/i/preview/storage/uploads/2020/06/italian-woman-prepares-stuffed-olives-during-brain-operation-italy.jpg'),
   ('Operacja endoskopowa zespołu cieśni nadgarstka ','Chirurgia_ręki' ,'Robert Balawender', 7666,'https://lh3.googleusercontent.com/proxy/i7NpG0CT7-6XNBUIgxfTBJfqsVJuuHWRbddUwrS2kG8ybNuli_AEsUS7kvHjlTc_46IVi69ROoAihwR1-HcJ1u2gJqdZ_ResUE5Vf-2oyFkegWx7eeeyi-JoeQYNCGz8Lqd9UZu0BgpCTlpmi65Xha2SZmscDZKd8KV7yU6AB1M'),
   ('Wycięcie ganglionu nadgarstka metodą otwartą','Chirurgia_ręki' ,'Robert Balawender', 4666,'https://www.verywellhealth.com/thmb/oFp3Mo3owq5mH4bCb0v7jmk83fY=/2576x2576/smart/filters:no_upscale()/surgeon-operating-patient-on-table-at-hospital-695465248-594d78063df78cae8102d5bd.jpg'),
   ('Wypełnienia iniekcyjne skóry','Chirurgia robotyczna' ,'Maria Brzegowy', 666,'https://ak.picdn.net/offset/photos/5d03cd36469b183482a1a433/medium/photo.jpg'),
   ('Modelacja piersi','Chirurgia robotyczna' ,'Jarosław Feluś', 9666,'https://hips.hearstapps.com/digitalspyuk.cdnds.net/18/46/1542150284-operation-live-open-heart-surgery-4.png?resize=480:*'),
   ('Mikrodyscektomia','Chirurgia małoinwazyjna' ,'Jarosław Feluś', 2666.99,'https://ichef.bbci.co.uk/news/976/cpsprodpb/060B/production/_116774510_gettyimages-157562705.jpg'),
   ('Termonukleoplastyka','Chirurgia małoinwazyjna' ,'Jarosław Feluś', 99666.99,'https://i.dailymail.co.uk/1s/2020/06/16/01/29649806-8424577-image-a-22_1592265986766.jpg');
