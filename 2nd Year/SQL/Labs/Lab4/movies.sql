--------------------------------------------------------
--  File created - Thursday-February-12-2015   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table MOVIES
--------------------------------------------------------
  DROP TABLE MOVIES;
  CREATE TABLE MOVIES 
   (	
        MTITLE VARCHAR2(40) primary key, 
        SCORE NUMBER(4,2), 
        RATING VARCHAR2(5), 
        GENRE VARCHAR2(16), 
        BOX_OFFICE NUMBER(7,3), 
        RUNNING_TIME NUMBER(6)not null
   )  ;
   
REM INSERTING into MOVIES
SET DEFINE OFF;
Insert into MOVIES  values ('2 Fast 2 Furious',48.9,'PG-13','action/adventure',127.146,107);
Insert into MOVIES  values ('28 Days Later',78.2,'R','horror',45.065,113);
Insert into MOVIES  values ('A Guy Thing',39.5,'PG-13','rom comedy',15.545,101);
Insert into MOVIES  values ('A Man Apart',42.9,'R','action/adventure',26.248,110);
Insert into MOVIES  values ('A Mighty Wind',79.9,'PG-13','comedy',17.781,91);
Insert into MOVIES  values ('Agent Cody Banks',57.9,'PG','action/adventure',47.811,102);
Insert into MOVIES  values ('Alex and Emma',35.1,'PG-13','rom comedy',14.219,96);
Insert into MOVIES  values ('American Wedding',50.7,'R','comedy',104.441,96);
Insert into MOVIES  values ('Anger Management',62.6,'PG-13','comedy',134.404,106);
Insert into MOVIES  values ('Anything Else',63.3,'R','rom comedy',3.212,108);
Insert into MOVIES  values ('Bad Boys II',38.1,'R','action/adventure',138.397,147);
Insert into MOVIES  values ('Bad Santa',75.8,'R','comedy',59.523,91);
Insert into MOVIES  values ('Basic',43.6,'R','suspense',26.536,98);
Insert into MOVIES  values ('Beyond Borders',48.8,'R','drama',4.43,127);
Insert into MOVIES  values ('big fish',78,'PG-13','drama',65.151,125);
Insert into MOVIES  values ('Biker Boyz',44.8,'PG-13','action/adventure',21.731,110);
Insert into MOVIES  values ('Boat Trip',29.2,'R','comedy',8.6,94);
Insert into MOVIES  values ('Bringing Down the House',57.7,'PG-13','comedy',132.582,105);
Insert into MOVIES  values ('Brother Bear',60.6,'G','animated',84.874,84);
Insert into MOVIES  values ('Bruce Almighty',63.3,'PG-13','comedy',242.705,101);
Insert into MOVIES  values ('Bulletproof Monk',47.3,'PG-13','action/adventure',23.359,104);
Insert into MOVIES  values ('Cabin Fever',54.3,'R','horror',21.158,93);
Insert into MOVIES  values ('Calendar Girls',67.3,'PG-13','comedy',29.591,108);
Insert into MOVIES  values ('Charlie''s Angles: Full Throttle',54.8,'PG-13','action/adventure',100.785,106);
Insert into MOVIES  values ('Cheaper by the Dozen',52.9,'PG','comedy',135.445,98);
Insert into MOVIES  values ('Cold Creek Manor',50.6,'R','suspense',21.386,118);
Insert into MOVIES  values ('Cold Mountain',78,'R','drama',90.712,152);
Insert into MOVIES  values ('Confidence',62.2,'R','drama',12.218,97);
Insert into MOVIES  values ('Cradle 2 the Grave',45.8,'R','action/adventure',34.613,101);
Insert into MOVIES  values ('Daddy Day Care',40.5,'PG','comedy',104.297,92);
Insert into MOVIES  values ('Daredevil',52.1,'PG-13','action/adventure',102.544,103);
Insert into MOVIES  values ('Dark Blue',58.7,'R','drama',9.25,118);
Insert into MOVIES  values ('Darkness Falls',31.1,'PG-13','horror',32.131,86);
Insert into MOVIES  values ('Deliver Us From Eva',61.8,'R','rom comedy',17.366,105);
Insert into MOVIES  values ('Dickie Roberts, Former Child Star',52.6,'PG-13','comedy',22.739,98);
Insert into MOVIES  values ('Down With Love',63.7,'PG-13','rom comedy',20.305,101);
Insert into MOVIES  values ('Dr. Seuss'' The Cat in the Hat',37.8,'PG','fantasy',99.88,82);
Insert into MOVIES  values ('Dreamcatcher',42.5,'R','sci-fi',33.7,136);
Insert into MOVIES  values ('Dumb and Dumberer',29.5,'PG-13','comedy',26.166,85);
Insert into MOVIES  values ('Duplex',51.3,'PG-13','comedy',9.671,89);
Insert into MOVIES  values ('Dysfunktional Family',57.2,'R','documentary',2.235,89);
Insert into MOVIES  values ('Elf',70.3,'PG','comedy',173.306,95);
Insert into MOVIES  values ('Final Destination 2',46.1,'R','horror',46.492,90);
Insert into MOVIES  values ('Finding Nemo',91.2,'G','animated',339.715,100);
Insert into MOVIES  values ('Freaky Friday',74.9,'PG','comedy',110.222,97);
Insert into MOVIES  values ('Freddy vs. Jason',47.3,'R','horror',82.217,97);
Insert into MOVIES  values ('From Justin to Kelly',34.8,'PG','musical',4.929,81);
Insert into MOVIES  values ('Gigli',29.3,'R','rom comedy',6.088,121);
Insert into MOVIES  values ('Gods and Generals',42,'PG-13','drama',12.875,231);
Insert into MOVIES  values ('Good Boy!',57.9,'PG','comedy',37.655,87);
Insert into MOVIES  values ('Gothika',48.1,'R','horror',59.454,98);
Insert into MOVIES  values ('Grind',35,'PG-13','comedy',5.124,105);
Insert into MOVIES  values ('Head of State',56.7,'PG-13','comedy',37.845,95);
Insert into MOVIES  values ('Holes',71.9,'PG','drama',67.365,117);
Insert into MOVIES  values ('Hollywood Homicide',47.9,'PG-13','action/adventure',30.941,116);
Insert into MOVIES  values ('Honey',49.9,'PG-13','drama',30.223,94);
Insert into MOVIES  values ('House of 1000 Corpses',36.3,'R','horror',12.599,105);
Insert into MOVIES  values ('How to Deal',53.6,'PG-13','drama',14.144,101);
Insert into MOVIES  values ('How to Lose a Guy in 10 Days',50.3,'PG-13','rom comedy',106.094,116);
Insert into MOVIES  values ('Identity',60,'R','suspense',52.131,90);
Insert into MOVIES  values ('In the Cut',53.6,'R','suspense',4.717,119);
Insert into MOVIES  values ('Intolerable Cruelty',67.1,'PG-13','rom comedy',35.189,100);
Insert into MOVIES  values ('It Runs in the Family',55.6,'PG-13','comedy',7.492,109);
Insert into MOVIES  values ('Jeepers Creepers 2',44.2,'R','horror',35.667,104);
Insert into MOVIES  values ('Johnny English',56.4,'PG','comedy',28.082,87);
Insert into MOVIES  values ('Just Married',41.5,'PG-13','rom comedy',56.127,95);
Insert into MOVIES  values ('Kangaroo Jack',30.4,'PG','comedy',66.746,89);
Insert into MOVIES  values ('Kill Bill - Vol 1',84.1,'R','action/adventure',69.869,111);
Insert into MOVIES  values ('Lara Croft, Tomb Raider',48.8,'PG-13','action/adventure',65.66,117);
Insert into MOVIES  values ('Le Divorce',59.6,'PG-13','comedy',9.081,117);
Insert into MOVIES  values ('Legally Blonde 2',50.8,'PG-13','comedy',89.921,95);
Insert into MOVIES  values ('Looney Tunes: Back in Action',59.3,'PG','comedy',20.808,90);
Insert into MOVIES  values ('Lost in Translation',94.6,'R','drama',43.217,102);
Insert into MOVIES  values ('Love Actually',70.5,'R','rom comedy',59.365,135);
Insert into MOVIES  values ('Love Don''t Cost a Thing',45.4,'PG-13','rom comedy',21.803,100);
Insert into MOVIES  values ('Malibu''s Most Wanted',44.8,'PG-13','comedy',34.34,86);
Insert into MOVIES  values ('Marci X',36.2,'R','comedy',1.649,84);
Insert into MOVIES  values ('Master and Commander',87.6,'PG-13','action/adventure',92.076,138);
Insert into MOVIES  values ('Matchstick Men',68.9,'PG-13','comedy',36.886,116);
Insert into MOVIES  values ('Mona Lisa Smile',55.8,'PG-13','drama',63.696,117);
Insert into MOVIES  values ('Monster',64.9,'R','drama',23.802,109);
Insert into MOVIES  values ('My Boss''s Daughter',33.2,'PG-13','rom comedy',15.551,90);
Insert into MOVIES  values ('Mystic River',89.9,'R','drama',79.207,137);
Insert into MOVIES  values ('National Security',37.9,'PG-13','action/adventure',35.765,88);
Insert into MOVIES  values ('Old School',54.7,'R','comedy',74.663,92);
Insert into MOVIES  values ('Once Upon A Time in Mexico',64.6,'R','action/adventure',55.846,102);
Insert into MOVIES  values ('Open Range',71.6,'R','western',58.331,139);
Insert into MOVIES  values ('Out of Time',65.8,'PG-13','suspense',41.077,105);
Insert into MOVIES  values ('Paycheck',48.3,'PG-13','sci-fi',53.428,119);
Insert into MOVIES  values ('Peter Pan',67.5,'PG','fantasy',47.581,113);
Insert into MOVIES  values ('Phone Booth',62.1,'R','suspense',46.566,81);
Insert into MOVIES  values ('Piglet''s Big Movie',63.6,'G','animated',23.103,75);
Insert into MOVIES  values ('Pirates of the Caribbean',67.8,'PG-13','action/adventure',305.414,143);
Insert into MOVIES  values ('Radio',54.2,'PG','drama',51.987,109);
Insert into MOVIES  values ('Rugrats Go Wild',55.6,'PG','animated',39.403,84);
Insert into MOVIES  values ('Runaway Jury',65.4,'PG-13','suspense',49.441,127);
Insert into MOVIES  values ('S.W.A.T.',55.4,'PG-13','action/adventure',116.643,117);
Insert into MOVIES  values ('Scary Movie 3',50.2,'PG-13','comedy',110,84);
Insert into MOVIES  values ('Seabiscuit',81.3,'PG-13','drama',120.171,141);
Insert into MOVIES  values ('Secondhand Lions',57.9,'PG','drama',41.521,111);
Insert into MOVIES  values ('Shanghai Knights',62.1,'PG-13','action/adventure',60.477,114);
Insert into MOVIES  values ('Sinbad: Legend of the Seven Seas',55.3,'PG','animated',26.309,86);
Insert into MOVIES  values ('Something''s Gotta Give',75.5,'PG-13','rom comedy',121.418,128);
Insert into MOVIES  values ('Spy Kids 3-D: Game Over',65,'PG','action/adventure',111.761,84);
Insert into MOVIES  values ('Stuck on You',65.6,'PG-13','comedy',33.762,118);
Insert into MOVIES  values ('Tears of the Sun',53.1,'R','action/adventure',43.427,121);
Insert into MOVIES  values ('Terminator 3:Rise of the Machines',71.3,'R','action/adventure',150.358,109);
Insert into MOVIES  values ('The Core',53.1,'PG-13','sci-fi',31.187,135);
Insert into MOVIES  values ('The Fighting Temptations',63.3,'PG-13','comedy',30.251,123);
Insert into MOVIES  values ('The Haunted Mansion',45.3,'PG','comedy',74.32,99);
Insert into MOVIES  values ('The Hulk',61,'PG-13','action/adventure',132.176,138);
Insert into MOVIES  values ('The Hunted',54,'R','action/adventure',34.316,94);
Insert into MOVIES  values ('The In-Laws',44.8,'PG-13','comedy',20.453,95);
Insert into MOVIES  values ('The Italian Job',66.5,'PG-13','action/adventure',106.129,111);
Insert into MOVIES  values ('The Jungle Book 2',55.2,'G','animated',47.902,72);
Insert into MOVIES  values ('The Last Samurai',67.8,'R','drama',110.069,154);
Insert into MOVIES  values ('The League of Extraordinary Gentlemen',43.2,'PG-13','action/adventure',66.465,110);
Insert into MOVIES  values ('The Life of David Gale',46.9,'R','suspense',19.956,130);
Insert into MOVIES  values ('The Lizze McGuire Movie',57.1,'PG','comedy',42.718,94);
Insert into MOVIES  values ('The Lord of the Rings III',92.2,'PG-13','fantasy',361.119,201);
Insert into MOVIES  values ('The Matrix Reloaded',70.1,'R','action/adventure',281.519,138);
Insert into MOVIES  values ('The Matrix Revolutions',49.7,'R','action/adventure',139.26,129);
Insert into MOVIES  values ('The Medallion',46.2,'PG-13','action/adventure',22.219,88);
Insert into MOVIES  values ('The Missing',67,'R','western',26.9,137);
Insert into MOVIES  values ('The Order',29.8,'R','suspense',7.661,102);
Insert into MOVIES  values ('The Real Cancun',40.8,'R','documentary',3.779,96);
Insert into MOVIES  values ('The Recruit',62.6,'PG-13','suspense',52.802,115);
Insert into MOVIES  values ('The Rundown',60.4,'PG-13','action',47.611,104);
Insert into MOVIES  values ('The School of Rock',86.4,'PG-13','comedy',81.239,108);
Insert into MOVIES  values ('The Texas Chainsaw Massacre',42.2,'PG-13','horror',80.168,98);
Insert into MOVIES  values ('Timeline',42.9,'R','action',19.481,116);
Insert into MOVIES  values ('Tupac: Resurrection',69.5,'R','documentary',7.719,90);
Insert into MOVIES  values ('Under the Tuscan Sun',63.1,'PG-13','comedy',43.502,113);
Insert into MOVIES  values ('Underworld',46.2,'R','action',51.484,121);
Insert into MOVIES  values ('Uptown Girls',38.5,'PG-13','comedy',37.182,92);
Insert into MOVIES  values ('View from the Top',43.7,'PG-13','comedy',15.597,87);
Insert into MOVIES  values ('What a Girl Wants',53.3,'PG','comedy',36.017,105);
Insert into MOVIES  values ('Willard',60.3,'PG-13','horror',6.852,100);
Insert into MOVIES  values ('Wrong Turn',32.6,'R','horror',15.419,84);
Insert into MOVIES  values ('X2: X-Men United',72.5,'PG-13','action',214.95,133);
commit;
