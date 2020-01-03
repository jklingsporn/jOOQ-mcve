-- create USER
CREATE ROLE jooq_user NOSUPERUSER NOCREATEDB NOCREATEROLE NOINHERIT LOGIN PASSWORD 'test' ;
--schema
CREATE SCHEMA mcve;
alter schema mcve owner to jooq_user;

