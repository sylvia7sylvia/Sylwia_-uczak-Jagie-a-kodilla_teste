CREATE TABLE ISSUESLISTS (
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
        REFERENCES USERS (ID)
);

INSERT INTO ISSUESLISTS (NAME)
VALUES ("ToDo"), ("In progress"),("Done");

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (1, "Obiad", "Zamówić burgery dla nas i frytki z batatów dla Oktawki", 1), 
(1, "Pranie", "Poskładać pranie i poochować do szafy", 1), 
(1, "Prasowanie", "Wyprasować sukienkę na jutro", 2), 
(1, "Kodilla", "Zrobić moduł 8.5", 1), 
(1, "Szkoła", "Sprawdzić wiadomości na Librusie", 3), 
(2, "Kodilla", "Skończyć zadanie domowe z modułu 8.4", 1), 
(2, "Szkoła", "Wpisac oceny", 4), 
(3, "Sprzątanie", "Poodkurzać mieszkanie", 1), 
(3, "Sprzątanie", "Umyć podłogi", 1), 
(3, "Kodilla", "Zrobić moduł 8.3", 5);

COMMIT;


