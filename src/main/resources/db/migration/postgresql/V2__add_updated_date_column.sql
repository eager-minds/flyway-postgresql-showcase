ALTER TABLE users
    ADD COLUMN updated_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP;

INSERT INTO users (id, name)
VALUES ('2b56127c-a575-484a-a41d-5bba536e5f07', 'Other User Name4'),
       ('d4728c90-e452-486e-b8eb-aa26edf0f517', 'Other User Name5'),
       ('6a1b2723-2813-4006-9ca0-1bdde080ed86', 'Other User Name6');