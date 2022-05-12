
insert into artist (name) values('John Lennon');
insert into artist (name) values('Stevie Nicks');
insert into artist (name) values('Johnny Cash');
insert into artist (name) values('Luke Kelly');

insert into record (name, artist_id) values( 'Imagine', '1');
insert into record (name, artist_id) values( 'Edge Of Seventeen', '2');
insert into record (name, artist_id) values( 'Walk The Line', '3');
insert into record (name, artist_id) values( 'Raglan Road', '4');
insert into record (name, artist_id) values( 'Night Visiting Song', '4');
insert into record (name, artist_id) values( 'Black Velvet Band', '4');

insert into artist_record_lookup (id, artist_id, record_id) values ('1', '1', '1');
insert into artist_record_lookup (id, artist_id, record_id) values ('2', '2', '2');
insert into artist_record_lookup (id, artist_id, record_id) values ('3', '3', '3');
insert into artist_record_lookup (id, artist_id, record_id) values ('4', '4', '4');
insert into artist_record_lookup (id, artist_id, record_id) values ('5', '4', '4');