INSERT INTO user_table (login, password)
values ('user', '$2a$12$7twIm09MJ3HPGt09FQQ5E.YribboPNU.nCYijWXNh3GqB85uEy/aO');
INSERT INTO user_table (login, password)
values ('admin', '$2a$12$7twIm09MJ3HPGt09FQQ5E.YribboPNU.nCYijWXNh3GqB85uEy/aO');

insert into users_roles (user_id, role)
values (1, 'ROLE_USER'),
       (2, 'ROLE_ADMIN'),
       (2, 'ROLE_USER');