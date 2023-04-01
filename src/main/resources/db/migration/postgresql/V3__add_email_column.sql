ALTER TABLE users
    ADD COLUMN email VARCHAR(40);

UPDATE users SET email = 'javier@eagerminds.tech'
WHERE id = 'c679422c-dfba-469d-b71c-4ec54d9911ca';
UPDATE users SET email = 'otheruser1@eagerminds.tech'
WHERE id = 'b716f597-b389-4f66-ac11-4c446efead9d';
UPDATE users SET email = 'otheruser2@eagerminds.tech'
WHERE id = 'a9a747eb-7426-40eb-bb26-dbb1e8d305a0';
UPDATE users SET email = 'otheruser3@eagerminds.tech'
WHERE id = 'd13add6f-fd78-47b7-a091-2e42d26c7f91';
UPDATE users SET email = 'otheruser4@eagerminds.tech'
WHERE id = '2b56127c-a575-484a-a41d-5bba536e5f07';
UPDATE users SET email = 'otheruser5@eagerminds.tech'
WHERE id = 'd4728c90-e452-486e-b8eb-aa26edf0f517';
UPDATE users SET email = 'otheruser6@eagerminds.tech'
WHERE id = '6a1b2723-2813-4006-9ca0-1bdde080ed86';
INSERT INTO users (id, name, email)
VALUES ('423c1680-f651-4186-ae01-470b24dfaceb', 'Other User Name7', 'otheruser7@eagerminds.tech'),
       ('0a761b6c-1b1f-450e-b71c-7a942aa3d9ef', 'Other User Name8', 'otheruser8@eagerminds.tech'),
       ('41fea396-2da3-4cb7-8cbb-0e4c1a38eb8c', 'Other User Name9', 'otheruser9@eagerminds.tech');