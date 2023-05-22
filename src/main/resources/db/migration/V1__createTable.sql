CREATE TABLE IF NOT EXISTS users
(
    id         SERIAL PRIMARY KEY,
    username   CHARACTER VARYING,
    first_name CHARACTER VARYING,
    last_name  CHARACTER VARYING,
    email      CHARACTER VARYING
);