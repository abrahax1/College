--Q1
CREATE OR REPLACE VIEW PlayerFor AS SELECT Player_ID, Player_Forename, Player_Surname, Team_ID, Team FROM MPlayers 
JOIN MPerformance USING (Player_ID) 
JOIN MTeams USING(Team_ID);

SELECT * FROM PlayedFor;

--Q2
SELECT COUNT (Player_ID) FROM MPlayers;

--Q3
SELECT COUNT(Team_ID) FROM MTeams;

--Q4
SELECT COUNT(*) FROM (SELECT DISTINCT Player_ID, Team FROM PlayedFor);

--Q5
SELECT Player_ID, Player_Forename, Player_Surname FROM PlayedFor WHERE Team = 'Queens Park Rangers';

--Q6
SELECT Player_ID, Player_Forename, Player_Surname FROM PlayedFor WHERE Team != 'Queens Park Rangers';

--Q7
--LONG WAY
SELECT COUNT(*) FROM (SELECT DISTINCT Player_ID, Team FROM PlayedFor) WHERE Team = 'Queens Park Rangers';
--SHORT WAY
SELECT COUNT(Player_ID) FROM PlayedFor WHERE Team = 'Queens Park Rangers';

--Q8 NOT SURE
SELECT COUNT(Player_ID) FROM PlayedFor WHERE Team = 'Queens Park Rangers' AND Team = 'Aston Villa';

--Q9
SELECT COUNT(Player_ID) FROM PlayedFor WHERE Team = 'Manchester City' OR Team = 'Manchester United';

--Q10 NOT SURE
SELECT COUNT(Player_ID) FROM PlayedFor WHERE Team = 'Aston Villa' AND Team != 'Queens Park Rangers';

--Q11 NOT SURE
SELECT COUNT(Player_ID) FROM PlayedFor WHERE Team = 'Queens Park Rangers' AND Team != 'Aston Villa';

--Q12 NOT SURE
SELECT Player_ID, Player_Forename, Player_Surname, Team FROM PlayedFor WHERE Team = 'Queens Park Rangers';
