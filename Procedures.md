Connection Established

show databases;

-- delimiter //

-- create procedure getMovies()

-- begin

-- select * from movies;

-- end //

-- show procedure status where db = 'activity';

procedure calling

call getMovies()

use mydb;

select * from persons;

show procedure status where db = 'activity';

delimiter //

create procedure getProductions()

Begin

select * from productions;

end //

procedure call

call getProductions()
