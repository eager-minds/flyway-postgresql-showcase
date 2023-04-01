CREATE TABLE IF NOT EXISTS users_email_backup
(
    id   UUID PRIMARY KEY,
    email VARCHAR(255) NOT NULL
);

UPDATE users_email_backup
SET email = users.email FROM users
WHERE users.id = users_email_backup.id;

INSERT INTO users_email_backup (id, email)
SELECT id, email
FROM users
WHERE id NOT IN (SELECT id FROM users_email_backup where users_email_backup.id = users.id);

ALTER TABLE users
    DROP COLUMN email;

DELETE
FROM users
WHERE id IN ('423c1680-f651-4186-ae01-470b24dfaceb',
             '0a761b6c-1b1f-450e-b71c-7a942aa3d9ef',
             '41fea396-2da3-4cb7-8cbb-0e4c1a38eb8c');
