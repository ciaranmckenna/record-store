drop table if exists artist;
create table artist (
                        id bigint(20) NOT NULL,
                        first_name varchar(255),
                        last_name varchar(255)
);

drop table if exists record;
create table record (
                        id bigint(20) NOT NULL,
                        name varchar(255),
                        artist_id bigint(20) references artist(id)
);

insert into artist values(101, 'John', 'Lennon');
insert into artist values(102, 'Stevie', 'Nicks');
insert into artist values(103, 'Johnny', 'Cash');
insert into artist values(104, 'Luke', 'Kelly');
insert into record values(111, 'Imagine', 101);
insert into record values(112, 'Edge Of Seventeen', 102);
insert into record values(113, 'Walk The Line', 103);
insert into record values(114, 'Raglan Road', 104);
insert into record values(115, 'Night Visiting Song', 104);
insert into record values(116, 'Black Velvet Band', 104);