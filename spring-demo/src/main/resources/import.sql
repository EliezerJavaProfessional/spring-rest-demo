
insert into user_account(id, first_name, last_name, active) values(1001, 'John', 'Wick', true);
insert into user_account(id, first_name, last_name, active) values(1002, 'John', 'Connor', true);
insert into user_account(id, first_name, last_name, active) values(1003, 'Sarah', 'Connor', true);
insert into user_account(id, first_name, last_name, active) values(1004, 'Sarah', 'Marshall', true);
insert into user_account(id, first_name, last_name, active) values(1005, 'John', 'Smith', true);
insert into user_account(id, first_name, last_name, active) values(1007, 'John', 'Malkovich', false);
insert into user_account(id, first_name, last_name, active) values(1008, 'Forrest', 'Gump', true);

insert into user_message(id, user_account_id, message) values(1001, 1001, 'Message 01');
insert into user_message(id, user_account_id, message) values(1002, 1001, 'Message 02');
insert into user_message(id, user_account_id, message) values(1003, 1003, 'Message 03');
insert into user_message(id, user_account_id, message) values(1004, 1003, 'Message 04');
insert into user_message(id, user_account_id, message) values(1005, 1004, 'Message 05');
insert into user_message(id, user_account_id, message) values(1006, 1008, 'Message 06');
insert into user_message(id, user_account_id, message) values(1007, 1008, 'Message 07');
insert into user_message(id, user_account_id, message) values(1008, 1008, 'Message 08');