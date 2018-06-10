CREATE TABLE IF NOT EXISTS Todo(id IDENTITY PRIMARY KEY, done BOOLEAN, text VARCHAR(100));
DELETE FROM Todo;
INSERT INTO Todo VALUES(1, true, 'Prepare Micro exam');
INSERT INTO Todo VALUES(2, TRUE, 'Do not procrastinate');
INSERT INTO Todo VALUES(3,FALSE, 'Get an internship ');