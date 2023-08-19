INSERT INTO car VALUES ('08C65432', 'Ford', '01-01-2019', '20-01-2021', 251023);
INSERT INTO car VALUES ('06G54333', 'Mercedes Benz', '01-01-2021', '01-01-2021', 10539);
INSERT INTO car VALUES ('07MH4443', 'Volskwagen', '01-01-2015', '13-10-2021', 445210);

INSERT INTO driver VALUES (1, 'Danny Lawless', 'DUBLIN', '01-10-2018');
INSERT INTO driver VALUES (2, 'Paul Browne', 'CORK', '21-04-2020');
INSERT INTO driver VALUES (3, 'Jaane McGoldrick', 'GALWAY', '01-01-2015');

INSERT INTO driver_car VALUES (1, '08C65432');
INSERT INTO driver_car VALUES (1, '06G54333');
INSERT INTO driver_car VALUES (1, '07MH4443');
INSERT INTO driver_car VALUES (2, '06G54333');
INSERT INTO driver_car VALUES (2, '08C65432');
INSERT INTO driver_car VALUES (2, '07MH4443');
INSERT INTO driver_car VALUES (3, '07MH4443');
INSERT INTO driver_car VALUES (3, '07MH4443');

INSERT INTO customers VALUES (1, 'Ken OBrien', '3 Ballyduagh, Cashel Co. Tipperary');
INSERT INTO customers VALUES (2, 'Oliver OConnor', '76 Elgin Heights, Bray Co.Wicklow');
INSERT INTO customers VALUES (3, 'Tommy  Hilfiger', '71 Liffey Valley, Dublin Co.Dublin');
INSERT INTO customers VALUES (4, 'Ann OReilly', '42 Carndonagh, Carndonagh Co.Donegal');
INSERT INTO customers VALUES (5, 'Mary  OGallagher', '161 Collins Ave. West, D9 Co.Dublin');
INSERT INTO customers VALUES (6, 'Shane  OByrne', '1 Academy Street, Kildare Co.Kildare');

INSERT INTO c_record VALUES (1, 4000, 3250, 1);
INSERT INTO c_record VALUES (2, 1300, 600, 2);
INSERT INTO c_record VALUES (3, 500, 400, 3);
INSERT INTO c_record VALUES (4, 150, 50, 4);
INSERT INTO c_record VALUES (5, 0, 0, 5);
INSERT INTO c_record VALUES (6, 450, 240, 6);

INSERT INTO contract VALUES (1, 800);
INSERT INTO contract VALUES (2, 1500);
INSERT INTO contract VALUES (3, 5000);
INSERT INTO contract VALUES (4, 100);
INSERT INTO contract VALUES (5, 550);
INSERT INTO contract VALUES (6, 200);

INSERT INTO customers_contract VALUES (1, 1);
INSERT INTO customers_contract VALUES (1, 2);
INSERT INTO customers_contract VALUES (2, 3);
INSERT INTO customers_contract VALUES (1, 1);
INSERT INTO customers_contract VALUES (1, 2);
INSERT INTO customers_contract VALUES (1, 2);
INSERT INTO customers_contract VALUES (1, 1);
INSERT INTO customers_contract VALUES (2, 3);
INSERT INTO customers_contract VALUES (3, 5);
INSERT INTO customers_contract VALUES (4, 6);
INSERT INTO customers_contract VALUES (5, 4);
INSERT INTO customers_contract VALUES (6, 5);

INSERT INTO schedule VALUES (1, '13-Oct-21', '13-Oct-21', '07:00', '10:00', 'DUBLIN', 'CORK', 'Ford / 08C65432');
INSERT INTO schedule VALUES (2, '13-Oct-21', '13-Oct-21', '14:15', '18:50', 'CORK', 'DUBLIN', 'Mercedes Benz / 06G54333');
INSERT INTO schedule VALUES (3, '14-Oct-21', '14-Oct-21', '08:00', '13:15', 'BELFAST', 'GALWAY', 'Volskwagen / 07MH4443');
INSERT INTO schedule VALUES (4, '13-Oct-21', '13-Oct-21', '11:00', '14:55', 'DUBLIN', 'CORK', 'Mercedes Benz / 06G54333');
INSERT INTO schedule VALUES (5, '13-Oct-21', '13-Oct-21', '15:00', '19:00', 'CORK', 'DUBLIN', 'Ford / 08C65432');
INSERT INTO schedule VALUES (6, '14-Oct-21', '14-Oct-21', '11:13', '15:30', 'DUBLIN', 'CORK', 'Volskwagen / 07MH4443');
INSERT INTO schedule VALUES (7, '13-Oct-21', '13-Oct-21', '9:00', '11:13', 'DUBLIN', 'CORK', 'Volskwagen / 07MH4443');
INSERT INTO schedule VALUES (8, '14-Oct-21', '14-Oct-21', '10:13', '14:50', 'BELFAST', 'GALWAY', 'Volskwagen / 07MH4443');
INSERT INTO schedule VALUES (9, '14-Oct-21', '14-Oct-21', '11:33', '18:50', 'DUBLIN', 'BELFAST', 'Mercedes Benz / 06G54333');
INSERT INTO schedule VALUES (10, '14-Oct-21', '14-Oct-21', '16:13', '21:50', 'DUBLIN', 'GALWAY', 'Volskwagen / 07MH4443');
INSERT INTO schedule VALUES (11, '15-Oct-21', '15-Oct-21', '18:13', '22:50', 'GALWAY', 'WATERFORD', 'Ford / 08C65432');

INSERT INTO contract_schedule VALUES (1, 1, 1);
INSERT INTO contract_schedule VALUES (2, 2, 2);
INSERT INTO contract_schedule VALUES (2, 2, 3);
INSERT INTO contract_schedule VALUES (2, 1, 4);
INSERT INTO contract_schedule VALUES (1, 2, 5);
INSERT INTO contract_schedule VALUES (3, 2, 6);
INSERT INTO contract_schedule VALUES (3, 1, 7);
INSERT INTO contract_schedule VALUES (1, 3, 8);
INSERT INTO contract_schedule VALUES (3, 6, 9);
INSERT INTO contract_schedule VALUES (2, 5, 10);

INSERT INTO driver_schedule VALUES (1, 1);
INSERT INTO driver_schedule VALUES (1, 2);
INSERT INTO driver_schedule VALUES (1, 3);
INSERT INTO driver_schedule VALUES (2, 4);
INSERT INTO driver_schedule VALUES (2, 5);
INSERT INTO driver_schedule VALUES (2, 6);
INSERT INTO driver_schedule VALUES (3, 7);
INSERT INTO driver_schedule VALUES (3, 8);
INSERT INTO driver_schedule VALUES (1, 9);
INSERT INTO driver_schedule VALUES (3, 10);

commit;