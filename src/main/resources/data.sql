drop table if exists almacenes;
CREATE TABLE almacenes (
codigo INT AUTO_INCREMENT,
lugar VARCHAR(100),
capacidad INT,
PRIMARY KEY (codigo));

drop table if exists cajas;
CREATE TABLE cajas (
num_referencia CHAR(5),
contenido NVARCHAR(100),
valor INT,
almacen INT NOT NULL REFERENCES almacenes(codigo) ON DELETE CASCADE ON UPDATE CASCADE,
PRIMARY KEY (num_referencia));

insert into almacenes (lugar, capacidad) values ('Dadoupu', 209);
insert into almacenes (lugar, capacidad) values ('Taveiro', 311);
insert into almacenes (lugar, capacidad) values ('San Jose', 945);
insert into almacenes (lugar, capacidad) values ('Batangan', 321);
insert into almacenes (lugar, capacidad) values ('Agía Varvára', 924);
insert into almacenes (lugar, capacidad) values ('Dumlan', 936);
insert into almacenes (lugar, capacidad) values ('Sauce', 445);
insert into almacenes (lugar, capacidad) values ('Santa Magdalena', 668);
insert into almacenes (lugar, capacidad) values ('Hvar', 324);
insert into almacenes (lugar, capacidad) values ('Betioky', 732);

insert into cajas (num_referencia, contenido, valor, almacen) values (6186, 'Ham - Procutinni', 1803, 9);
insert into cajas (num_referencia, contenido, valor, almacen) values (46145, 'Cake - Mini Potato Pancake', 8261, 8);
insert into cajas (num_referencia, contenido, valor, almacen) values (85925, 'Skewers - Bamboo', 2894, 4);
insert into cajas (num_referencia, contenido, valor, almacen) values (64313, 'Cocoa Butter', 8945, 10);
insert into cajas (num_referencia, contenido, valor, almacen) values (49228, 'Wine - White, Lindemans Bin 95', 4502, 9);
insert into cajas (num_referencia, contenido, valor, almacen) values (12364, 'Bagel - Whole White Sesame', 5379, 8);
insert into cajas (num_referencia, contenido, valor, almacen) values (50196, 'Praline Paste', 6568, 6);
insert into cajas (num_referencia, contenido, valor, almacen) values (54982, 'Grand Marnier', 3274, 9);
insert into cajas (num_referencia, contenido, valor, almacen) values (56423, 'Soup Campbells', 8378, 9);
insert into cajas (num_referencia, contenido, valor, almacen) values (3522, 'Sausage - Blood Pudding', 9889, 10);
insert into cajas (num_referencia, contenido, valor, almacen) values (76876, 'Chip - Potato Dill Pickle', 3581, 7);
insert into cajas (num_referencia, contenido, valor, almacen) values (40184, 'Beets - Golden', 9592, 6);
insert into cajas (num_referencia, contenido, valor, almacen) values (72888, 'Cheese - Gorgonzola', 7378, 8);
insert into cajas (num_referencia, contenido, valor, almacen) values (91072, 'Bread - Calabrese Baguette', 8696, 6);
insert into cajas (num_referencia, contenido, valor, almacen) values (79393, 'Longos - Chicken Cordon Bleu', 3519, 5);
insert into cajas (num_referencia, contenido, valor, almacen) values (28616, 'Sauce - Salsa', 6001, 5);
insert into cajas (num_referencia, contenido, valor, almacen) values (47875, 'Okra', 8198, 10);
insert into cajas (num_referencia, contenido, valor, almacen) values (51271, 'Nestea - Ice Tea, Diet', 7985, 1);
insert into cajas (num_referencia, contenido, valor, almacen) values (76993, 'Goldschalger', 6934, 7);
insert into cajas (num_referencia, contenido, valor, almacen) values (60440, 'Wine - Red, Concha Y Toro', 1194, 5);
insert into cajas (num_referencia, contenido, valor, almacen) values (80272, 'Mushroom - Oyster, Fresh', 4208, 8);
insert into cajas (num_referencia, contenido, valor, almacen) values (65146, 'Truffle Cups - Brown', 3911, 3);
insert into cajas (num_referencia, contenido, valor, almacen) values (67242, 'Pie Shell - 5', 1222, 3);
insert into cajas (num_referencia, contenido, valor, almacen) values (96413, 'Energy Drink', 2625, 8);
insert into cajas (num_referencia, contenido, valor, almacen) values (2906, 'Dragon Fruit', 6103, 10);
insert into cajas (num_referencia, contenido, valor, almacen) values (83727, 'Wine - Red, Antinori Santa', 5228, 9);
insert into cajas (num_referencia, contenido, valor, almacen) values (91876, 'Shrimp - 21/25, Peel And Deviened', 3362, 4);
insert into cajas (num_referencia, contenido, valor, almacen) values (76088, 'Bagel - Everything Presliced', 8087, 5);
insert into cajas (num_referencia, contenido, valor, almacen) values (20245, 'Nougat - Paste / Cream', 7623, 8);
insert into cajas (num_referencia, contenido, valor, almacen) values (48353, 'Beef - Sushi Flat Iron Steak', 7689, 4);
