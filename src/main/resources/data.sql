DROP  TABLE IF EXISTS patient;
CREATE TABLE patient (
ID INT AUTO_INCREMENT PRIMARY KEY,
FIRST_NAME VARCHAR(250) NOT NULL,
LAST_NAME VARCHAR(250) NOT NULL,
PESEL VARCHAR(250) NOT NULL );

INSERT INTO patient (FIRST_NAME, LAST_NAME, PESEL)
VALUES ('Ala', 'Makota', '68070776317'),
('Jakub', 'Makota', '84061146758'),
('Ola', 'Dom', '91070476338'),
('Jan', 'Kowalski', '86111175888');