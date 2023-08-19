DROP TABLE Cars;

CREATE TABLE Cars
(
    CID             NUMBER(9),
    CName           VARCHAR(40),
    CSurname        VARCHAR(40),
    CEmail          VARCHAR(40),
    CBrand          VARCHAR(40),
    CModel          VARCHAR(40),
    CColour         VARCHAR(40),
    CRegistration   VARCHAR(40) UNIQUE,
    CSeats          NUMBER(2), 
    
    PRIMARY KEY(CID)
);

INSERT INTO Cars VALUES
(1, 'Ken', 'Delvin', 'ken@dit.ie', 'Toyota', 'Lexus', 'Silver', '07D11211', 6);

INSERT INTO Cars VALUES
(2, 'Ken', 'Delvin', 'ken@dit.ie', 'Volkswagen', 'Golf', 'Silver', '00D12831', 5);

INSERT INTO Cars VALUES
(3, 'Ken', 'Delvin', 'ken@dit.ie', 'Audi', '100', 'Silver', '90D10800', 5);

INSERT INTO Cars VALUES
(4, 'Fred', 'Bloggs', 'Fred@ibm.ie', 'Ford', 'Escort', 'Silver', '80D2002', 5);

INSERT INTO Cars VALUES
(5, 'Fred', 'Bloggs', 'Fred@ibm.ie', 'Ford', 'Anglia', 'Black', '50D03', 4);

SELECT * FROM Cars;
