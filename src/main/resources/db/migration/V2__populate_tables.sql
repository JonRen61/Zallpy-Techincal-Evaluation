INSERT INTO user values(1, 'Administrador', 'administrador@zallpy.com', 'adminPass');
INSERT INTO user values(2, 'Programador 1', 'programador1@zallpy.com', 'prog1Pass');
INSERT INTO user values(3, 'Programador 2', 'programador2@Zallpy.com', 'prog2Pass');

INSERT INTO project values(1, 'Projeto Cliente A', 0, null);
INSERT INTO project values(2, 'Projeto Cliente B', 0, null);

-- Administrador
INSERT INTO user_project values(1, 1);
INSERT INTO user_project values(1, 2);

-- Programador 1
INSERT INTO user_project values(2, 1);

-- Programador 2
INSERT INTO user_project values(3, 1);
INSERT INTO user_project values(3, 2);