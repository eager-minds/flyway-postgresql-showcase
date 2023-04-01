CREATE TABLE users
(
    id   UUID PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

INSERT INTO users (id, name)
VALUES ('c679422c-dfba-469d-b71c-4ec54d9911ca', 'Javier de Diego Navarro'),
('b716f597-b389-4f66-ac11-4c446efead9d', 'Other User Name1'),
('a9a747eb-7426-40eb-bb26-dbb1e8d305a0', 'Other User Name2'),
('d13add6f-fd78-47b7-a091-2e42d26c7f91', 'Other User Name3');