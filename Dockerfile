FROM postgres:10.5
COPY src/main/resources/db/V0__create_schema.sql /docker-entrypoint-initdb.d/V0__create_schema.sql
