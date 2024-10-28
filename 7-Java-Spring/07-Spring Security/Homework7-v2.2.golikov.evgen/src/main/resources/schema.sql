CREATE TABLE IF NOT EXISTS user_table
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    login    VARCHAR(50)  NOT NULL,
    password VARCHAR(100) NOT NULL
    );

create table if not exists users_roles
(
    user_id bigint       not null,
    role    varchar(255) not null,
    primary key (user_id, role),
    constraint fk_users_roles_user_table foreign key (user_id) references user_table (id) on delete cascade on update no action
    );