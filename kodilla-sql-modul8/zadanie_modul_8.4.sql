CREATE TABLE ISSUESLISTS (
    ID SERIAL PRIMARY KEY,
    NAME VARCHAR(100)
);
   
CREATE TABLE USER (
    ID SERIAL PRIMARY KEY,
    NAME VARCHAR(100)
);

CREATE TABLE ISSUES (
    ID SERIAL PRIMARY KEY,
    ISSUESLIST_ID BIGINT UNSIGNED NOT NULL,
    SUMMARY VARCHAR(20)CHARACTER SET UTF8MB4,
    DESCRIPTION VARCHAR(2000)CHARACTER SET UTF8MB4,
    USER_ID_ASSIGNEDTO BIGINT UNSIGNED NOT NULL,
    FOREIGN KEY (ISSUESLIST_ID)
        REFERENCES ISSUESLISTS (ID),
    FOREIGN KEY (USER_ID_ASSIGNEDTO)
        REFERENCES USER (ID)
);

INSERT INTO USER (NAME)
VALUES ("Sylwia"), ("Dawid"), ("Anna"), ("Oktawia");

#select * from users;

INSERT INTO ISSUESLISTS (NAME)
VALUES ("ToDo"), ("In progress"),("Done");

#select * from ISSUES;

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (1, "Obiad", "Zamówić burgery dla nas i frytki z batatów dla Oktawki", 4), 
(1, "Pranie", "Poskładać pranie i poochować do szafy", 2), 
(1, "Prasowanie", "Wyprasować sukienkę na jutro", 3), 
(1, "Kodilla", "Zrobić moduł 8.5", 1), 
(1, "Szkoła", "Sprawdzić wiadomości na Librusie", 2), 
(2, "Kodilla", "Skończyć zadanie domowe z modułu 8.4", 3), 
(2, "Szkoła", "Wpisac oceny", 1), 
(3, "Sprzątanie", "Poodkurzać mieszkanie", 2), 
(3, "Sprzątanie", "Umyć podłogi", 3), 
(3, "Kodilla", "Zrobić moduł 8.3", 1);

COMMIT;


