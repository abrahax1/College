-- Create a user with username patricia and password obyrne
create user &&USERNAME identified by &PASSWORD default tablespace users quota unlimited on users;
GRANT CREATE SESSION,CREATE TABLE, CREATE VIEW, CREATE procedure, CREATE SEQUENCE, CREATE TRIGGER to &&username;
undefine password;
undefine username;