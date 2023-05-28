CREATE SCHEMA IF NOT EXISTS IMAGES;

SET SEARCH_PATH = 'IMAGES';

CREATE TABLE IF NOT EXISTS IMAGE (
    ID SERIAL PRIMARY KEY,
    CONTENT BYTEA NOT NULL,
    CONTENT_TYPE VARCHAR(255) NOT NULL,
    NAME VARCHAR(255) NOT NULL
);