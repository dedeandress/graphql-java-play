# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table borrower (
  id                            serial not null,
  name                          varchar(255),
  email                         varchar(255),
  constraint pk_borrower primary key (id)
);


# --- !Downs

drop table if exists borrower cascade;

