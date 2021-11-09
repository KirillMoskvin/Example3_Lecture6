CREATE TABLE author (
    id              INT      NOT NULL PRIMARY KEY,
    first_name      VARCHAR  NOT NULL,
    last_name       VARCHAR  NOT NULL,
    date_of_birth   DATE,
    year_of_birth   INT
);

CREATE TABLE book (
    id              INT        NOT NULL PRIMARY KEY,
    author_id       INT        NOT NULL REFERENCES author(id),
    title           VARCHAR    NOT NULL,
    language        VARCHAR    NOT NULL,
    published_in    INT        NOT NULL
);


INSERT INTO author (id, first_name, last_name, date_of_birth    , year_of_birth)
VALUES             (1 , 'George'  , 'Orwell' , DATE '1903-06-26', 1903         );
INSERT INTO author (id, first_name, last_name, date_of_birth    , year_of_birth)
VALUES             (2 , 'Paulo'   , 'Coelho' , DATE '1947-08-24', 1947         );

INSERT INTO book (id, author_id, title         , published_in, language)
VALUES           (1 , 1        , '1984'        , 1948        , 'EN');
INSERT INTO book (id, author_id, title         , published_in, language)
VALUES           (2 , 1        , 'Animal Farm' , 1945        , 'EN');
INSERT INTO book (id, author_id, title         , published_in, language)
VALUES           (3 , 2        , 'O Alquimista', 1988        , 'DE');
INSERT INTO book (id, author_id, title         , published_in, language)
VALUES           (4 , 2        , 'Brida'       , 1990        , 'DE');