create table if not exists alternate_recon(
ledger_data varchar(255) not null,
account_purpose varchar(255) null,
realm varchar(255) null,
recon_system varchar(255) null,
recon_system_code varchar(255) null,
recon_system_description varchar(255) null,
swift_code varchar(255) null,
interday_swift_code Integer null,
account_status varchar(255) null,
nostro_identifier varchar(255) null,
entity_state varchar(255) null,
constraint alternate_recon_pk primary key(ledger_data));