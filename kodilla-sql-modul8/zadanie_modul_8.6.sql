INSERT INTO POSTS (USER_ID, BODY)
VALUES (3, "And this is my last post! Bye!");

COMMIT;

SELECT * FROM POSTS;

UPDATE POSTS
SET BODY = "TO DELETE"
WHERE USER_ID = 3;

COMMIT;

SELECT * FROM POSTS;

DELETE FROM POSTS WHERE USER_ID = 3;

COMMIT;

SELECT * FROM POSTS;