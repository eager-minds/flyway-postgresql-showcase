ALTER TABLE users
    DROP COLUMN updated_date;

DELETE
FROM users
WHERE id IN ('2b56127c-a575-484a-a41d-5bba536e5f07',
             'd4728c90-e452-486e-b8eb-aa26edf0f517',
             '6a1b2723-2813-4006-9ca0-1bdde080ed86');