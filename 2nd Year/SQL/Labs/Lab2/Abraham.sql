DROP TABLE MUSIC;

CREATE TABLE Music
(
    CName_1            VARCHAR(40),
    Date_Played        Date       ,
    Date_Added         Date       ,
    Album              VARCHAR(40),
    Genre              VARCHAR(40),
    Artist             VARCHAR(40),
    Cost_of_dowloading NUMBER(5,2), 
    
    PRIMARY KEY(CName_1)
    
);

INSERT INTO Music
(CName_1, Date_Played, Date_Added, Album, Genre, Artist, Cost_of_dowloading)
VALUES('TADOW', '24-MAY-2017', '05-FEB-2021', 'FKJ', 'JAZZ', 'FKJ, MASEGO', 4.99);

INSERT INTO Music
(CName_1, Date_Played, Date_Added, Album, Genre, Artist, Cost_of_dowloading)
VALUES('Fly me to the moon', '19-Apr-1954', '05-FEB-2021', 'green moon', 'JAZZ', 'Frank Synatra', 4.99);

INSERT INTO Music VALUES
('Clint Eastwood', '5-Mar-2001', '05-FEB-2021', 'Gorillaz', 'hip-hop', 'Gorillaz', 3.99);

INSERT INTO Music VALUES
('Por ti volare', '21-Feb-1995', '05-FEB-2021', 'Bocelli', 'Operatic-pop', 'Andrea Bocelli', 5.99);

SELECT * FROM Music;
